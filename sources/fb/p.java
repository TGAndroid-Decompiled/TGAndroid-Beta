package fb;

import java.lang.reflect.Method;
import n4.x;
public final class p extends s {
    public final Method f9842b;
    public final int f9843c;

    public p(int i10, Method method) {
        this.f9842b = method;
        this.f9843c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String d = x.d(cls);
        if (d == null) {
            return this.f9842b.invoke(null, cls, Integer.valueOf(this.f9843c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(d));
    }
}
