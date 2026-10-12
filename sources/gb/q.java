package gb;

import java.lang.reflect.Method;
public final class q extends t {
    public final Method f10074b;
    public final int f10075c;

    public q(int i10, Method method) {
        this.f10074b = method;
        this.f10075c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String x10 = qf.b.x(cls);
        if (x10 == null) {
            return this.f10074b.invoke(null, cls, Integer.valueOf(this.f10075c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(x10));
    }
}
