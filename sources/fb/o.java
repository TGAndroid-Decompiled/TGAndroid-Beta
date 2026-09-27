package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9033b;
    public final Object f9034c;

    public o(Method method, Object obj) {
        this.f9033b = method;
        this.f9034c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9033b.invoke(this.f9034c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
