package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9031b;
    public final Object f9032c;

    public o(Method method, Object obj) {
        this.f9031b = method;
        this.f9032c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9031b.invoke(this.f9032c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
