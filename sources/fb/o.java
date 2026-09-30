package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9030b;
    public final Object f9031c;

    public o(Method method, Object obj) {
        this.f9030b = method;
        this.f9031c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9030b.invoke(this.f9031c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
