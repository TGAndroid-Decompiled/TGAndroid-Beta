package na;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f18562b;
    public final int f18563c;

    public p(int i9, Method method) {
        this.f18562b = method;
        this.f18563c = i9;
    }

    @Override
    public final Object a(Class cls) {
        String i9 = g5.b.i(cls);
        if (i9 == null) {
            return this.f18562b.invoke(null, cls, Integer.valueOf(this.f18563c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i9));
    }
}
