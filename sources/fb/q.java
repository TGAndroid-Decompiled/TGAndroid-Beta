package fb;

import java.lang.reflect.Method;
import n4.y;
public final class q extends t {
    public final Method f9841b;
    public final int f9842c;

    public q(int i10, Method method) {
        this.f9841b = method;
        this.f9842c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String d = y.d(cls);
        if (d == null) {
            return this.f9841b.invoke(null, cls, Integer.valueOf(this.f9842c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
