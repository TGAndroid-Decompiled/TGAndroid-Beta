package defpackage;

import sun.misc.Unsafe;
public abstract class uq2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    static {
        Unsafe unsafe = ex.a;
        a = unsafe.objectFieldOffset(uq2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(uq2.class.getDeclaredField("_prev$volatile"));
    }

    public uq2(nv9 nv9Var) {
        this._prev$volatile = nv9Var;
    }

    public final void b() {
        ex.a.putObjectVolatile(this, b, (Object) null);
    }

    public final uq2 c() {
        Object objectVolatile = ex.a.getObjectVolatile(this, a);
        if (objectVolatile == bd3.a) {
            return null;
        }
        return (uq2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        uq2 uq2Var;
        uq2 uq2Var2;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = ex.a;
            long j = b;
            uq2 uq2Var3 = (uq2) unsafe2.getObjectVolatile(this, j);
            while (uq2Var3 != null && uq2Var3.d()) {
                uq2Var3 = (uq2) ex.a.getObjectVolatile(uq2Var3, j);
            }
            uq2 c2 = c();
            c2.getClass();
            do {
                uq2Var = c2;
                if (!uq2Var.d()) {
                    break;
                }
                c2 = uq2Var.c();
            } while (c2 != null);
            while (true) {
                Object objectVolatile = ex.a.getObjectVolatile(uq2Var, j);
                if (((uq2) objectVolatile) == null) {
                    uq2Var2 = null;
                } else {
                    uq2Var2 = uq2Var3;
                }
                do {
                    unsafe = ex.a;
                    if (unsafe.compareAndSwapObject(uq2Var, b, objectVolatile, uq2Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(uq2Var, j) == objectVolatile);
            }
            if (uq2Var3 != null) {
                unsafe.putObjectVolatile(uq2Var3, a, uq2Var);
            }
            if (!uq2Var.d() || uq2Var.c() == null) {
                if (uq2Var3 == null || !uq2Var3.d()) {
                    return;
                }
            }
        }
    }
}
