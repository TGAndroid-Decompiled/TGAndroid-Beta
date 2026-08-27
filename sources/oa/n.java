package oa;

import java.lang.reflect.Method;

public final class n extends r {

    public final Method f19409b;

    public final Object f19410c;

    public n(Method method, Object obj) {
        this.f19409b = method;
        this.f19410c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String strJ = g5.b.j(cls);
        if (strJ == null) {
            return this.f19409b.invoke(this.f19410c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strJ));
    }
}
