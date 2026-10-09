package fb;

import java.lang.reflect.Method;
import n4.x;
public final class p extends s {
    public final Method f9843b;
    public final int f9844c;

    public p(int i10, Method method) {
        this.f9843b = method;
        this.f9844c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String q6 = x.q(cls);
        if (q6 == null) {
            return this.f9843b.invoke(null, cls, Integer.valueOf(this.f9844c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(q6));
    }
}
