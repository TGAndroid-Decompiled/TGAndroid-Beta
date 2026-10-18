package gb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f10984b;
    public final int f10985c;

    public p(int i10, Method method) {
        this.f10984b = method;
        this.f10985c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.f10984b.invoke(null, cls, Integer.valueOf(this.f10985c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
