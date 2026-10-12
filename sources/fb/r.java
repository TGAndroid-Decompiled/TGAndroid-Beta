package fb;

import java.lang.reflect.Method;
import n4.y;
public final class r extends t {
    public final Method f9843b;

    public r(Method method) {
        this.f9843b = method;
    }

    @Override
    public final Object a(Class cls) {
        String d = y.d(cls);
        if (d == null) {
            return this.f9843b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
