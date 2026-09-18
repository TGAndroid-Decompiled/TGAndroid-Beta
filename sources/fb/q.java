package fb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f9051b;

    public q(Method method) {
        this.f9051b = method;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9051b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
