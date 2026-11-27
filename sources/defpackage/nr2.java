package defpackage;

import sun.misc.Unsafe;
public abstract class nr2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    static {
        Unsafe unsafe = fx.a;
        a = unsafe.objectFieldOffset(nr2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(nr2.class.getDeclaredField("_prev$volatile"));
    }

    public nr2(hz9 hz9Var) {
        this._prev$volatile = hz9Var;
    }

    public final void b() {
        fx.a.putObjectVolatile(this, b, (Object) null);
    }

    public final nr2 c() {
        Object objectVolatile = fx.a.getObjectVolatile(this, a);
        if (objectVolatile == td3.a) {
            return null;
        }
        return (nr2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        nr2 nr2Var;
        nr2 nr2Var2;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = fx.a;
            long j = b;
            nr2 nr2Var3 = (nr2) unsafe2.getObjectVolatile(this, j);
            while (nr2Var3 != null && nr2Var3.d()) {
                nr2Var3 = (nr2) fx.a.getObjectVolatile(nr2Var3, j);
            }
            nr2 c2 = c();
            c2.getClass();
            do {
                nr2Var = c2;
                if (!nr2Var.d()) {
                    break;
                }
                c2 = nr2Var.c();
            } while (c2 != null);
            while (true) {
                Object objectVolatile = fx.a.getObjectVolatile(nr2Var, j);
                if (((nr2) objectVolatile) == null) {
                    nr2Var2 = null;
                } else {
                    nr2Var2 = nr2Var3;
                }
                do {
                    unsafe = fx.a;
                    if (unsafe.compareAndSwapObject(nr2Var, b, objectVolatile, nr2Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(nr2Var, j) == objectVolatile);
            }
            if (nr2Var3 != null) {
                unsafe.putObjectVolatile(nr2Var3, a, nr2Var);
            }
            if (!nr2Var.d() || nr2Var.c() == null) {
                if (nr2Var3 == null || !nr2Var3.d()) {
                    return;
                }
            }
        }
    }
}
