package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9049b;

    public q(Method method) {
        this.f9049b = method;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9049b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
