package gb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f10982b;
    public final Object f10983c;

    public o(Method method, Object obj) {
        this.f10982b = method;
        this.f10983c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String y3 = qf.b.y(cls);
        if (y3 == null) {
            return this.f10982b.invoke(this.f10983c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(y3));
    }
}
