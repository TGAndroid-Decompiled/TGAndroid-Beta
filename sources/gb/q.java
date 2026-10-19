package gb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f10983b;

    public q(Method method) {
        this.f10983b = method;
    }

    @Override
    public final Object a(Class cls) {
        String z10 = qf.b.z(cls);
        if (z10 == null) {
            return this.f10983b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(z10));
    }
}
