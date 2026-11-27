package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
public final class wj7 extends k4a implements uj7 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(wj7.class, Object.class, "owner$volatile");
    public static final long i = fx.a.objectFieldOffset(wj7.class.getDeclaredField("owner$volatile"));
    private volatile Object owner$volatile = pfd.a;

    public final boolean c() {
        if (Math.max(fx.a.getIntVolatile(this, k4a.e), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(zw2 zw2Var) {
        boolean e = e();
        f9c f9cVar = f9c.a;
        if (!e) {
            va1 a = yud.a(xpe.a(zw2Var));
            try {
                a(new vj7(this, a));
                Object q = a.q();
                vx2 vx2Var = vx2.a;
                if (q != vx2Var) {
                    q = f9cVar;
                }
                if (q == vx2Var) {
                    return q;
                }
            } catch (Throwable th) {
                a.z();
                throw th;
            }
        }
        return f9cVar;
    }

    public final boolean e() {
        wj7 wj7Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = k4a.e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > 1) {
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    long j2 = k4a.e;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    if (intVolatile2 > 1) {
                        wj7 wj7Var2 = this;
                        wj7Var = wj7Var2;
                        if (!unsafe2.compareAndSwapInt(wj7Var2, j2, intVolatile2, 1)) {
                            this = wj7Var;
                        }
                    } else {
                        wj7Var = this;
                        break;
                    }
                }
            } else {
                wj7Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(wj7Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(wj7Var, i, (Object) null);
                    return true;
                }
            }
            this = wj7Var;
        }
    }

    public final void f(Object obj) {
        while (this.c()) {
            Unsafe unsafe = fx.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ow5 ow5Var = pfd.a;
            if (objectVolatile != ow5Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    wj7 wj7Var = this;
                    if (unsafe2.compareAndSwapObject(wj7Var, i, objectVolatile, ow5Var)) {
                        wj7Var.b();
                        return;
                    } else if (unsafe2.getObjectVolatile(wj7Var, j) != objectVolatile) {
                        this = wj7Var;
                        break;
                    } else {
                        this = wj7Var;
                    }
                }
            }
        }
        grb.i("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + l93.a(this) + "[isLocked=" + c() + ",owner=" + fx.a.getObjectVolatile(this, i) + ']';
    }
}
