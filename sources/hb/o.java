package hb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f12758b;
    public final Object f12759c;

    public o(Method method, Object obj) {
        this.f12758b = method;
        this.f12759c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.f12758b.invoke(this.f12759c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
