package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
public abstract class e54 extends z44 implements vd3 {
    public static final long h;
    public static final long n;
    public static final long r;
    public static final int s = 0;
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    static {
        Unsafe unsafe = fx.a;
        r = unsafe.objectFieldOffset(e54.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(e54.class.getDeclaredField("_delayed$volatile"));
        n = unsafe.objectFieldOffset(e54.class.getDeclaredField("_isCompleted$volatile"));
    }

    public ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        return bb3.a.a(j, nsbVar, mx2Var);
    }

    @Override
    public final void b(long j, va1 va1Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a54 a54Var = new a54(this, j2 + nanoTime, va1Var);
            p(nanoTime, a54Var);
            va1Var.v(new qa1(a54Var, (byte) 2));
        }
    }

    @Override
    public final void c(mx2 mx2Var, Runnable runnable) {
        j(runnable);
    }

    @Override
    public final long h() {
        Unsafe unsafe;
        c54 c54Var;
        e54 e54Var;
        Unsafe unsafe2;
        Runnable runnable;
        long j;
        ow5 ow5Var = sdd.b;
        long j2 = r;
        if (!i()) {
            k();
            loop0: while (true) {
                unsafe = fx.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                c54Var = null;
                if (objectVolatile == null) {
                    e54Var = this;
                    break;
                } else if (objectVolatile instanceof xd6) {
                    xd6 xd6Var = (xd6) objectVolatile;
                    Object d = xd6Var.d();
                    if (d != xd6.e) {
                        Runnable runnable2 = (Runnable) d;
                        e54Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    xd6 c = xd6Var.c();
                    while (true) {
                        Unsafe unsafe3 = fx.a;
                        e54Var = this;
                        if (!unsafe3.compareAndSwapObject(e54Var, r, objectVolatile, c) && unsafe3.getObjectVolatile(e54Var, j2) == objectVolatile) {
                            this = e54Var;
                        }
                    }
                    this = e54Var;
                } else {
                    e54Var = this;
                    if (objectVolatile == ow5Var) {
                        break;
                    }
                    do {
                        unsafe2 = fx.a;
                        if (unsafe2.compareAndSwapObject(e54Var, r, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(e54Var, j2) == objectVolatile);
                    this = e54Var;
                }
            }
            unsafe2 = unsafe;
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ls lsVar = e54Var.e;
            if (lsVar == null || lsVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(e54Var, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof xd6) {
                        long longVolatile = unsafe2.getLongVolatile((xd6) objectVolatile2, xd6.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == ow5Var) {
                        return Long.MAX_VALUE;
                    }
                }
                d54 d54Var = (d54) unsafe.getObjectVolatile(e54Var, h);
                if (d54Var != null) {
                    synchronized (d54Var) {
                        c54[] c54VarArr = d54Var.a;
                        if (c54VarArr != null) {
                            c54Var = c54VarArr[0];
                        }
                    }
                    if (c54Var != null) {
                        long nanoTime = c54Var.a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void j(Runnable runnable) {
        k();
        if (l(runnable)) {
            Thread m = m();
            if (Thread.currentThread() != m) {
                LockSupport.unpark(m);
                return;
            }
            return;
        }
        ab3.w.j(runnable);
    }

    public final void k() {
        c54 c54Var;
        c54 c54Var2;
        boolean z;
        d54 d54Var = (d54) fx.a.getObjectVolatile(this, h);
        if (d54Var == null || d54Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (d54Var) {
                c54[] c54VarArr = d54Var.a;
                c54Var = null;
                if (c54VarArr != null) {
                    c54Var2 = c54VarArr[0];
                } else {
                    c54Var2 = null;
                }
                if (c54Var2 == null) {
                    continue;
                } else {
                    if (nanoTime - c54Var2.a >= 0) {
                        z = l(c54Var2);
                    } else {
                        z = false;
                    }
                    if (z) {
                        c54Var = d54Var.d(0);
                    }
                    continue;
                }
            }
        } while (c54Var != null);
    }

    public final boolean l(java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e54.l(java.lang.Runnable):boolean");
    }

    public abstract Thread m();

    public final boolean n() {
        boolean z;
        ls lsVar = this.e;
        if (lsVar != null) {
            z = lsVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            Unsafe unsafe = fx.a;
            d54 d54Var = (d54) unsafe.getObjectVolatile(this, h);
            if (d54Var != null && d54Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, r);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xd6) {
                    long longVolatile = unsafe.getLongVolatile((xd6) objectVolatile, xd6.g);
                    if (((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == sdd.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void o(long j, c54 c54Var) {
        ab3.w.p(j, c54Var);
    }

    public final void p(long j, c54 c54Var) {
        e54 e54Var;
        int c;
        Unsafe unsafe;
        Thread m;
        long j2 = h;
        Unsafe unsafe2 = fx.a;
        if (unsafe2.getIntVolatile(this, n) != 0) {
            e54Var = this;
            c = 1;
        } else {
            d54 d54Var = (d54) unsafe2.getObjectVolatile(this, j2);
            if (d54Var == null) {
                ?? obj = new Object();
                obj.c = j;
                while (true) {
                    unsafe = fx.a;
                    e54Var = this;
                    if (unsafe.compareAndSwapObject(e54Var, h, (Object) null, (Object) obj) || unsafe.getObjectVolatile(e54Var, j2) != null) {
                        break;
                    }
                    this = e54Var;
                }
                Object objectVolatile = unsafe.getObjectVolatile(e54Var, j2);
                objectVolatile.getClass();
                d54Var = (d54) objectVolatile;
                unsafe2 = unsafe;
            } else {
                e54Var = this;
            }
            c = c54Var.c(j, d54Var, e54Var);
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    grb.i("unexpected result");
                    return;
                }
                return;
            }
            e54Var.o(j, c54Var);
            return;
        }
        d54 d54Var2 = (d54) unsafe2.getObjectVolatile(e54Var, j2);
        c54 c54Var2 = null;
        if (d54Var2 != null) {
            synchronized (d54Var2) {
                c54[] c54VarArr = d54Var2.a;
                if (c54VarArr != null) {
                    c54Var2 = c54VarArr[0];
                }
            }
        }
        if (c54Var2 == c54Var && Thread.currentThread() != (m = e54Var.m())) {
            LockSupport.unpark(m);
        }
    }

    @Override
    public void shutdown() {
        ow5 ow5Var;
        Unsafe unsafe;
        c54 c54Var;
        crb.a.set(null);
        fx.a.putIntVolatile(this, n, 1);
        ow5 ow5Var2 = sdd.b;
        long j = r;
        loop0: while (true) {
            Object objectVolatile = fx.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                ow5Var = ow5Var2;
                if (objectVolatile instanceof xd6) {
                    ((xd6) objectVolatile).b();
                    break;
                } else if (objectVolatile == ow5Var) {
                    break;
                } else {
                    xd6 xd6Var = new xd6(8, true);
                    xd6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, xd6Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    ow5Var2 = ow5Var;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    ow5Var = ow5Var2;
                    if (unsafe2.compareAndSwapObject(this, r, (Object) null, ow5Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) == null) {
                        ow5Var2 = ow5Var;
                    }
                }
                ow5Var2 = ow5Var;
            }
        }
        do {
        } while (h() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d54 d54Var = (d54) fx.a.getObjectVolatile(this, h);
            if (d54Var != null) {
                synchronized (d54Var) {
                    if (d54Var.b() > 0) {
                        c54Var = d54Var.d(0);
                    } else {
                        c54Var = null;
                    }
                }
                if (c54Var != null) {
                    o(nanoTime, c54Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
