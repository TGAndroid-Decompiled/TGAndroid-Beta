package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
public abstract class t54 extends o54 implements pe3 {
    public static final long h;
    public static final long n;
    public static final long r;
    public static final int s = 0;
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    static {
        Unsafe unsafe = fy.a;
        r = unsafe.objectFieldOffset(t54.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(t54.class.getDeclaredField("_delayed$volatile"));
        n = unsafe.objectFieldOffset(t54.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override
    public xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        return ub3.a.a(j, oqbVar, cy2Var);
    }

    @Override
    public final void b(long j, vb1 vb1Var) {
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
            p54 p54Var = new p54(this, j2 + nanoTime, vb1Var);
            p(nanoTime, p54Var);
            vb1Var.v(new qb1(p54Var, (byte) 2));
        }
    }

    @Override
    public final void c(cy2 cy2Var, Runnable runnable) {
        j(runnable);
    }

    @Override
    public final long h() {
        Unsafe unsafe;
        r54 r54Var;
        t54 t54Var;
        Unsafe unsafe2;
        Runnable runnable;
        long j;
        du2 du2Var = bbd.b;
        long j2 = r;
        if (!i()) {
            k();
            loop0: while (true) {
                unsafe = fy.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                r54Var = null;
                if (objectVolatile == null) {
                    t54Var = this;
                    break;
                } else if (objectVolatile instanceof sd6) {
                    sd6 sd6Var = (sd6) objectVolatile;
                    Object d = sd6Var.d();
                    if (d != sd6.e) {
                        Runnable runnable2 = (Runnable) d;
                        t54Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    sd6 c = sd6Var.c();
                    while (true) {
                        Unsafe unsafe3 = fy.a;
                        t54Var = this;
                        if (!unsafe3.compareAndSwapObject(t54Var, r, objectVolatile, c) && unsafe3.getObjectVolatile(t54Var, j2) == objectVolatile) {
                            this = t54Var;
                        }
                    }
                    this = t54Var;
                } else {
                    t54Var = this;
                    if (objectVolatile == du2Var) {
                        break;
                    }
                    do {
                        unsafe2 = fy.a;
                        if (unsafe2.compareAndSwapObject(t54Var, r, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(t54Var, j2) == objectVolatile);
                    this = t54Var;
                }
            }
            unsafe2 = unsafe;
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            lt ltVar = t54Var.e;
            if (ltVar == null || ltVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(t54Var, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof sd6) {
                        long longVolatile = unsafe2.getLongVolatile((sd6) objectVolatile2, sd6.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == du2Var) {
                        return Long.MAX_VALUE;
                    }
                }
                s54 s54Var = (s54) unsafe.getObjectVolatile(t54Var, h);
                if (s54Var != null) {
                    synchronized (s54Var) {
                        r54[] r54VarArr = s54Var.a;
                        if (r54VarArr != null) {
                            r54Var = r54VarArr[0];
                        }
                    }
                    if (r54Var != null) {
                        long nanoTime = r54Var.a - System.nanoTime();
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
        tb3.w.j(runnable);
    }

    public final void k() {
        r54 r54Var;
        r54 r54Var2;
        boolean z;
        s54 s54Var = (s54) fy.a.getObjectVolatile(this, h);
        if (s54Var == null || s54Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (s54Var) {
                r54[] r54VarArr = s54Var.a;
                r54Var = null;
                if (r54VarArr != null) {
                    r54Var2 = r54VarArr[0];
                } else {
                    r54Var2 = null;
                }
                if (r54Var2 == null) {
                    continue;
                } else {
                    if (nanoTime - r54Var2.a >= 0) {
                        z = l(r54Var2);
                    } else {
                        z = false;
                    }
                    if (z) {
                        r54Var = s54Var.d(0);
                    }
                    continue;
                }
            }
        } while (r54Var != null);
    }

    public final boolean l(java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t54.l(java.lang.Runnable):boolean");
    }

    public abstract Thread m();

    public final boolean n() {
        boolean z;
        lt ltVar = this.e;
        if (ltVar != null) {
            z = ltVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            Unsafe unsafe = fy.a;
            s54 s54Var = (s54) unsafe.getObjectVolatile(this, h);
            if (s54Var != null && s54Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, r);
            if (objectVolatile != null) {
                if (objectVolatile instanceof sd6) {
                    long longVolatile = unsafe.getLongVolatile((sd6) objectVolatile, sd6.g);
                    if (((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == bbd.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void o(long j, r54 r54Var) {
        tb3.w.p(j, r54Var);
    }

    public final void p(long j, r54 r54Var) {
        t54 t54Var;
        int c;
        Unsafe unsafe;
        Thread m;
        long j2 = h;
        Unsafe unsafe2 = fy.a;
        if (unsafe2.getIntVolatile(this, n) != 0) {
            t54Var = this;
            c = 1;
        } else {
            s54 s54Var = (s54) unsafe2.getObjectVolatile(this, j2);
            if (s54Var == null) {
                ?? obj = new Object();
                obj.c = j;
                while (true) {
                    unsafe = fy.a;
                    t54Var = this;
                    if (unsafe.compareAndSwapObject(t54Var, h, (Object) null, (Object) obj) || unsafe.getObjectVolatile(t54Var, j2) != null) {
                        break;
                    }
                    this = t54Var;
                }
                Object objectVolatile = unsafe.getObjectVolatile(t54Var, j2);
                objectVolatile.getClass();
                s54Var = (s54) objectVolatile;
                unsafe2 = unsafe;
            } else {
                t54Var = this;
            }
            c = r54Var.c(j, s54Var, t54Var);
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    dq9.m("unexpected result");
                    return;
                }
                return;
            }
            t54Var.o(j, r54Var);
            return;
        }
        s54 s54Var2 = (s54) unsafe2.getObjectVolatile(t54Var, j2);
        r54 r54Var2 = null;
        if (s54Var2 != null) {
            synchronized (s54Var2) {
                r54[] r54VarArr = s54Var2.a;
                if (r54VarArr != null) {
                    r54Var2 = r54VarArr[0];
                }
            }
        }
        if (r54Var2 == r54Var && Thread.currentThread() != (m = t54Var.m())) {
            LockSupport.unpark(m);
        }
    }

    @Override
    public void shutdown() {
        du2 du2Var;
        Unsafe unsafe;
        r54 r54Var;
        epb.a.set(null);
        fy.a.putIntVolatile(this, n, 1);
        du2 du2Var2 = bbd.b;
        long j = r;
        loop0: while (true) {
            Object objectVolatile = fy.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                du2Var = du2Var2;
                if (objectVolatile instanceof sd6) {
                    ((sd6) objectVolatile).b();
                    break;
                } else if (objectVolatile == du2Var) {
                    break;
                } else {
                    sd6 sd6Var = new sd6(8, true);
                    sd6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = fy.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, sd6Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    du2Var2 = du2Var;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    du2Var = du2Var2;
                    if (unsafe2.compareAndSwapObject(this, r, (Object) null, du2Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) == null) {
                        du2Var2 = du2Var;
                    }
                }
                du2Var2 = du2Var;
            }
        }
        do {
        } while (h() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            s54 s54Var = (s54) fy.a.getObjectVolatile(this, h);
            if (s54Var != null) {
                synchronized (s54Var) {
                    if (s54Var.b() > 0) {
                        r54Var = s54Var.d(0);
                    } else {
                        r54Var = null;
                    }
                }
                if (r54Var != null) {
                    o(nanoTime, r54Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
