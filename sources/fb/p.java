package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9049b;
    public final int f9050c;

    public p(int i10, Method method) {
        this.f9049b = method;
        this.f9050c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9049b.invoke(null, cls, Integer.valueOf(this.f9050c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
