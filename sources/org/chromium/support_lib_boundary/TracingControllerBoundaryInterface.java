package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i10, Collection<String> collection, int i11);

    boolean stop(OutputStream outputStream, Executor executor);
}
