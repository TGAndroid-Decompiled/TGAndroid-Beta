package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9043b;
    public final Object f9044c;

    public o(Method method, Object obj) {
        this.f9043b = method;
        this.f9044c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String E = of.b.E(cls);
        if (E == null) {
            return this.f9043b.invoke(this.f9044c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(E));
    }
}
