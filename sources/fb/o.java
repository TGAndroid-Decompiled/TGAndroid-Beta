package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9453b;
    public final Object f9454c;

    public o(Method method, Object obj) {
        this.f9453b = method;
        this.f9454c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.f9453b.invoke(this.f9454c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
