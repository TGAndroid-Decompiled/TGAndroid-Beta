package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9047b;
    public final int f9048c;

    public p(int i10, Method method) {
        this.f9047b = method;
        this.f9048c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9047b.invoke(null, cls, Integer.valueOf(this.f9048c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
