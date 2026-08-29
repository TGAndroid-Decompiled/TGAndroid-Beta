package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler, Handler handler);
}
