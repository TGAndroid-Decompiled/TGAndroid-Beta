package gb;

import java.lang.reflect.Method;
public final class p extends t {
    public final Method f10072b;
    public final Object f10073c;

    public p(Method method, Object obj) {
        this.f10072b = method;
        this.f10073c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = qf.b.x(cls);
        if (x10 == null) {
            return this.f10072b.invoke(this.f10073c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
