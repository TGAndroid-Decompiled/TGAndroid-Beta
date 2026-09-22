package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9045b;
    public final Object f9046c;

    public o(Method method, Object obj) {
        this.f9045b = method;
        this.f9046c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9045b.invoke(this.f9046c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
