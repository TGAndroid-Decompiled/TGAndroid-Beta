package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
public class y11 implements wf1 {
    public static final long E;
    public static final long F;
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(y11.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater c;
    public static final AtomicLongFieldUpdater d;
    public static final AtomicLongFieldUpdater e;
    public static final AtomicReferenceFieldUpdater f;
    public static final long h;
    public static final long n;
    public static final long r;
    public static final long s;
    public static final long w;
    public static final long x;
    public static final long y;
    private volatile Object _closeCause$volatile;
    public final int a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = fy.a;
        F = unsafe.objectFieldOffset(y11.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(y11.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(y11.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(y11.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(y11.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(y11.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(y11.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(y11.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(y11.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(y11.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(y11.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(y11.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(y11.class.getDeclaredField("closeHandler$volatile"));
    }

    public y11(int i) {
        long j;
        this.a = i;
        if (i >= 0) {
            pk1 pk1Var = a21.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = j();
            pk1 pk1Var2 = new pk1(0L, null, this, 3);
            this.sendSegment$volatile = pk1Var2;
            this.receiveSegment$volatile = pk1Var2;
            if (v()) {
                pk1Var2 = a21.a;
                pk1Var2.getClass();
            }
            this.bufferEndSegment$volatile = pk1Var2;
            this._closeCause$volatile = a21.s;
            return;
        }
        c1b.a(td4.o(i, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static boolean B(Object obj) {
        if (obj instanceof tb1) {
            tb1 tb1Var = (tb1) obj;
            pk1 pk1Var = a21.a;
            du2 b2 = tb1Var.b(g7c.a, null);
            if (b2 == null) {
                return false;
            }
            tb1Var.e(b2);
            return true;
        }
        zo4.p(obj, "Unexpected waiter: ");
        return false;
    }

    public final boolean A(Object obj, Object obj2) {
        if (obj instanceof x11) {
            x11 x11Var = (x11) obj;
            vb1 vb1Var = x11Var.b;
            vb1Var.getClass();
            x11Var.b = null;
            x11Var.a = obj2;
            Boolean bool = Boolean.TRUE;
            pk1 pk1Var = a21.a;
            du2 b2 = vb1Var.b(bool, null);
            if (b2 == null) {
                return false;
            }
            vb1Var.e(b2);
            return true;
        } else if (obj instanceof tb1) {
            tb1 tb1Var = (tb1) obj;
            pk1 pk1Var2 = a21.a;
            du2 b3 = tb1Var.b(obj2, null);
            if (b3 == null) {
                return false;
            }
            tb1Var.e(b3);
            return true;
        } else {
            zo4.p(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final Object C(pk1 pk1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = pk1Var.h;
        Object l = pk1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (fy.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return a21.n;
                }
                if (pk1Var.k(i, l, obj)) {
                    g();
                    return a21.m;
                }
            }
        } else if (l == a21.d && pk1Var.k(i, l, a21.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            pk1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = pk1Var.l(i);
            if (l2 != null && l2 != a21.e) {
                if (l2 == a21.d) {
                    if (pk1Var.k(i, l2, a21.i)) {
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        pk1Var.n(i, null);
                        return obj3;
                    }
                } else {
                    du2 du2Var = a21.j;
                    if (l2 == du2Var) {
                        return a21.o;
                    }
                    if (l2 == a21.h) {
                        return a21.o;
                    }
                    if (l2 == a21.l) {
                        g();
                        return a21.o;
                    } else if (l2 != a21.g && pk1Var.k(i, l2, a21.f)) {
                        boolean z = l2 instanceof bmc;
                        if (z) {
                            l2 = ((bmc) l2).a;
                        }
                        if (B(l2)) {
                            pk1Var.o(i, a21.i);
                            g();
                            Object obj4 = atomicReferenceArray.get(i << 1);
                            pk1Var.n(i, null);
                            return obj4;
                        }
                        pk1Var.o(i, du2Var);
                        pk1Var.i();
                        if (z) {
                            g();
                        }
                        return a21.o;
                    }
                }
            } else if (j < (fy.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (pk1Var.k(i, l2, a21.h)) {
                    g();
                    return a21.o;
                }
            } else if (obj == null) {
                return a21.n;
            } else {
                if (pk1Var.k(i, l2, obj)) {
                    g();
                    return a21.m;
                }
            }
        }
    }

    public final int D(pk1 pk1Var, int i, Object obj, long j, Object obj2, boolean z) {
        pk1Var.n(i, obj);
        if (z) {
            return E(pk1Var, i, obj, j, obj2, z);
        }
        Object l = pk1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (pk1Var.k(i, null, a21.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (pk1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof amc) {
            pk1Var.n(i, null);
            if (A(l, obj)) {
                pk1Var.o(i, a21.i);
                return 0;
            }
            du2 du2Var = a21.k;
            if (pk1Var.h.getAndSet((i << 1) + 1, du2Var) != du2Var) {
                pk1Var.m(i, true);
                return 5;
            }
            return 5;
        }
        return E(pk1Var, i, obj, j, obj2, z);
    }

    public final int E(pk1 pk1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = pk1Var.l(i);
            if (l == null) {
                if (b(j) && !z) {
                    if (pk1Var.k(i, null, a21.d)) {
                        break;
                    }
                } else if (z) {
                    if (pk1Var.k(i, null, a21.j)) {
                        pk1Var.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (pk1Var.k(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l == a21.e) {
                if (pk1Var.k(i, l, a21.d)) {
                    break;
                }
            } else {
                du2 du2Var = a21.k;
                if (l == du2Var) {
                    pk1Var.n(i, null);
                    return 5;
                } else if (l == a21.h) {
                    pk1Var.n(i, null);
                    return 5;
                } else if (l == a21.l) {
                    pk1Var.n(i, null);
                    t();
                    return 4;
                } else {
                    pk1Var.n(i, null);
                    if (l instanceof bmc) {
                        l = ((bmc) l).a;
                    }
                    if (A(l, obj)) {
                        pk1Var.o(i, a21.i);
                        return 0;
                    }
                    if (pk1Var.h.getAndSet((i << 1) + 1, du2Var) != du2Var) {
                        pk1Var.m(i, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        boolean z;
        y11 y11Var = this;
        if (!y11Var.v()) {
            while (y11Var.j() <= j) {
                y11Var = this;
            }
            int i = a21.c;
            int i2 = 0;
            while (true) {
                long j2 = w;
                if (i2 < i) {
                    long j3 = y11Var.j();
                    if (j3 != (fy.a.getLongVolatile(y11Var, j2) & 4611686018427387903L) || j3 != y11Var.j()) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long longVolatile = unsafe.getLongVolatile(y11Var, j2);
                        if (unsafe.compareAndSwapLong(y11Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                            break;
                        }
                        y11Var = this;
                    }
                    while (true) {
                        long j4 = y11Var.j();
                        Unsafe unsafe2 = fy.a;
                        long longVolatile2 = unsafe2.getLongVolatile(y11Var, j2);
                        long j5 = longVolatile2 & 4611686018427387903L;
                        if ((longVolatile2 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j5 && j4 == y11Var.j()) {
                            break;
                        } else if (!z) {
                            y11Var = this;
                            unsafe2.compareAndSwapLong(y11Var, w, longVolatile2, j5 + 4611686018427387904L);
                        } else {
                            y11Var = this;
                        }
                    }
                    while (true) {
                        Unsafe unsafe3 = fy.a;
                        long longVolatile3 = unsafe3.getLongVolatile(y11Var, j2);
                        if (unsafe3.compareAndSwapLong(y11Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                            return;
                        }
                        y11Var = this;
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object a(defpackage.px2 r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.a(px2, java.lang.Object):java.lang.Object");
    }

    public final boolean b(long j) {
        if (j >= j() && j >= m() + this.a) {
            return false;
        }
        return true;
    }

    public final boolean c(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        du2 du2Var;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        y11 y11Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = fy.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(y11Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                pk1 pk1Var = a21.a;
                if (unsafe4.compareAndSwapLong(y11Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                y11Var = this;
            }
        }
        du2 du2Var2 = a21.s;
        while (true) {
            Unsafe unsafe5 = fy.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, du2Var2, th)) {
                z2 = true;
                break;
            } else if (unsafe5.getObjectVolatile(this, j5) != du2Var2) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = fy.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = fy.a;
                j = F;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                } else {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        t();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = fy.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                if (objectVolatile == null) {
                    du2Var = a21.q;
                } else {
                    du2Var = a21.r;
                }
                du2 du2Var3 = du2Var;
                do {
                    unsafe2 = fy.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, du2Var3)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                r5c.a(1, objectVolatile);
                ((rr4) objectVolatile).invoke(k());
                return z2;
            }
        }
        return z2;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    @Override
    public Object d(Object obj) {
        boolean z;
        y11 y11Var = this;
        Unsafe unsafe = fy.a;
        long longVolatile = unsafe.getLongVolatile(y11Var, F);
        long j = 1152921504606846975L;
        if (y11Var.r(longVolatile, false)) {
            z = false;
        } else {
            z = !y11Var.b(longVolatile & 1152921504606846975L);
        }
        nk1 nk1Var = ok1.b;
        if (z) {
            return nk1Var;
        }
        du2 du2Var = a21.j;
        pk1 pk1Var = (pk1) unsafe.getObjectVolatile(y11Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(y11Var);
            long j2 = andIncrement & j;
            boolean r2 = y11Var.r(andIncrement, false);
            int i = a21.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (pk1Var.d != j4) {
                pk1 i3 = y11Var.i(j4, pk1Var);
                if (i3 == null) {
                    if (r2) {
                        return new mk1(y11Var.n());
                    }
                    j = 1152921504606846975L;
                } else {
                    pk1Var = i3;
                }
            }
            int D = y11Var.D(pk1Var, i2, obj, j2, du2Var, r2);
            g7c g7cVar = g7c.a;
            if (D != 0) {
                if (D != 1) {
                    amc amcVar = null;
                    if (D != 2) {
                        if (D != 3) {
                            if (D != 4) {
                                if (D == 5) {
                                    pk1Var.b();
                                }
                                j = 1152921504606846975L;
                                y11Var = this;
                            } else {
                                if (j2 < m()) {
                                    pk1Var.b();
                                }
                                return new mk1(n());
                            }
                        } else {
                            dq9.m("unexpected");
                            return null;
                        }
                    } else if (r2) {
                        pk1Var.i();
                        return new mk1(n());
                    } else {
                        if (du2Var instanceof amc) {
                            amcVar = (amc) du2Var;
                        }
                        if (amcVar != null) {
                            amcVar.a(pk1Var, i2 + i);
                        }
                        pk1Var.i();
                        return nk1Var;
                    }
                } else {
                    return g7cVar;
                }
            } else {
                pk1Var.b();
                return g7cVar;
            }
        }
    }

    public final defpackage.pk1 e(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.e(long):pk1");
    }

    public final void f(long j) {
        pk1 pk1Var = (pk1) fy.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = fy.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            y11 y11Var = this;
            if (unsafe.compareAndSwapLong(y11Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = a21.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (pk1Var.d != j4) {
                    pk1 h2 = y11Var.h(j4, pk1Var);
                    if (h2 != null) {
                        pk1Var = h2;
                    }
                }
                pk1 pk1Var2 = pk1Var;
                if (y11Var.C(pk1Var2, i, longVolatile, null) == a21.o) {
                    if (longVolatile < y11Var.o()) {
                        pk1Var2.b();
                    }
                } else {
                    pk1Var2.b();
                }
                this = y11Var;
                pk1Var = pk1Var2;
            }
            this = y11Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = fy.a;
        long j = r;
        pk1 pk1Var = (pk1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / a21.b;
            if (o() <= andIncrement) {
                if (pk1Var.d < j2 && pk1Var.c() != null) {
                    w(j2, pk1Var);
                }
                p(1L);
                return;
            }
            if (pk1Var.d != j2) {
                z11 z11Var = z11.a;
                while (true) {
                    b2 = ne3.b(pk1Var, j2, z11Var);
                    if (vve.b(b2)) {
                        break;
                    }
                    qx9 a = vve.a(b2);
                    while (true) {
                        qx9 qx9Var = (qx9) fy.a.getObjectVolatile(this, j);
                        if (qx9Var.d >= a.d) {
                            break;
                        } else if (a.j()) {
                            do {
                                unsafe = fy.a;
                                if (unsafe.compareAndSwapObject(this, r, qx9Var, a)) {
                                    if (qx9Var.f()) {
                                        qx9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == qx9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                pk1 pk1Var2 = null;
                if (vve.b(b2)) {
                    t();
                    w(j2, pk1Var);
                    p(1L);
                } else {
                    pk1 pk1Var3 = (pk1) vve.a(b2);
                    long j3 = pk1Var3.d;
                    if (j3 > j2) {
                        long j4 = a21.b * j3;
                        if (!fy.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(1L);
                        } else {
                            p(j4 - andIncrement);
                        }
                    } else {
                        pk1Var2 = pk1Var3;
                    }
                }
                if (pk1Var2 != null) {
                    pk1Var = pk1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % a21.b);
            Object l = pk1Var.l(i);
            boolean z = l instanceof amc;
            long j5 = y;
            if (!z || andIncrement < fy.a.getLongVolatile(this, j5) || !pk1Var.k(i, l, a21.g)) {
                while (true) {
                    Object l2 = pk1Var.l(i);
                    if (l2 instanceof amc) {
                        if (andIncrement < fy.a.getLongVolatile(this, j5)) {
                            if (pk1Var.k(i, l2, new bmc((amc) l2))) {
                                break loop0;
                            }
                        } else if (pk1Var.k(i, l2, a21.g)) {
                            if (B(l2)) {
                                pk1Var.o(i, a21.d);
                                break;
                            } else {
                                pk1Var.o(i, a21.j);
                                pk1Var.i();
                            }
                        }
                    } else if (l2 != a21.j) {
                        if (l2 == null) {
                            if (pk1Var.k(i, l2, a21.e)) {
                                break loop0;
                            }
                        } else if (l2 == a21.d || l2 == a21.h || l2 == a21.i || l2 == a21.k || l2 == a21.l) {
                            break loop0;
                        } else if (l2 != a21.f) {
                            zo4.p(l2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                p(1L);
            } else if (B(l)) {
                pk1Var.o(i, a21.d);
                break;
            } else {
                pk1Var.o(i, a21.j);
                pk1Var.i();
                p(1L);
            }
        }
        p(1L);
    }

    public final defpackage.pk1 h(long r16, defpackage.pk1 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.h(long, pk1):pk1");
    }

    public final pk1 i(long j, pk1 pk1Var) {
        Object b2;
        pk1 pk1Var2;
        long j2;
        Unsafe unsafe;
        y11 y11Var = this;
        pk1 pk1Var3 = a21.a;
        z11 z11Var = z11.a;
        loop0: while (true) {
            b2 = ne3.b(pk1Var, j, z11Var);
            if (vve.b(b2)) {
                break;
            }
            qx9 a = vve.a(b2);
            while (true) {
                Unsafe unsafe2 = fy.a;
                long j3 = E;
                qx9 qx9Var = (qx9) unsafe2.getObjectVolatile(y11Var, j3);
                if (qx9Var.d >= a.d) {
                    break loop0;
                } else if (a.j()) {
                    do {
                        unsafe = fy.a;
                        if (unsafe.compareAndSwapObject(y11Var, E, qx9Var, a)) {
                            if (qx9Var.f()) {
                                qx9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(y11Var, j3) == qx9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        pk1 pk1Var4 = null;
        if (vve.b(b2)) {
            y11Var.t();
            if (pk1Var.d * a21.b >= y11Var.m()) {
                return null;
            }
            pk1Var.b();
            return null;
        }
        pk1 pk1Var5 = (pk1) vve.a(b2);
        long j4 = pk1Var5.d;
        if (j4 > j) {
            long j5 = j4 * a21.b;
            while (true) {
                Unsafe unsafe3 = fy.a;
                long j6 = F;
                long longVolatile = unsafe3.getLongVolatile(y11Var, j6);
                long j7 = 1152921504606846975L & longVolatile;
                if (j7 >= j5) {
                    pk1Var2 = pk1Var4;
                    j2 = j4;
                    break;
                }
                pk1Var2 = pk1Var4;
                j2 = j4;
                if (unsafe3.compareAndSwapLong(y11Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                    break;
                }
                y11Var = this;
                pk1Var4 = pk1Var2;
                j4 = j2;
            }
            if (j2 * a21.b < m()) {
                pk1Var5.b();
                return pk1Var2;
            }
            return pk1Var2;
        }
        return pk1Var5;
    }

    public final long j() {
        return fy.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) fy.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        if (k == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return k;
    }

    public final long m() {
        return fy.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        if (k == null) {
            return new IllegalStateException("Channel was closed");
        }
        return k;
    }

    public final long o() {
        return fy.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((fy.a.getLongVolatile(this, w) & 4611686018427387904L) != 0);
        }
    }

    public final boolean r(long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(fy.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(fy.a.getLongVolatile(this, F), false);
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.toString():java.lang.String");
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j = j();
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void w(long r7, defpackage.pk1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y11.w(long, pk1):void");
    }

    public final Object x(px2 px2Var, Object obj) {
        vb1 vb1Var = new vb1(1, fne.a(px2Var));
        vb1Var.s();
        vb1Var.resumeWith(new sc9(n()));
        Object q = vb1Var.q();
        if (q == ly2.a) {
            return q;
        }
        return g7c.a;
    }

    public final void y(Object obj, vb1 vb1Var) {
        vb1Var.resumeWith(new sc9(n()));
    }

    public final void z(amc amcVar, boolean z) {
        Throwable n2;
        if (amcVar instanceof tb1) {
            px2 px2Var = (px2) amcVar;
            if (z) {
                n2 = l();
            } else {
                n2 = n();
            }
            px2Var.resumeWith(new sc9(n2));
        } else if (amcVar instanceof x11) {
            x11 x11Var = (x11) amcVar;
            vb1 vb1Var = x11Var.b;
            vb1Var.getClass();
            x11Var.b = null;
            x11Var.a = a21.l;
            Throwable k = x11Var.c.k();
            if (k == null) {
                vb1Var.resumeWith(Boolean.FALSE);
            } else {
                vb1Var.resumeWith(new sc9(k));
            }
        } else {
            zo4.p(amcVar, "Unexpected waiter: ");
        }
    }
}
