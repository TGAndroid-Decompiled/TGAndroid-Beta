package ee;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
public abstract class c {
    public static final Method f8158a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f8158a = method;
    }
}
