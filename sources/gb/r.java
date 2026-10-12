package gb;

import java.lang.reflect.Method;
public final class r extends t {
    public final Method f10076b;

    public r(Method method) {
        this.f10076b = method;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = qf.b.x(cls);
        if (x10 == null) {
            return this.f10076b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
