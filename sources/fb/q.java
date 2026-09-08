package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9485b;

    public q(Method method) {
        this.f9485b = method;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.f9485b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
