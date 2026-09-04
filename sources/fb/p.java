package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9455b;
    public final int f9456c;

    public p(int i10, Method method) {
        this.f9455b = method;
        this.f9456c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.f9455b.invoke(null, cls, Integer.valueOf(this.f9456c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
