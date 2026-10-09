package fb;

import java.lang.reflect.Method;
import n4.x;
public final class o extends s {
    public final Method f9841b;
    public final Object f9842c;

    public o(Method method, Object obj) {
        this.f9841b = method;
        this.f9842c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String q6 = x.q(cls);
        if (q6 == null) {
            return this.f9841b.invoke(this.f9842c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(q6));
    }
}
