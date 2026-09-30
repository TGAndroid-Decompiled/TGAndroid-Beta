package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9032b;
    public final int f9033c;

    public p(int i10, Method method) {
        this.f9032b = method;
        this.f9033c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9032b.invoke(null, cls, Integer.valueOf(this.f9033c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
