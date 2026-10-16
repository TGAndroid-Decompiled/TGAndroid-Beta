package gb;

import java.lang.reflect.Method;
public final class s extends u {
    public final Method f10080b;

    public s(Method method) {
        this.f10080b = method;
    }

    @Override
    public final Object a(Class cls) {
        String w9 = qf.b.w(cls);
        if (w9 == null) {
            return this.f10080b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(w9));
    }
}
