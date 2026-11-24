package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
public final class nh7 extends r0a implements lh7 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(nh7.class, Object.class, "owner$volatile");
    public static final long i = ex.a.objectFieldOffset(nh7.class.getDeclaredField("owner$volatile"));
    private volatile Object owner$volatile = wad.a;

    public final boolean c() {
        if (Math.max(ex.a.getIntVolatile(this, r0a.e), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(fw2 fw2Var) {
        boolean e = e();
        g5c g5cVar = g5c.a;
        if (!e) {
            na1 a = iqd.a(dle.a(fw2Var));
            try {
                a(new mh7(this, a));
                Object q = a.q();
                bx2 bx2Var = bx2.a;
                if (q != bx2Var) {
                    q = g5cVar;
                }
                if (q == bx2Var) {
                    return q;
                }
            } catch (Throwable th) {
                a.z();
                throw th;
            }
        }
        return g5cVar;
    }

    public final boolean e() {
        nh7 nh7Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = r0a.e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > 1) {
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    long j2 = r0a.e;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    if (intVolatile2 > 1) {
                        nh7 nh7Var2 = this;
                        nh7Var = nh7Var2;
                        if (!unsafe2.compareAndSwapInt(nh7Var2, j2, intVolatile2, 1)) {
                            this = nh7Var;
                        }
                    } else {
                        nh7Var = this;
                        break;
                    }
                }
            } else {
                nh7Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(nh7Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(nh7Var, i, (Object) null);
                    return true;
                }
            }
            this = nh7Var;
        }
    }

    public final void f(Object obj) {
        while (this.c()) {
            Unsafe unsafe = ex.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            lo5 lo5Var = wad.a;
            if (objectVolatile != lo5Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    nh7 nh7Var = this;
                    if (unsafe2.compareAndSwapObject(nh7Var, i, objectVolatile, lo5Var)) {
                        nh7Var.b();
                        return;
                    } else if (unsafe2.getObjectVolatile(nh7Var, j) != objectVolatile) {
                        this = nh7Var;
                        break;
                    } else {
                        this = nh7Var;
                    }
                }
            }
        }
        sc8.j("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + s83.a(this) + "[isLocked=" + c() + ",owner=" + ex.a.getObjectVolatile(this, i) + ']';
    }
}
