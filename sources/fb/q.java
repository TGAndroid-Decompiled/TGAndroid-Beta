package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9834b;

    public q(Method method) {
        this.f9834b = method;
    }

    @Override
    public final Object a(Class cls) {
        String u10 = of.b.u(cls);
        if (u10 == null) {
            return this.f9834b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(u10));
    }
}
