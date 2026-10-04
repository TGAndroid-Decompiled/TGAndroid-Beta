package fb;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f9829b;
    public final Object f9830c;

    public o(Method method, Object obj) {
        this.f9829b = method;
        this.f9830c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String t10 = of.b.t(cls);
        if (t10 == null) {
            return this.f9829b.invoke(this.f9830c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t10));
    }
}
