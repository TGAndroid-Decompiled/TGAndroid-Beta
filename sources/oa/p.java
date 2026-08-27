package oa;

import java.lang.reflect.Method;

public final class p extends r {

    public final Method f19413b;

    public p(Method method) {
        this.f19413b = method;
    }

    @Override
    public final Object a(Class cls) {
        String strJ = g5.b.j(cls);
        if (strJ == null) {
            return this.f19413b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strJ));
    }
}
