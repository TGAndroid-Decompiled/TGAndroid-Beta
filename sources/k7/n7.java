package k7;

import java.lang.reflect.Method;
public abstract class n7 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = zc.a.f47465a;
            if (num != null && num.intValue() < 19) {
                Method method = yc.a.f47249a;
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
