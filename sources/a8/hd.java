package a8;

import java.lang.reflect.Method;
public abstract class hd {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.i.e(th2, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = qd.a.f47028a;
            if (num != null && num.intValue() < 19) {
                Method method = pd.a.f46832a;
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
