/**
 *
 * Copyright (C) 2009 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.rimuhosting.miro;

import org.jclouds.concurrent.Timeout;
import org.jclouds.rimuhosting.miro.domain.*;

import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;

/**
 * Provides synchronous access to RimuHosting.
 * <p/>
 *
 * @author Ivan Meredith 
 * @see RimuHostingAsyncClient
 * @see <a href="TODO: insert URL of client documentation" />
 */
@Timeout(duration = 40, timeUnit = TimeUnit.MINUTES)
public interface RimuHostingClient {

   SortedSet<Image> getImageList();

   SortedSet<Server> getServerList();

   SortedSet<PricingPlan> getPricingPlanList();

   NewServerResponse createServer(String name, String imageId, String planId);
   
   NewServerResponse createServer(String name, String imageId, String planId, String password);

   Server getServer(Long id);
   
   ServerInfo restartServer(Long id);
   
   List<String> destroyServer(Long id);
}
