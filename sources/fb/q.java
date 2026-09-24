package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9034b;

    public q(Method method) {
        this.f9034b = method;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9034b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
