package gb;

import java.lang.reflect.Method;
public final class r extends u {
    public final Method f10078b;
    public final int f10079c;

    public r(int i10, Method method) {
        this.f10078b = method;
        this.f10079c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String w9 = qf.b.w(cls);
        if (w9 == null) {
            return this.f10078b.invoke(null, cls, Integer.valueOf(this.f10079c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(w9));
    }
}
