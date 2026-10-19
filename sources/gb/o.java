package gb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f10981b;
    public final Object f10982c;

    public o(Method method, Object obj) {
        this.f10981b = method;
        this.f10982c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String z10 = qf.b.z(cls);
        if (z10 == null) {
            return this.f10981b.invoke(this.f10982c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(z10));
    }
}
