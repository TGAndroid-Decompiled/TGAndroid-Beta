package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9831b;
    public final int f9832c;

    public p(int i10, Method method) {
        this.f9831b = method;
        this.f9832c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String t10 = of.b.t(cls);
        if (t10 == null) {
            return this.f9831b.invoke(null, cls, Integer.valueOf(this.f9832c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t10));
    }
}
