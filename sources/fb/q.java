package fb;

import java.lang.reflect.Method;
public final class q extends t {
    public final Method f9050b;
    public final int f9051c;

    public q(int i10, Method method) {
        this.f9050b = method;
        this.f9051c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String J = of.b.J(cls);
        if (J == null) {
            return this.f9050b.invoke(null, cls, Integer.valueOf(this.f9051c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(J));
    }
}
