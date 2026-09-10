package fb;

import java.lang.reflect.Method;
import n4.y;
public final class o extends s {
    public final Method f7930b;
    public final Object f7931c;

    public o(Method method, Object obj) {
        this.f7930b = method;
        this.f7931c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String e = y.e(cls);
        if (e == null) {
            return this.f7930b.invoke(this.f7931c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
