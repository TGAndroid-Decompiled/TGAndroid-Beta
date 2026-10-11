package fb;

import java.lang.reflect.Method;
import n4.x;
public final class o extends s {
    public final Method f9840b;
    public final Object f9841c;

    public o(Method method, Object obj) {
        this.f9840b = method;
        this.f9841c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String d = x.d(cls);
        if (d == null) {
            return this.f9840b.invoke(this.f9841c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
