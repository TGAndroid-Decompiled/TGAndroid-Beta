package gb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f11000b;
    public final int f11001c;

    public p(int i10, Method method) {
        this.f11000b = method;
        this.f11001c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.f11000b.invoke(null, cls, Integer.valueOf(this.f11001c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
