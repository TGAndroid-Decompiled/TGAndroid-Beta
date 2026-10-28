package hb;

import java.lang.reflect.Method;
public final class p extends s {
    public final Method f12759b;
    public final int f12760c;

    public p(int i10, Method method) {
        this.f12759b = method;
        this.f12760c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String F = rf.b.F(cls);
        if (F == null) {
            return this.f12759b.invoke(null, cls, Integer.valueOf(this.f12760c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(F));
    }
}
