package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
public interface ServiceWorkerControllerBoundaryInterface {
    InvocationHandler getServiceWorkerWebSettings();

    void setServiceWorkerClient(InvocationHandler invocationHandler);
}
