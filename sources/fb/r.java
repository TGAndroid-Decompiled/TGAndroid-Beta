package fb;

import java.lang.reflect.Method;
public final class r extends t {
    public final Method f9052b;

    public r(Method method) {
        this.f9052b = method;
    }

    @Override
    public final Object a(Class cls) {
        String J = of.b.J(cls);
        if (J == null) {
            return this.f9052b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(J));
    }
}
