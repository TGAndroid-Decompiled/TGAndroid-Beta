package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
public class z01 implements xe1 {
    public static final long E;
    public static final long F;
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(z01.class, "sendersAndCloseStatus$volatile");
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
        Unsafe unsafe = fx.a;
        F = unsafe.objectFieldOffset(z01.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(z01.class, "receivers$volatile");
        y = unsafe.objectFieldOffset(z01.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(z01.class, "bufferEnd$volatile");
        n = unsafe.objectFieldOffset(z01.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(z01.class, "completedExpandBuffersAndPauseFlag$volatile");
        w = unsafe.objectFieldOffset(z01.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(z01.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "receiveSegment$volatile");
        x = unsafe.objectFieldOffset(z01.class.getDeclaredField("receiveSegment$volatile"));
        r = unsafe.objectFieldOffset(z01.class.getDeclaredField("bufferEndSegment$volatile"));
        h = unsafe.objectFieldOffset(z01.class.getDeclaredField("_closeCause$volatile"));
        s = unsafe.objectFieldOffset(z01.class.getDeclaredField("closeHandler$volatile"));
    }

    public z01(int i) {
        long j;
        this.a = i;
        if (i >= 0) {
            qj1 qj1Var = b11.a;
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
            qj1 qj1Var2 = new qj1(0L, null, this, 3);
            this.sendSegment$volatile = qj1Var2;
            this.receiveSegment$volatile = qj1Var2;
            if (v()) {
                qj1Var2 = b11.a;
                qj1Var2.getClass();
            }
            this.bufferEndSegment$volatile = qj1Var2;
            this._closeCause$volatile = b11.s;
            return;
        }
        bya.a(qd4.n(i, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static boolean B(Object obj) {
        if (obj instanceof ta1) {
            ta1 ta1Var = (ta1) obj;
            qj1 qj1Var = b11.a;
            ow5 b2 = ta1Var.b(g9c.a, null);
            if (b2 == null) {
                return false;
            }
            ta1Var.e(b2);
            return true;
        }
        lq5.i(obj, "Unexpected waiter: ");
        return false;
    }

    public final boolean A(Object obj, Object obj2) {
        if (obj instanceof y01) {
            y01 y01Var = (y01) obj;
            va1 va1Var = y01Var.b;
            va1Var.getClass();
            y01Var.b = null;
            y01Var.a = obj2;
            Boolean bool = Boolean.TRUE;
            qj1 qj1Var = b11.a;
            ow5 b2 = va1Var.b(bool, null);
            if (b2 == null) {
                return false;
            }
            va1Var.e(b2);
            return true;
        } else if (obj instanceof ta1) {
            ta1 ta1Var = (ta1) obj;
            qj1 qj1Var2 = b11.a;
            ow5 b3 = ta1Var.b(obj2, null);
            if (b3 == null) {
                return false;
            }
            ta1Var.e(b3);
            return true;
        } else {
            lq5.i(obj, "Unexpected receiver type: ");
            return false;
        }
    }

    public final Object C(qj1 qj1Var, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = qj1Var.h;
        Object l = qj1Var.l(i);
        long j2 = F;
        if (l == null) {
            if (j >= (fx.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return b11.n;
                }
                if (qj1Var.k(i, l, obj)) {
                    g();
                    return b11.m;
                }
            }
        } else if (l == b11.d && qj1Var.k(i, l, b11.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i << 1);
            qj1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = qj1Var.l(i);
            if (l2 != null && l2 != b11.e) {
                if (l2 == b11.d) {
                    if (qj1Var.k(i, l2, b11.i)) {
                        g();
                        Object obj3 = atomicReferenceArray.get(i << 1);
                        qj1Var.n(i, null);
                        return obj3;
                    }
                } else {
                    ow5 ow5Var = b11.j;
                    if (l2 == ow5Var) {
                        return b11.o;
                    }
                    if (l2 == b11.h) {
                        return b11.o;
                    }
                    if (l2 == b11.l) {
                        g();
                        return b11.o;
                    } else if (l2 != b11.g && qj1Var.k(i, l2, b11.f)) {
                        boolean z = l2 instanceof ooc;
                        if (z) {
                            l2 = ((ooc) l2).a;
                        }
                        if (B(l2)) {
                            qj1Var.o(i, b11.i);
                            g();
                            Object obj4 = atomicReferenceArray.get(i << 1);
                            qj1Var.n(i, null);
                            return obj4;
                        }
                        qj1Var.o(i, ow5Var);
                        qj1Var.i();
                        if (z) {
                            g();
                        }
                        return b11.o;
                    }
                }
            } else if (j < (fx.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (qj1Var.k(i, l2, b11.h)) {
                    g();
                    return b11.o;
                }
            } else if (obj == null) {
                return b11.n;
            } else {
                if (qj1Var.k(i, l2, obj)) {
                    g();
                    return b11.m;
                }
            }
        }
    }

    public final int D(qj1 qj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        qj1Var.n(i, obj);
        if (z) {
            return E(qj1Var, i, obj, j, obj2, z);
        }
        Object l = qj1Var.l(i);
        if (l == null) {
            if (b(j)) {
                if (qj1Var.k(i, null, b11.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (qj1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof noc) {
            qj1Var.n(i, null);
            if (A(l, obj)) {
                qj1Var.o(i, b11.i);
                return 0;
            }
            ow5 ow5Var = b11.k;
            if (qj1Var.h.getAndSet((i << 1) + 1, ow5Var) != ow5Var) {
                qj1Var.m(i, true);
                return 5;
            }
            return 5;
        }
        return E(qj1Var, i, obj, j, obj2, z);
    }

    public final int E(qj1 qj1Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = qj1Var.l(i);
            if (l == null) {
                if (b(j) && !z) {
                    if (qj1Var.k(i, null, b11.d)) {
                        break;
                    }
                } else if (z) {
                    if (qj1Var.k(i, null, b11.j)) {
                        qj1Var.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (qj1Var.k(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l == b11.e) {
                if (qj1Var.k(i, l, b11.d)) {
                    break;
                }
            } else {
                ow5 ow5Var = b11.k;
                if (l == ow5Var) {
                    qj1Var.n(i, null);
                    return 5;
                } else if (l == b11.h) {
                    qj1Var.n(i, null);
                    return 5;
                } else if (l == b11.l) {
                    qj1Var.n(i, null);
                    t();
                    return 4;
                } else {
                    qj1Var.n(i, null);
                    if (l instanceof ooc) {
                        l = ((ooc) l).a;
                    }
                    if (A(l, obj)) {
                        qj1Var.o(i, b11.i);
                        return 0;
                    }
                    if (qj1Var.h.getAndSet((i << 1) + 1, ow5Var) != ow5Var) {
                        qj1Var.m(i, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void F(long j) {
        boolean z;
        z01 z01Var = this;
        if (!z01Var.v()) {
            while (z01Var.j() <= j) {
                z01Var = this;
            }
            int i = b11.c;
            int i2 = 0;
            while (true) {
                long j2 = w;
                if (i2 < i) {
                    long j3 = z01Var.j();
                    if (j3 != (fx.a.getLongVolatile(z01Var, j2) & 4611686018427387903L) || j3 != z01Var.j()) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long longVolatile = unsafe.getLongVolatile(z01Var, j2);
                        if (unsafe.compareAndSwapLong(z01Var, w, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                            break;
                        }
                        z01Var = this;
                    }
                    while (true) {
                        long j4 = z01Var.j();
                        Unsafe unsafe2 = fx.a;
                        long longVolatile2 = unsafe2.getLongVolatile(z01Var, j2);
                        long j5 = longVolatile2 & 4611686018427387903L;
                        if ((longVolatile2 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j4 == j5 && j4 == z01Var.j()) {
                            break;
                        } else if (!z) {
                            z01Var = this;
                            unsafe2.compareAndSwapLong(z01Var, w, longVolatile2, j5 + 4611686018427387904L);
                        } else {
                            z01Var = this;
                        }
                    }
                    while (true) {
                        Unsafe unsafe3 = fx.a;
                        long longVolatile3 = unsafe3.getLongVolatile(z01Var, j2);
                        if (unsafe3.compareAndSwapLong(z01Var, w, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                            return;
                        }
                        z01Var = this;
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object a(defpackage.zw2 r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.a(zw2, java.lang.Object):java.lang.Object");
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
        ow5 ow5Var;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        z01 z01Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = fx.a;
                long j4 = F;
                long longVolatile3 = unsafe4.getLongVolatile(z01Var, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                qj1 qj1Var = b11.a;
                if (unsafe4.compareAndSwapLong(z01Var, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                z01Var = this;
            }
        }
        ow5 ow5Var2 = b11.s;
        while (true) {
            Unsafe unsafe5 = fx.a;
            long j5 = h;
            if (unsafe5.compareAndSwapObject(this, j5, ow5Var2, th)) {
                z2 = true;
                break;
            } else if (unsafe5.getObjectVolatile(this, j5) != ow5Var2) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = fx.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = fx.a;
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
                Unsafe unsafe6 = fx.a;
                long j6 = s;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                if (objectVolatile == null) {
                    ow5Var = b11.q;
                } else {
                    ow5Var = b11.r;
                }
                ow5 ow5Var3 = ow5Var;
                do {
                    unsafe2 = fx.a;
                    if (unsafe2.compareAndSwapObject(this, s, objectVolatile, ow5Var3)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                q7c.a(1, objectVolatile);
                ((ur4) objectVolatile).invoke(k());
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
        z01 z01Var = this;
        Unsafe unsafe = fx.a;
        long longVolatile = unsafe.getLongVolatile(z01Var, F);
        long j = 1152921504606846975L;
        if (z01Var.r(longVolatile, false)) {
            z = false;
        } else {
            z = !z01Var.b(longVolatile & 1152921504606846975L);
        }
        oj1 oj1Var = pj1.b;
        if (z) {
            return oj1Var;
        }
        ow5 ow5Var = b11.j;
        qj1 qj1Var = (qj1) unsafe.getObjectVolatile(z01Var, E);
        while (true) {
            long andIncrement = b.getAndIncrement(z01Var);
            long j2 = andIncrement & j;
            boolean r2 = z01Var.r(andIncrement, false);
            int i = b11.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (qj1Var.d != j4) {
                qj1 i3 = z01Var.i(j4, qj1Var);
                if (i3 == null) {
                    if (r2) {
                        return new nj1(z01Var.n());
                    }
                    j = 1152921504606846975L;
                } else {
                    qj1Var = i3;
                }
            }
            int D = z01Var.D(qj1Var, i2, obj, j2, ow5Var, r2);
            g9c g9cVar = g9c.a;
            if (D != 0) {
                if (D != 1) {
                    noc nocVar = null;
                    if (D != 2) {
                        if (D != 3) {
                            if (D != 4) {
                                if (D == 5) {
                                    qj1Var.b();
                                }
                                j = 1152921504606846975L;
                                z01Var = this;
                            } else {
                                if (j2 < m()) {
                                    qj1Var.b();
                                }
                                return new nj1(n());
                            }
                        } else {
                            grb.i("unexpected");
                            return null;
                        }
                    } else if (r2) {
                        qj1Var.i();
                        return new nj1(n());
                    } else {
                        if (ow5Var instanceof noc) {
                            nocVar = (noc) ow5Var;
                        }
                        if (nocVar != null) {
                            nocVar.a(qj1Var, i2 + i);
                        }
                        qj1Var.i();
                        return oj1Var;
                    }
                } else {
                    return g9cVar;
                }
            } else {
                qj1Var.b();
                return g9cVar;
            }
        }
    }

    public final defpackage.qj1 e(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.e(long):qj1");
    }

    public final void f(long j) {
        qj1 qj1Var = (qj1) fx.a.getObjectVolatile(this, x);
        while (true) {
            Unsafe unsafe = fx.a;
            long j2 = y;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.a + longVolatile, this.j())) {
                return;
            }
            z01 z01Var = this;
            if (unsafe.compareAndSwapLong(z01Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = b11.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (qj1Var.d != j4) {
                    qj1 h2 = z01Var.h(j4, qj1Var);
                    if (h2 != null) {
                        qj1Var = h2;
                    }
                }
                qj1 qj1Var2 = qj1Var;
                if (z01Var.C(qj1Var2, i, longVolatile, null) == b11.o) {
                    if (longVolatile < z01Var.o()) {
                        qj1Var2.b();
                    }
                } else {
                    qj1Var2.b();
                }
                this = z01Var;
                qj1Var = qj1Var2;
            }
            this = z01Var;
        }
    }

    public final void g() {
        Object b2;
        Unsafe unsafe;
        if (v()) {
            return;
        }
        Unsafe unsafe2 = fx.a;
        long j = r;
        qj1 qj1Var = (qj1) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / b11.b;
            if (o() <= andIncrement) {
                if (qj1Var.d < j2 && qj1Var.c() != null) {
                    w(j2, qj1Var);
                }
                p(1L);
                return;
            }
            if (qj1Var.d != j2) {
                a11 a11Var = a11.a;
                while (true) {
                    b2 = td3.b(qj1Var, j2, a11Var);
                    if (mye.b(b2)) {
                        break;
                    }
                    hz9 a = mye.a(b2);
                    while (true) {
                        hz9 hz9Var = (hz9) fx.a.getObjectVolatile(this, j);
                        if (hz9Var.d >= a.d) {
                            break;
                        } else if (a.j()) {
                            do {
                                unsafe = fx.a;
                                if (unsafe.compareAndSwapObject(this, r, hz9Var, a)) {
                                    if (hz9Var.f()) {
                                        hz9Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == hz9Var);
                            if (a.f()) {
                                a.e();
                            }
                        }
                    }
                }
                qj1 qj1Var2 = null;
                if (mye.b(b2)) {
                    t();
                    w(j2, qj1Var);
                    p(1L);
                } else {
                    qj1 qj1Var3 = (qj1) mye.a(b2);
                    long j3 = qj1Var3.d;
                    if (j3 > j2) {
                        long j4 = b11.b * j3;
                        if (!fx.a.compareAndSwapLong(this, n, 1 + andIncrement, j4)) {
                            p(1L);
                        } else {
                            p(j4 - andIncrement);
                        }
                    } else {
                        qj1Var2 = qj1Var3;
                    }
                }
                if (qj1Var2 != null) {
                    qj1Var = qj1Var2;
                } else {
                    continue;
                }
            }
            int i = (int) (andIncrement % b11.b);
            Object l = qj1Var.l(i);
            boolean z = l instanceof noc;
            long j5 = y;
            if (!z || andIncrement < fx.a.getLongVolatile(this, j5) || !qj1Var.k(i, l, b11.g)) {
                while (true) {
                    Object l2 = qj1Var.l(i);
                    if (l2 instanceof noc) {
                        if (andIncrement < fx.a.getLongVolatile(this, j5)) {
                            if (qj1Var.k(i, l2, new ooc((noc) l2))) {
                                break loop0;
                            }
                        } else if (qj1Var.k(i, l2, b11.g)) {
                            if (B(l2)) {
                                qj1Var.o(i, b11.d);
                                break;
                            } else {
                                qj1Var.o(i, b11.j);
                                qj1Var.i();
                            }
                        }
                    } else if (l2 != b11.j) {
                        if (l2 == null) {
                            if (qj1Var.k(i, l2, b11.e)) {
                                break loop0;
                            }
                        } else if (l2 == b11.d || l2 == b11.h || l2 == b11.i || l2 == b11.k || l2 == b11.l) {
                            break loop0;
                        } else if (l2 != b11.f) {
                            lq5.i(l2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
                p(1L);
            } else if (B(l)) {
                qj1Var.o(i, b11.d);
                break;
            } else {
                qj1Var.o(i, b11.j);
                qj1Var.i();
                p(1L);
            }
        }
        p(1L);
    }

    public final defpackage.qj1 h(long r16, defpackage.qj1 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.h(long, qj1):qj1");
    }

    public final qj1 i(long j, qj1 qj1Var) {
        Object b2;
        qj1 qj1Var2;
        long j2;
        Unsafe unsafe;
        z01 z01Var = this;
        qj1 qj1Var3 = b11.a;
        a11 a11Var = a11.a;
        loop0: while (true) {
            b2 = td3.b(qj1Var, j, a11Var);
            if (mye.b(b2)) {
                break;
            }
            hz9 a = mye.a(b2);
            while (true) {
                Unsafe unsafe2 = fx.a;
                long j3 = E;
                hz9 hz9Var = (hz9) unsafe2.getObjectVolatile(z01Var, j3);
                if (hz9Var.d >= a.d) {
                    break loop0;
                } else if (a.j()) {
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(z01Var, E, hz9Var, a)) {
                            if (hz9Var.f()) {
                                hz9Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(z01Var, j3) == hz9Var);
                    if (a.f()) {
                        a.e();
                    }
                }
            }
        }
        qj1 qj1Var4 = null;
        if (mye.b(b2)) {
            z01Var.t();
            if (qj1Var.d * b11.b >= z01Var.m()) {
                return null;
            }
            qj1Var.b();
            return null;
        }
        qj1 qj1Var5 = (qj1) mye.a(b2);
        long j4 = qj1Var5.d;
        if (j4 > j) {
            long j5 = j4 * b11.b;
            while (true) {
                Unsafe unsafe3 = fx.a;
                long j6 = F;
                long longVolatile = unsafe3.getLongVolatile(z01Var, j6);
                long j7 = 1152921504606846975L & longVolatile;
                if (j7 >= j5) {
                    qj1Var2 = qj1Var4;
                    j2 = j4;
                    break;
                }
                qj1Var2 = qj1Var4;
                j2 = j4;
                if (unsafe3.compareAndSwapLong(z01Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                    break;
                }
                z01Var = this;
                qj1Var4 = qj1Var2;
                j4 = j2;
            }
            if (j2 * b11.b < m()) {
                qj1Var5.b();
                return qj1Var2;
            }
            return qj1Var2;
        }
        return qj1Var5;
    }

    public final long j() {
        return fx.a.getLongVolatile(this, n);
    }

    public final Throwable k() {
        return (Throwable) fx.a.getObjectVolatile(this, h);
    }

    public final Throwable l() {
        Throwable k = k();
        if (k == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return k;
    }

    public final long m() {
        return fx.a.getLongVolatile(this, y);
    }

    public final Throwable n() {
        Throwable k = k();
        if (k == null) {
            return new IllegalStateException("Channel was closed");
        }
        return k;
    }

    public final long o() {
        return fx.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void p(long j) {
        if ((e.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((fx.a.getLongVolatile(this, w) & 4611686018427387904L) != 0);
        }
    }

    public final boolean r(long r12, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(fx.a.getLongVolatile(this, F), true);
    }

    public final void t() {
        r(fx.a.getLongVolatile(this, F), false);
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.toString():java.lang.String");
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

    public final void w(long r7, defpackage.qj1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z01.w(long, qj1):void");
    }

    public final Object x(zw2 zw2Var, Object obj) {
        va1 va1Var = new va1(1, xpe.a(zw2Var));
        va1Var.s();
        va1Var.resumeWith(new ge9(n()));
        Object q = va1Var.q();
        if (q == vx2.a) {
            return q;
        }
        return g9c.a;
    }

    public final void y(Object obj, va1 va1Var) {
        va1Var.resumeWith(new ge9(n()));
    }

    public final void z(noc nocVar, boolean z) {
        Throwable n2;
        if (nocVar instanceof ta1) {
            zw2 zw2Var = (zw2) nocVar;
            if (z) {
                n2 = l();
            } else {
                n2 = n();
            }
            zw2Var.resumeWith(new ge9(n2));
        } else if (nocVar instanceof y01) {
            y01 y01Var = (y01) nocVar;
            va1 va1Var = y01Var.b;
            va1Var.getClass();
            y01Var.b = null;
            y01Var.a = b11.l;
            Throwable k = y01Var.c.k();
            if (k == null) {
                va1Var.resumeWith(Boolean.FALSE);
            } else {
                va1Var.resumeWith(new ge9(k));
            }
        } else {
            lq5.i(nocVar, "Unexpected waiter: ");
        }
    }
}
