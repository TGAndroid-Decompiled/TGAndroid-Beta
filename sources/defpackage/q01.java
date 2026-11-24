package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
public class q01 implements oe1 {
    public static final long E;
    public static final long F;
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(q01.class, "sendersAndCloseStatus$volatile");
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
        Unsafe unsafe = ex.a;
        F = unsafe.objectFieldOffset(q01.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(q01.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(q01.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(q01.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(q01.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(q01.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(q01.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(q01.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(q01.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(q01.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(q01.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(q01.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(q01.class.getDeclaredField("closeHandler$volatile"));
    }

    public q01(int i) {
        long j;
        this.a = i;
        if (i >= 0) {
            hj1 hj1Var = s01.a;
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
            hj1 hj1Var2 = new hj1(0L, null, this, 3);
            this.sendSegment$volatile = hj1Var2;
            this.receiveSegment$volatile = hj1Var2;
            if (v()) {
                hj1Var2 = s01.a;
                hj1Var2.getClass();
            }
            this.bufferEndSegment$volatile = hj1Var2;
            this._closeCause$volatile = s01.s;
            return;
        }
        v0b.a(tb4.n(i, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static boolean B(Object obj) {
        if (obj instanceof la1) {
            la1 la1Var = (la1) obj;
            hj1 hj1Var = s01.a;
            lo5 b2 = la1Var.b(g5c.a, null);
            if (b2 == null) {
                return false;
            }
            la1Var.e(b2);
            return true;
        }
        wn4.n(obj, "Unexpected waiter: ");
        return false;
    }

    public final boolean A(Object obj, Object obj2) {
        if (obj instanceof p01) {
            p01 p01Var = (p01) obj;
            na1 na1Var = p01Var.b;
            na1Var.getClass();
            p01Var.b = null;
            p01Var.a = obj2;
            Boolean bool = Boolean.TRUE;
            hj1 hj1Var = s01.a;
            lo5 b2 = na1Var.b(bool, null);
            if (b2 == null) {
                return false;
            }
            na1Var.e(b2);
            return true;
        } else if (obj instanceof la1) {
            la1 la1Var = (la1) obj;
            hj1 hj1Var2 = s01.a;
            lo5 b3 = la1Var.b(obj2, null);
            if (b3 == null) {
                return false;
            }
            la1Var.e(b3);
            return true;
        } else {
            wn4.n(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final Object C(hj1 hj1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hj1Var.h;
        Object l = hj1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (ex.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return s01.n;
                }
                if (hj1Var.k(i, l, obj)) {
                    g();
                    return s01.m;
                }
            }
        } else if (l == s01.d && hj1Var.k(i, l, s01.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            hj1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = hj1Var.l(i);
            if (l2 != null && l2 != s01.e) {
                if (l2 == s01.d) {
                    if (hj1Var.k(i, l2, s01.i)) {
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        hj1Var.n(i, null);
                        return obj3;
                    }
                } else {
                    lo5 lo5Var = s01.j;
                    if (l2 == lo5Var) {
                        return s01.o;
                    }
                    if (l2 == s01.h) {
                        return s01.o;
                    }
                    if (l2 == s01.l) {
                        g();
                        return s01.o;
                    } else if (l2 != s01.g && hj1Var.k(i, l2, s01.f)) {
                        boolean z = l2 instanceof bkc;
                        if (z) {
                            l2 = ((bkc) l2).a;
                        }
                        if (B(l2)) {
                            hj1Var.o(i, s01.i);
                            g();
                            Object obj4 = atomicReferenceArray.get(i << 1);
                            hj1Var.n(i, null);
                            return obj4;
                        }
                        hj1Var.o(i, lo5Var);
                        hj1Var.i();
                        if (z) {
                            g();
                        }
                        return s01.o;
                    }
                }
            } else if (j < (ex.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (hj1Var.k(i, l2, s01.h)) {
                    g();
                    return s01.o;
                }
            } else if (obj == null) {
                return s01.n;
            } else {
                if (hj1Var.k(i, l2, obj)) {
                    g();
                    return s01.m;
                }
            }
        }
    }

    public final int D(hj1 hj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        hj1Var.n(i, obj);
        if (z) {
            return E(hj1Var, i, obj, j, obj2, z);
        }
        Object l = hj1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (hj1Var.k(i, null, s01.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (hj1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof akc) {
            hj1Var.n(i, null);
            if (A(l, obj)) {
                hj1Var.o(i, s01.i);
                return 0;
            }
            lo5 lo5Var = s01.k;
            if (hj1Var.h.getAndSet((i << 1) + 1, lo5Var) != lo5Var) {
                hj1Var.m(i, true);
                return 5;
            }
            return 5;
        }
        return E(hj1Var, i, obj, j, obj2, z);
    }

    public final int E(hj1 hj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = hj1Var.l(i);
            if (l == null) {
                if (b(j) && !z) {
                    if (hj1Var.k(i, null, s01.d)) {
                        break;
                    }
                } else if (z) {
                    if (hj1Var.k(i, null, s01.j)) {
                        hj1Var.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (hj1Var.k(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l == s01.e) {
                if (hj1Var.k(i, l, s01.d)) {
                    break;
                }
            } else {
                lo5 lo5Var = s01.k;
                if (l == lo5Var) {
                    hj1Var.n(i, null);
                    return 5;
                } else if (l == s01.h) {
                    hj1Var.n(i, null);
                    return 5;
                } else if (l == s01.l) {
                    hj1Var.n(i, null);
                    t();
                    return 4;
                } else {
                    hj1Var.n(i, null);
                    if (l instanceof bkc) {
                        l = ((bkc) l).a;
                    }
                    if (A(l, obj)) {
                        hj1Var.o(i, s01.i);
                        return 0;
                    }
                    if (hj1Var.h.getAndSet((i << 1) + 1, lo5Var) != lo5Var) {
                        hj1Var.m(i, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        boolean z;
        q01 q01Var = this;
        if (!q01Var.v()) {
            while (q01Var.j() <= j) {
                q01Var = this;
            }
            int i = s01.c;
            int i2 = 0;
            while (true) {
                long j2 = w;
                if (i2 < i) {
                    long j3 = q01Var.j();
                    if (j3 != (ex.a.getLongVolatile(q01Var, j2) & 4611686018427387903L) || j3 != q01Var.j()) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long longVolatile = unsafe.getLongVolatile(q01Var, j2);
                        if (unsafe.compareAndSwapLong(q01Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                            break;
                        }
                        q01Var = this;
                    }
                    while (true) {
                        long j4 = q01Var.j();
                        Unsafe unsafe2 = ex.a;
                        long longVolatile2 = unsafe2.getLongVolatile(q01Var, j2);
                        long j5 = longVolatile2 & 4611686018427387903L;
                        if ((longVolatile2 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j5 && j4 == q01Var.j()) {
                            break;
                        } else if (!z) {
                            q01Var = this;
                            unsafe2.compareAndSwapLong(q01Var, w, longVolatile2, j5 + 4611686018427387904L);
                        } else {
                            q01Var = this;
                        }
                    }
                    while (true) {
                        Unsafe unsafe3 = ex.a;
                        long longVolatile3 = unsafe3.getLongVolatile(q01Var, j2);
                        if (unsafe3.compareAndSwapLong(q01Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                            return;
                        }
                        q01Var = this;
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object a(defpackage.fw2 r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.a(fw2, java.lang.Object):java.lang.Object");
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
        lo5 lo5Var;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        q01 q01Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = ex.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(q01Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                hj1 hj1Var = s01.a;
                if (unsafe4.compareAndSwapLong(q01Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                q01Var = this;
            }
        }
        lo5 lo5Var2 = s01.s;
        while (true) {
            Unsafe unsafe5 = ex.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, lo5Var2, th)) {
                z2 = true;
                break;
            } else if (unsafe5.getObjectVolatile(this, j5) != lo5Var2) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = ex.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = ex.a;
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
                Unsafe unsafe6 = ex.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                if (objectVolatile == null) {
                    lo5Var = s01.q;
                } else {
                    lo5Var = s01.r;
                }
                lo5 lo5Var3 = lo5Var;
                do {
                    unsafe2 = ex.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, lo5Var3)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                r3c.a(1, objectVolatile);
                ((qp4) objectVolatile).invoke(k());
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
        q01 q01Var = this;
        Unsafe unsafe = ex.a;
        long longVolatile = unsafe.getLongVolatile(q01Var, F);
        long j = 1152921504606846975L;
        if (q01Var.r(longVolatile, false)) {
            z = false;
        } else {
            z = !q01Var.b(longVolatile & 1152921504606846975L);
        }
        fj1 fj1Var = gj1.b;
        if (z) {
            return fj1Var;
        }
        lo5 lo5Var = s01.j;
        hj1 hj1Var = (hj1) unsafe.getObjectVolatile(q01Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(q01Var);
            long j2 = andIncrement & j;
            boolean r2 = q01Var.r(andIncrement, false);
            int i = s01.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (hj1Var.d != j4) {
                hj1 i3 = q01Var.i(j4, hj1Var);
                if (i3 == null) {
                    if (r2) {
                        return new ej1(q01Var.n());
                    }
                    j = 1152921504606846975L;
                } else {
                    hj1Var = i3;
                }
            }
            int D = q01Var.D(hj1Var, i2, obj, j2, lo5Var, r2);
            g5c g5cVar = g5c.a;
            if (D != 0) {
                if (D != 1) {
                    akc akcVar = null;
                    if (D != 2) {
                        if (D != 3) {
                            if (D != 4) {
                                if (D == 5) {
                                    hj1Var.b();
                                }
                                j = 1152921504606846975L;
                                q01Var = this;
                            } else {
                                if (j2 < m()) {
                                    hj1Var.b();
                                }
                                return new ej1(n());
                            }
                        } else {
                            sc8.j("unexpected");
                            return null;
                        }
                    } else if (r2) {
                        hj1Var.i();
                        return new ej1(n());
                    } else {
                        if (lo5Var instanceof akc) {
                            akcVar = (akc) lo5Var;
                        }
                        if (akcVar != null) {
                            akcVar.a(hj1Var, i2 + i);
                        }
                        hj1Var.i();
                        return fj1Var;
                    }
                } else {
                    return g5cVar;
                }
            } else {
                hj1Var.b();
                return g5cVar;
            }
        }
    }

    public final defpackage.hj1 e(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.e(long):hj1");
    }

    public final void f(long j) {
        hj1 hj1Var = (hj1) ex.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = ex.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            q01 q01Var = this;
            if (unsafe.compareAndSwapLong(q01Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = s01.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (hj1Var.d != j4) {
                    hj1 h2 = q01Var.h(j4, hj1Var);
                    if (h2 != null) {
                        hj1Var = h2;
                    }
                }
                hj1 hj1Var2 = hj1Var;
                if (q01Var.C(hj1Var2, i, longVolatile, null) == s01.o) {
                    if (longVolatile < q01Var.o()) {
                        hj1Var2.b();
                    }
                } else {
                    hj1Var2.b();
                }
                this = q01Var;
                hj1Var = hj1Var2;
            }
            this = q01Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = ex.a;
        long j = r;
        hj1 hj1Var = (hj1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / s01.b;
            if (o() <= andIncrement) {
                if (hj1Var.d < j2 && hj1Var.c() != null) {
                    w(j2, hj1Var);
                }
                p(1L);
                return;
            }
            if (hj1Var.d != j2) {
                r01 r01Var = r01.a;
                while (true) {
                    b2 = bd3.b(hj1Var, j2, r01Var);
                    if (ste.b(b2)) {
                        break;
                    }
                    nv9 a = ste.a(b2);
                    while (true) {
                        nv9 nv9Var = (nv9) ex.a.getObjectVolatile(this, j);
                        if (nv9Var.d >= a.d) {
                            break;
                        } else if (a.j()) {
                            do {
                                unsafe = ex.a;
                                if (unsafe.compareAndSwapObject(this, r, nv9Var, a)) {
                                    if (nv9Var.f()) {
                                        nv9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == nv9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                hj1 hj1Var2 = null;
                if (ste.b(b2)) {
                    t();
                    w(j2, hj1Var);
                    p(1L);
                } else {
                    hj1 hj1Var3 = (hj1) ste.a(b2);
                    long j3 = hj1Var3.d;
                    if (j3 > j2) {
                        long j4 = s01.b * j3;
                        if (!ex.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(1L);
                        } else {
                            p(j4 - andIncrement);
                        }
                    } else {
                        hj1Var2 = hj1Var3;
                    }
                }
                if (hj1Var2 != null) {
                    hj1Var = hj1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % s01.b);
            Object l = hj1Var.l(i);
            boolean z = l instanceof akc;
            long j5 = y;
            if (!z || andIncrement < ex.a.getLongVolatile(this, j5) || !hj1Var.k(i, l, s01.g)) {
                while (true) {
                    Object l2 = hj1Var.l(i);
                    if (l2 instanceof akc) {
                        if (andIncrement < ex.a.getLongVolatile(this, j5)) {
                            if (hj1Var.k(i, l2, new bkc((akc) l2))) {
                                break loop0;
                            }
                        } else if (hj1Var.k(i, l2, s01.g)) {
                            if (B(l2)) {
                                hj1Var.o(i, s01.d);
                                break;
                            } else {
                                hj1Var.o(i, s01.j);
                                hj1Var.i();
                            }
                        }
                    } else if (l2 != s01.j) {
                        if (l2 == null) {
                            if (hj1Var.k(i, l2, s01.e)) {
                                break loop0;
                            }
                        } else if (l2 == s01.d || l2 == s01.h || l2 == s01.i || l2 == s01.k || l2 == s01.l) {
                            break loop0;
                        } else if (l2 != s01.f) {
                            wn4.n(l2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                p(1L);
            } else if (B(l)) {
                hj1Var.o(i, s01.d);
                break;
            } else {
                hj1Var.o(i, s01.j);
                hj1Var.i();
                p(1L);
            }
        }
        p(1L);
    }

    public final defpackage.hj1 h(long r16, defpackage.hj1 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.h(long, hj1):hj1");
    }

    public final hj1 i(long j, hj1 hj1Var) {
        Object b2;
        hj1 hj1Var2;
        long j2;
        Unsafe unsafe;
        q01 q01Var = this;
        hj1 hj1Var3 = s01.a;
        r01 r01Var = r01.a;
        loop0: while (true) {
            b2 = bd3.b(hj1Var, j, r01Var);
            if (ste.b(b2)) {
                break;
            }
            nv9 a = ste.a(b2);
            while (true) {
                Unsafe unsafe2 = ex.a;
                long j3 = E;
                nv9 nv9Var = (nv9) unsafe2.getObjectVolatile(q01Var, j3);
                if (nv9Var.d >= a.d) {
                    break loop0;
                } else if (a.j()) {
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(q01Var, E, nv9Var, a)) {
                            if (nv9Var.f()) {
                                nv9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(q01Var, j3) == nv9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        hj1 hj1Var4 = null;
        if (ste.b(b2)) {
            q01Var.t();
            if (hj1Var.d * s01.b >= q01Var.m()) {
                return null;
            }
            hj1Var.b();
            return null;
        }
        hj1 hj1Var5 = (hj1) ste.a(b2);
        long j4 = hj1Var5.d;
        if (j4 > j) {
            long j5 = j4 * s01.b;
            while (true) {
                Unsafe unsafe3 = ex.a;
                long j6 = F;
                long longVolatile = unsafe3.getLongVolatile(q01Var, j6);
                long j7 = 1152921504606846975L & longVolatile;
                if (j7 >= j5) {
                    hj1Var2 = hj1Var4;
                    j2 = j4;
                    break;
                }
                hj1Var2 = hj1Var4;
                j2 = j4;
                if (unsafe3.compareAndSwapLong(q01Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                    break;
                }
                q01Var = this;
                hj1Var4 = hj1Var2;
                j4 = j2;
            }
            if (j2 * s01.b < m()) {
                hj1Var5.b();
                return hj1Var2;
            }
            return hj1Var2;
        }
        return hj1Var5;
    }

    public final long j() {
        return ex.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) ex.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        if (k == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return k;
    }

    public final long m() {
        return ex.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        if (k == null) {
            return new IllegalStateException("Channel was closed");
        }
        return k;
    }

    public final long o() {
        return ex.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((ex.a.getLongVolatile(this, w) & 4611686018427387904L) != 0);
        }
    }

    public final boolean r(long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(ex.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(ex.a.getLongVolatile(this, F), false);
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.toString():java.lang.String");
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

    public final void w(long r7, defpackage.hj1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.w(long, hj1):void");
    }

    public final Object x(fw2 fw2Var, Object obj) {
        na1 na1Var = new na1(1, dle.a(fw2Var));
        na1Var.s();
        na1Var.resumeWith(new sa9(n()));
        Object q = na1Var.q();
        if (q == bx2.a) {
            return q;
        }
        return g5c.a;
    }

    public final void y(Object obj, na1 na1Var) {
        na1Var.resumeWith(new sa9(n()));
    }

    public final void z(akc akcVar, boolean z) {
        Throwable n2;
        if (akcVar instanceof la1) {
            fw2 fw2Var = (fw2) akcVar;
            if (z) {
                n2 = l();
            } else {
                n2 = n();
            }
            fw2Var.resumeWith(new sa9(n2));
        } else if (akcVar instanceof p01) {
            p01 p01Var = (p01) akcVar;
            na1 na1Var = p01Var.b;
            na1Var.getClass();
            p01Var.b = null;
            p01Var.a = s01.l;
            Throwable k = p01Var.c.k();
            if (k == null) {
                na1Var.resumeWith(Boolean.FALSE);
            } else {
                na1Var.resumeWith(new sa9(k));
            }
        } else {
            wn4.n(akcVar, "Unexpected waiter: ");
        }
    }
}
