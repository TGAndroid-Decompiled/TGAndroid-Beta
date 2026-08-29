package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
