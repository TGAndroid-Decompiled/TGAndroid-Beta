package fb;

import java.lang.reflect.Method;
import n4.y;
public final class p extends t {
    public final Method f9839b;
    public final Object f9840c;

    public p(Method method, Object obj) {
        this.f9839b = method;
        this.f9840c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String d = y.d(cls);
        if (d == null) {
            return this.f9839b.invoke(this.f9840c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
