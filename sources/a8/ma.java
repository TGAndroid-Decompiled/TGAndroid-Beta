package a8;

import java.lang.reflect.Method;
public abstract class ma {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.f21106a;
            if (num != null && num.intValue() < 19) {
                Method method = md.a.f20603a;
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
