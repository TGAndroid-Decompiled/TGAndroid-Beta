package na;

import java.lang.reflect.Method;
public final class o extends s {
    public final Method f18560b;
    public final Object f18561c;

    public o(Method method, Object obj) {
        this.f18560b = method;
        this.f18561c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String i9 = g5.b.i(cls);
        if (i9 == null) {
            return this.f18560b.invoke(this.f18561c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(i9));
    }
}
