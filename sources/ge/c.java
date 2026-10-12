package ge;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
public abstract class c {
    public static final Method f10109a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f10109a = method;
    }
}
