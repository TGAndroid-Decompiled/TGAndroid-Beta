package na;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f18564b;

    public q(Method method) {
        this.f18564b = method;
    }

    @Override
    public final Object a(Class cls) {
        String i9 = g5.b.i(cls);
        if (i9 == null) {
            return this.f18564b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i9));
    }
}
