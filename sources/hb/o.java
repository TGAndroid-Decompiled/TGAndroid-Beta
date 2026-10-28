package hb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f12757b;
    public final Object f12758c;

    public o(Method method, Object obj) {
        this.f12757b = method;
        this.f12758c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.f12757b.invoke(this.f12758c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
