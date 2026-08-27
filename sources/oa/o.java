package oa;

import java.lang.reflect.Method;

public final class o extends r {

    public final Method f19411b;

    public final int f19412c;

    public o(int i10, Method method) {
        this.f19411b = method;
        this.f19412c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String strJ = g5.b.j(cls);
        if (strJ == null) {
            return this.f19411b.invoke(null, cls, Integer.valueOf(this.f19412c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strJ));
    }
}
