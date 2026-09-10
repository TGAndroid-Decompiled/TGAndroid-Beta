package fb;

import java.lang.reflect.Method;
import n4.y;
public final class q extends s {
    public final Method f7934b;

    public q(Method method) {
        this.f7934b = method;
    }

    @Override
    public final Object a(Class cls) {
        String e = y.e(cls);
        if (e == null) {
            return this.f7934b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
