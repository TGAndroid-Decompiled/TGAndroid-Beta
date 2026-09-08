package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9483b;
    public final int f9484c;

    public p(int i10, Method method) {
        this.f9483b = method;
        this.f9484c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.f9483b.invoke(null, cls, Integer.valueOf(this.f9484c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
