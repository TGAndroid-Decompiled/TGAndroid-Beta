package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9830b;
    public final Object f9831c;

    public o(Method method, Object obj) {
        this.f9830b = method;
        this.f9831c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String u10 = of.b.u(cls);
        if (u10 == null) {
            return this.f9830b.invoke(this.f9831c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(u10));
    }
}
