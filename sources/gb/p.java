package gb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f10981b;
    public final int f10982c;

    public p(int i10, Method method) {
        this.f10981b = method;
        this.f10982c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String z10 = qf.b.z(cls);
        if (z10 == null) {
            return this.f10981b.invoke(null, cls, Integer.valueOf(this.f10982c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(z10));
    }
}
