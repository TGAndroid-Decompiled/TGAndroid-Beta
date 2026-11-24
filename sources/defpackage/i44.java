package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
public abstract class i44 extends d44 implements dd3 {
    public static final long h;
    public static final long n;
    public static final long r;
    public static final int s = 0;
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    static {
        Unsafe unsafe = ex.a;
        r = unsafe.objectFieldOffset(i44.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(i44.class.getDeclaredField("_delayed$volatile"));
        n = unsafe.objectFieldOffset(i44.class.getDeclaredField("_isCompleted$volatile"));
    }

    public no3 a(long j, nob nobVar, sw2 sw2Var) {
        return ia3.a.a(j, nobVar, sw2Var);
    }

    @Override
    public final void b(long j, na1 na1Var) {
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
            e44 e44Var = new e44(this, j2 + nanoTime, na1Var);
            p(nanoTime, e44Var);
            na1Var.v(new ia1(e44Var, (byte) 2));
        }
    }

    @Override
    public final void c(sw2 sw2Var, Runnable runnable) {
        j(runnable);
    }

    @Override
    public final long h() {
        Unsafe unsafe;
        g44 g44Var;
        i44 i44Var;
        Unsafe unsafe2;
        Runnable runnable;
        long j;
        lo5 lo5Var = z8d.b;
        long j2 = r;
        if (!i()) {
            k();
            loop0: while (true) {
                unsafe = ex.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                g44Var = null;
                if (objectVolatile == null) {
                    i44Var = this;
                    break;
                } else if (objectVolatile instanceof tb6) {
                    tb6 tb6Var = (tb6) objectVolatile;
                    Object d = tb6Var.d();
                    if (d != tb6.e) {
                        Runnable runnable2 = (Runnable) d;
                        i44Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    tb6 c = tb6Var.c();
                    while (true) {
                        Unsafe unsafe3 = ex.a;
                        i44Var = this;
                        if (!unsafe3.compareAndSwapObject(i44Var, r, objectVolatile, c) && unsafe3.getObjectVolatile(i44Var, j2) == objectVolatile) {
                            this = i44Var;
                        }
                    }
                    this = i44Var;
                } else {
                    i44Var = this;
                    if (objectVolatile == lo5Var) {
                        break;
                    }
                    do {
                        unsafe2 = ex.a;
                        if (unsafe2.compareAndSwapObject(i44Var, r, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(i44Var, j2) == objectVolatile);
                    this = i44Var;
                }
            }
            unsafe2 = unsafe;
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ks ksVar = i44Var.e;
            if (ksVar == null || ksVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(i44Var, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof tb6) {
                        long longVolatile = unsafe2.getLongVolatile((tb6) objectVolatile2, tb6.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == lo5Var) {
                        return Long.MAX_VALUE;
                    }
                }
                h44 h44Var = (h44) unsafe.getObjectVolatile(i44Var, h);
                if (h44Var != null) {
                    synchronized (h44Var) {
                        g44[] g44VarArr = h44Var.a;
                        if (g44VarArr != null) {
                            g44Var = g44VarArr[0];
                        }
                    }
                    if (g44Var != null) {
                        long nanoTime = g44Var.a - System.nanoTime();
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
        ha3.w.j(runnable);
    }

    public final void k() {
        g44 g44Var;
        g44 g44Var2;
        boolean z;
        h44 h44Var = (h44) ex.a.getObjectVolatile(this, h);
        if (h44Var == null || h44Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (h44Var) {
                g44[] g44VarArr = h44Var.a;
                g44Var = null;
                if (g44VarArr != null) {
                    g44Var2 = g44VarArr[0];
                } else {
                    g44Var2 = null;
                }
                if (g44Var2 == null) {
                    continue;
                } else {
                    if (nanoTime - g44Var2.a >= 0) {
                        z = l(g44Var2);
                    } else {
                        z = false;
                    }
                    if (z) {
                        g44Var = h44Var.d(0);
                    }
                    continue;
                }
            }
        } while (g44Var != null);
    }

    public final boolean l(java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i44.l(java.lang.Runnable):boolean");
    }

    public abstract Thread m();

    public final boolean n() {
        boolean z;
        ks ksVar = this.e;
        if (ksVar != null) {
            z = ksVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            Unsafe unsafe = ex.a;
            h44 h44Var = (h44) unsafe.getObjectVolatile(this, h);
            if (h44Var != null && h44Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, r);
            if (objectVolatile != null) {
                if (objectVolatile instanceof tb6) {
                    long longVolatile = unsafe.getLongVolatile((tb6) objectVolatile, tb6.g);
                    if (((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == z8d.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void o(long j, g44 g44Var) {
        ha3.w.p(j, g44Var);
    }

    public final void p(long j, g44 g44Var) {
        i44 i44Var;
        int c;
        Unsafe unsafe;
        Thread m;
        long j2 = h;
        Unsafe unsafe2 = ex.a;
        if (unsafe2.getIntVolatile(this, n) != 0) {
            i44Var = this;
            c = 1;
        } else {
            h44 h44Var = (h44) unsafe2.getObjectVolatile(this, j2);
            if (h44Var == null) {
                ?? obj = new Object();
                obj.c = j;
                while (true) {
                    unsafe = ex.a;
                    i44Var = this;
                    if (unsafe.compareAndSwapObject(i44Var, h, (Object) null, (Object) obj) || unsafe.getObjectVolatile(i44Var, j2) != null) {
                        break;
                    }
                    this = i44Var;
                }
                Object objectVolatile = unsafe.getObjectVolatile(i44Var, j2);
                objectVolatile.getClass();
                h44Var = (h44) objectVolatile;
                unsafe2 = unsafe;
            } else {
                i44Var = this;
            }
            c = g44Var.c(j, h44Var, i44Var);
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    sc8.j("unexpected result");
                    return;
                }
                return;
            }
            i44Var.o(j, g44Var);
            return;
        }
        h44 h44Var2 = (h44) unsafe2.getObjectVolatile(i44Var, j2);
        g44 g44Var2 = null;
        if (h44Var2 != null) {
            synchronized (h44Var2) {
                g44[] g44VarArr = h44Var2.a;
                if (g44VarArr != null) {
                    g44Var2 = g44VarArr[0];
                }
            }
        }
        if (g44Var2 == g44Var && Thread.currentThread() != (m = i44Var.m())) {
            LockSupport.unpark(m);
        }
    }

    @Override
    public void shutdown() {
        lo5 lo5Var;
        Unsafe unsafe;
        g44 g44Var;
        dnb.a.set(null);
        ex.a.putIntVolatile(this, n, 1);
        lo5 lo5Var2 = z8d.b;
        long j = r;
        loop0: while (true) {
            Object objectVolatile = ex.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                lo5Var = lo5Var2;
                if (objectVolatile instanceof tb6) {
                    ((tb6) objectVolatile).b();
                    break;
                } else if (objectVolatile == lo5Var) {
                    break;
                } else {
                    tb6 tb6Var = new tb6(8, true);
                    tb6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, tb6Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    lo5Var2 = lo5Var;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    lo5Var = lo5Var2;
                    if (unsafe2.compareAndSwapObject(this, r, (Object) null, lo5Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) == null) {
                        lo5Var2 = lo5Var;
                    }
                }
                lo5Var2 = lo5Var;
            }
        }
        do {
        } while (h() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            h44 h44Var = (h44) ex.a.getObjectVolatile(this, h);
            if (h44Var != null) {
                synchronized (h44Var) {
                    if (h44Var.b() > 0) {
                        g44Var = h44Var.d(0);
                    } else {
                        g44Var = null;
                    }
                }
                if (g44Var != null) {
                    o(nanoTime, g44Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
