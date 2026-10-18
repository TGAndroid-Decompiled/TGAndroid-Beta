package gb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f10982b;
    public final int f10983c;

    public p(int i10, Method method) {
        this.f10982b = method;
        this.f10983c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.f10982b.invoke(null, cls, Integer.valueOf(this.f10983c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
