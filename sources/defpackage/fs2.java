package defpackage;

import sun.misc.Unsafe;
public abstract class fs2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    static {
        Unsafe unsafe = fy.a;
        a = unsafe.objectFieldOffset(fs2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(fs2.class.getDeclaredField("_prev$volatile"));
    }

    public fs2(qx9 qx9Var) {
        this._prev$volatile = qx9Var;
    }

    public final void b() {
        fy.a.putObjectVolatile(this, b, (Object) null);
    }

    public final fs2 c() {
        Object objectVolatile = fy.a.getObjectVolatile(this, a);
        if (objectVolatile == ne3.a) {
            return null;
        }
        return (fs2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        fs2 fs2Var;
        fs2 fs2Var2;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = fy.a;
            long j = b;
            fs2 fs2Var3 = (fs2) unsafe2.getObjectVolatile(this, j);
            while (fs2Var3 != null && fs2Var3.d()) {
                fs2Var3 = (fs2) fy.a.getObjectVolatile(fs2Var3, j);
            }
            fs2 c2 = c();
            c2.getClass();
            do {
                fs2Var = c2;
                if (!fs2Var.d()) {
                    break;
                }
                c2 = fs2Var.c();
            } while (c2 != null);
            while (true) {
                Object objectVolatile = fy.a.getObjectVolatile(fs2Var, j);
                if (((fs2) objectVolatile) == null) {
                    fs2Var2 = null;
                } else {
                    fs2Var2 = fs2Var3;
                }
                do {
                    unsafe = fy.a;
                    if (unsafe.compareAndSwapObject(fs2Var, b, objectVolatile, fs2Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(fs2Var, j) == objectVolatile);
            }
            if (fs2Var3 != null) {
                unsafe.putObjectVolatile(fs2Var3, a, fs2Var);
            }
            if (!fs2Var.d() || fs2Var.c() == null) {
                if (fs2Var3 == null || !fs2Var3.d()) {
                    return;
                }
            }
        }
    }
}
