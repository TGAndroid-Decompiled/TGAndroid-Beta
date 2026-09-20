package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9052b;

    public q(Method method) {
        this.f9052b = method;
    }

    @Override
    public final Object a(Class cls) {
        String L = of.b.L(cls);
        if (L == null) {
            return this.f9052b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(L));
    }
}
