package fb;

import java.lang.reflect.Method;
import n4.x;
public final class q extends s {
    public final Method f9844b;

    public q(Method method) {
        this.f9844b = method;
    }

    @Override
    public final Object a(Class cls) {
        String d = x.d(cls);
        if (d == null) {
            return this.f9844b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
