package fb;

import java.lang.reflect.Method;
import n4.y;
public final class p extends s {
    public final Method f7932b;
    public final int f7933c;

    public p(int i10, Method method) {
        this.f7932b = method;
        this.f7933c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String e = y.e(cls);
        if (e == null) {
            return this.f7932b.invoke(null, cls, Integer.valueOf(this.f7933c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
