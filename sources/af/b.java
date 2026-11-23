package af;

import g9.t;
import g9.u;
import g9.v;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static t b(t tVar) {
        if (!(tVar instanceof v)) {
            if (tVar instanceof u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new u(tVar);
            }
            return new v(tVar);
        }
        return tVar;
    }
}
