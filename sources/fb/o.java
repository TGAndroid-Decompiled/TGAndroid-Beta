package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9047b;
    public final Object f9048c;

    public o(Method method, Object obj) {
        this.f9047b = method;
        this.f9048c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9047b.invoke(this.f9048c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
