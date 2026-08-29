package org.chromium.support_lib_boundary;

import java.util.List;
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
