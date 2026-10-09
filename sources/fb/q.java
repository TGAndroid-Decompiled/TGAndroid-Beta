package fb;

import java.lang.reflect.Method;
import n4.x;
public final class q extends s {
    public final Method f9845b;

    public q(Method method) {
        this.f9845b = method;
    }

    @Override
    public final Object a(Class cls) {
        String q6 = x.q(cls);
        if (q6 == null) {
            return this.f9845b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(q6));
    }
}
