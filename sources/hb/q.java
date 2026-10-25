package hb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f12762b;

    public q(Method method) {
        this.f12762b = method;
    }

    @Override
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.f12762b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
