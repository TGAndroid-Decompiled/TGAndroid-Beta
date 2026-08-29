package od;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
public abstract class c {
    public static final Method f19507a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f19507a = method;
    }
}
