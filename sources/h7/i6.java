package h7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class i6 {
    public static void a(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.j.e(th, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th != exception) {
            Integer num = wc.a.f49287a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = vc.a.f48874a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }
}
