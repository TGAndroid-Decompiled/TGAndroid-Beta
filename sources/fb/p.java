package fb;

import java.lang.reflect.Method;
public final class p extends t {
    public final Method f9048b;
    public final Object f9049c;

    public p(Method method, Object obj) {
        this.f9048b = method;
        this.f9049c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String J = of.b.J(cls);
        if (J == null) {
            return this.f9048b.invoke(this.f9049c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(J));
    }
}
