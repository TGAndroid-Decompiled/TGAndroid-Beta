package org.chromium.support_lib_boundary;
public interface SpeculativeLoadingConfigBoundaryInterface {
    int getMaxPrefetches();

    int getMaxPrerenders();

    int getPrefetchTTLSeconds();
}
