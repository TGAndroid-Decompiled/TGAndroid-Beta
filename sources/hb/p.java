package hb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f12760b;
    public final int f12761c;

    public p(int i10, Method method) {
        this.f12760b = method;
        this.f12761c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.f12760b.invoke(null, cls, Integer.valueOf(this.f12761c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
