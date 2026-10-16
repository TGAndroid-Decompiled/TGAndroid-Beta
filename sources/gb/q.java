package gb;

import java.lang.reflect.Method;
public final class q extends u {
    public final Method f10076b;
    public final Object f10077c;

    public q(Method method, Object obj) {
        this.f10076b = method;
        this.f10077c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String w9 = qf.b.w(cls);
        if (w9 == null) {
            return this.f10076b.invoke(this.f10077c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(w9));
    }
}
