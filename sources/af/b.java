package af;

import gd.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.j;
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final f b(Throwable exception) {
        j.e(exception, "exception");
        return new f(exception);
    }

    public static final void c(Object obj) {
        if (!(obj instanceof f)) {
            return;
        }
        throw ((f) obj).f13822a;
    }
}
