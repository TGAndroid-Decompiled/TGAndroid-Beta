package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9035b;
    public final int f9036c;

    public p(int i10, Method method) {
        this.f9035b = method;
        this.f9036c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9035b.invoke(null, cls, Integer.valueOf(this.f9036c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
