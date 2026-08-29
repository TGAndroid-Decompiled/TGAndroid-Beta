package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
public interface WebMessageCallbackBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2);
}
