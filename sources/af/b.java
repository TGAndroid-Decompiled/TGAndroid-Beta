package af;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.j;
public abstract class b {
    public static void a(Throwable th2, Throwable exception) {
        j.e(th2, "<this>");
        j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.f21498a;
            if (num != null && num.intValue() < 19) {
                Method method = md.a.f20995a;
                if (method != null) {
                    method.invoke(th2, exception);
                    return;
                }
                return;
            }
            th2.addSuppressed(exception);
        }
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
