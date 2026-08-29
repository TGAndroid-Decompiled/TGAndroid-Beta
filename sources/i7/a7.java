package i7;

import java.lang.reflect.Method;
public abstract class a7 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = xc.a.f50115a;
            if (num != null && num.intValue() < 19) {
                Method method = wc.a.f49849a;
                if (method != null) {
                    method.invoke(th2, exception);
                    return;
                }
                return;
            }
            th2.addSuppressed(exception);
        }
    }
}
