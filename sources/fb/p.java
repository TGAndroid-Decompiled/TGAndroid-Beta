package fb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f9044b;
    public final int f9045c;

    public p(int i10, Method method) {
        this.f9044b = method;
        this.f9045c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9044b.invoke(null, cls, Integer.valueOf(this.f9045c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
