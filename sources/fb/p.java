package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9045b;
    public final int f9046c;

    public p(int i10, Method method) {
        this.f9045b = method;
        this.f9046c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9045b.invoke(null, cls, Integer.valueOf(this.f9046c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
