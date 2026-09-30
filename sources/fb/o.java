package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9042b;
    public final Object f9043c;

    public o(Method method, Object obj) {
        this.f9042b = method;
        this.f9043c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String D = of.b.D(cls);
        if (D == null) {
            return this.f9042b.invoke(this.f9043c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(D));
    }
}
