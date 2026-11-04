package b8;

import java.lang.reflect.Method;
public abstract class gb {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = kd.a.f16913a;
            if (num != null && num.intValue() < 19) {
                Method method = jd.a.f16238a;
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
