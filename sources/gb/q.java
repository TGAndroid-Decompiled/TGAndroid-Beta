package gb;

import java.lang.reflect.Method;
public final class q extends s {
    public final Method f10986b;

    public q(Method method) {
        this.f10986b = method;
    }

    @Override
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.f10986b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
