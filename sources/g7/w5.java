package g7;

import java.lang.reflect.Method;
public abstract class w5 {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = vc.a.f48376a;
            if (num != null && num.intValue() < 19) {
                Method method = uc.a.f48189a;
                if (method != null) {
                    method.invoke(th, exception);
                    return;
                }
                return;
            }
            th.addSuppressed(exception);
        }
    }
}
