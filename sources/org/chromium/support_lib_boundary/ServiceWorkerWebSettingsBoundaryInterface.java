package org.chromium.support_lib_boundary;

import java.util.Set;
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z9);

    void setAllowFileAccess(boolean z9);

    void setBlockNetworkLoads(boolean z9);

    void setCacheMode(int i7);

    void setIncludeCookiesOnIntercept(boolean z9);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
