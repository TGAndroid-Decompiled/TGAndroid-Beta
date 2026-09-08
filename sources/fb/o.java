package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9481b;
    public final Object f9482c;

    public o(Method method, Object obj) {
        this.f9481b = method;
        this.f9482c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = pf.b.x(cls);
        if (x10 == null) {
            return this.f9481b.invoke(this.f9482c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
