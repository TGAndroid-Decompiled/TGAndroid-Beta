package be;

import c8.u0;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.c2;
public class c implements g {
    public static final AtomicLongFieldUpdater f3188b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f3189c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f3190e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f3191f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater f3192n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f3193r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f3194s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f3195a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public c(int i7) {
        long j3;
        this.f3195a = i7;
        if (i7 >= 0) {
            k kVar = e.f3197a;
            if (i7 != 0) {
                if (i7 != Integer.MAX_VALUE) {
                    j3 = i7;
                } else {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                j3 = 0;
            }
            this.bufferEnd$volatile = j3;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment$volatile = kVar2;
            this.receiveSegment$volatile = kVar2;
            if (t()) {
                kVar2 = e.f3197a;
                kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = kVar2;
            this._closeCause$volatile = e.f3213s;
            return;
        }
        throw new IllegalArgumentException(jg.g.k(i7, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static final k c(c cVar, long j3, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.f3197a;
        d dVar = d.f3196a;
        loop0: while (true) {
            b10 = ee.a.b(kVar, j3, dVar);
            if (!ee.a.e(b10)) {
                ee.r c10 = ee.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3191f;
                    ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f10794c >= c10.f10794c) {
                        break loop0;
                    } else if (!c10.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c10)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                                if (c10.f()) {
                                    c10.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean e10 = ee.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3189c;
        if (e10) {
            cVar.i();
            if (kVar.f10794c * e.f3198b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) ee.a.c(b10);
            long j10 = kVar3.f10794c;
            if (j10 > j3) {
                long j11 = e.f3198b * j10;
                while (true) {
                    long j12 = f3188b.get(cVar);
                    long j13 = 1152921504606846975L & j12;
                    if (j13 >= j11) {
                        cVar2 = cVar;
                        break;
                    }
                    cVar2 = cVar;
                    if (f3188b.compareAndSet(cVar2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                        break;
                    }
                    cVar = cVar2;
                }
                if (j10 * e.f3198b < atomicLongFieldUpdater.get(cVar2)) {
                    kVar3.b();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, zd.m mVar) {
        mVar.resumeWith(af.b.b(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i7, Object obj, long j3, Object obj2, boolean z9) {
        kVar.n(i7, obj);
        if (z9) {
            return cVar.A(kVar, i7, obj, j3, obj2, z9);
        }
        Object l10 = kVar.l(i7);
        if (l10 == null) {
            if (cVar.f(j3)) {
                if (kVar.k(i7, null, e.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof c2) {
            kVar.n(i7, null);
            if (cVar.x(l10, obj)) {
                kVar.o(i7, e.f3203i);
                return 0;
            }
            com.google.android.gms.internal.clearcut.e eVar = e.f3205k;
            if (kVar.f3221f.getAndSet((i7 * 2) + 1, eVar) != eVar) {
                kVar.m(i7, true);
                return 5;
            }
            return 5;
        }
        return cVar.A(kVar, i7, obj, j3, obj2, z9);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3190e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof zd.l) {
            zd.l lVar = (zd.l) obj;
            k kVar = e.f3197a;
            com.google.android.gms.internal.clearcut.e d2 = lVar.d(gd.k.f13829a, null);
            if (d2 != null) {
                lVar.f(d2);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(k kVar, int i7, Object obj, long j3, Object obj2, boolean z9) {
        while (true) {
            Object l10 = kVar.l(i7);
            if (l10 == null) {
                if (f(j3) && !z9) {
                    if (kVar.k(i7, null, e.d)) {
                        break;
                    }
                } else if (z9) {
                    if (kVar.k(i7, null, e.f3204j)) {
                        kVar.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (kVar.k(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l10 == e.f3200e) {
                if (kVar.k(i7, l10, e.d)) {
                    break;
                }
            } else {
                com.google.android.gms.internal.clearcut.e eVar = e.f3205k;
                if (l10 == eVar) {
                    kVar.n(i7, null);
                    return 5;
                } else if (l10 == e.h) {
                    kVar.n(i7, null);
                    return 5;
                } else if (l10 == e.f3206l) {
                    kVar.n(i7, null);
                    i();
                    return 4;
                } else {
                    kVar.n(i7, null);
                    if (l10 instanceof v) {
                        l10 = ((v) l10).f3231a;
                    }
                    if (x(l10, obj)) {
                        kVar.o(i7, e.f3203i);
                        return 0;
                    }
                    if (kVar.f3221f.getAndSet((i7 * 2) + 1, eVar) != eVar) {
                        kVar.m(i7, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void B(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z9;
        c cVar = this;
        if (!cVar.t()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(cVar) > j3) {
                    break;
                }
                cVar = this;
            }
            int i7 = e.f3199c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3190e;
                if (i10 < i7) {
                    long j10 = atomicLongFieldUpdater.get(cVar);
                    if (j10 != (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) || j10 != atomicLongFieldUpdater.get(cVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j11 = atomicLongFieldUpdater2.get(cVar);
                        if (atomicLongFieldUpdater2.compareAndSet(cVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        cVar = this;
                    }
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(cVar);
                        long j13 = atomicLongFieldUpdater2.get(cVar);
                        long j14 = j13 & 4611686018427387903L;
                        if ((j13 & 4611686018427387904L) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j12 == j14 && j12 == atomicLongFieldUpdater.get(cVar)) {
                            break;
                        } else if (!z9) {
                            cVar = this;
                            atomicLongFieldUpdater2.compareAndSet(cVar, j13, 4611686018427387904L + j14);
                        } else {
                            cVar = this;
                        }
                    }
                    while (true) {
                        long j15 = atomicLongFieldUpdater2.get(cVar);
                        if (atomicLongFieldUpdater2.compareAndSet(cVar, j15, j15 & 4611686018427387903L)) {
                            return;
                        }
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object a(id.c r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: be.c.a(id.c, java.lang.Object):java.lang.Object");
    }

    @Override
    public Object b(Object obj) {
        boolean z9;
        c2 c2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3188b;
        long j3 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j10 = 1152921504606846975L;
        if (r(j3, false)) {
            z9 = false;
        } else {
            z9 = !f(j3 & 1152921504606846975L);
        }
        i iVar = j.f3218b;
        if (z9) {
            return iVar;
        }
        com.google.android.gms.internal.clearcut.e eVar = e.f3204j;
        k kVar = (k) f3191f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean r10 = r(andIncrement, z10);
            int i7 = e.f3198b;
            long j12 = i7;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (kVar.f10794c != j13) {
                k c10 = c(this, j13, kVar);
                if (c10 == null) {
                    if (r10) {
                        return new h(o());
                    }
                    z10 = false;
                    j10 = 1152921504606846975L;
                } else {
                    kVar = c10;
                }
            }
            int e10 = e(this, kVar, i10, obj, j11, eVar, r10);
            gd.k kVar2 = gd.k.f13829a;
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2) {
                        if (e10 != 3) {
                            if (e10 != 4) {
                                if (e10 == 5) {
                                    kVar.b();
                                }
                                z10 = false;
                                j10 = 1152921504606846975L;
                            } else {
                                if (j11 < f3189c.get(this)) {
                                    kVar.b();
                                }
                                return new h(o());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (r10) {
                        kVar.i();
                        return new h(o());
                    } else {
                        if (eVar instanceof c2) {
                            c2Var = (c2) eVar;
                        } else {
                            c2Var = null;
                        }
                        if (c2Var != null) {
                            c2Var.a(kVar, i10 + i7);
                        }
                        kVar.i();
                        return iVar;
                    }
                } else {
                    return kVar2;
                }
            } else {
                kVar.b();
                return kVar2;
            }
        }
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean f(long j3) {
        if (j3 >= d.get(this) && j3 >= f3189c.get(this) + this.f3195a) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.Throwable r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: be.c.g(java.lang.Throwable, boolean):boolean");
    }

    public final be.k h(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: be.c.h(long):be.k");
    }

    public final void i() {
        r(f3188b.get(this), false);
    }

    public final void j(long j3) {
        k kVar = (k) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3189c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f3195a + j10, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = e.f3198b;
                long j12 = j10 / j11;
                int i7 = (int) (j10 % j11);
                if (kVar.f10794c != j12) {
                    k l10 = l(j12, kVar);
                    if (l10 != null) {
                        kVar = l10;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i7, j10, null) == e.f3209o) {
                    if (j10 < p()) {
                        kVar2.b();
                    }
                } else {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b10;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3192n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j3 = andIncrement / e.f3198b;
            if (p() <= andIncrement) {
                if (kVar.f10794c < j3 && kVar.c() != null) {
                    u(j3, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f10794c != j3) {
                d dVar = d.f3196a;
                while (true) {
                    b10 = ee.a.b(kVar, j3, dVar);
                    if (!ee.a.e(b10)) {
                        ee.r c10 = ee.a.c(b10);
                        while (true) {
                            ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f10794c >= c10.f10794c) {
                                break;
                            } else if (!c10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c10.f()) {
                                            c10.e();
                                        }
                                    }
                                }
                                if (rVar.f()) {
                                    rVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (ee.a.e(b10)) {
                    i();
                    u(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) ee.a.c(b10);
                    long j10 = kVar3.f10794c;
                    if (j10 > j3) {
                        long j11 = j10 * e.f3198b;
                        if (d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3190e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i7 = (int) (andIncrement % e.f3198b);
            Object l10 = kVar.l(i7);
            boolean z9 = l10 instanceof c2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3189c;
            if (!z9 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.k(i7, l10, e.f3202g)) {
                while (true) {
                    Object l11 = kVar.l(i7);
                    if (l11 instanceof c2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.k(i7, l11, new v((c2) l11))) {
                                break loop0;
                            }
                        } else if (kVar.k(i7, l11, e.f3202g)) {
                            if (y(l11)) {
                                kVar.o(i7, e.d);
                                break;
                            } else {
                                kVar.o(i7, e.f3204j);
                                kVar.i();
                            }
                        }
                    } else if (l11 != e.f3204j) {
                        if (l11 == null) {
                            if (kVar.k(i7, l11, e.f3200e)) {
                                break loop0;
                            }
                        } else if (l11 == e.d || l11 == e.h || l11 == e.f3203i || l11 == e.f3205k || l11 == e.f3206l) {
                            break loop0;
                        } else if (l11 != e.f3201f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (y(l10)) {
                kVar.o(i7, e.d);
                break;
            } else {
                kVar.o(i7, e.f3204j);
                kVar.i();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j3, k kVar) {
        Object b10;
        long j10;
        k kVar2 = e.f3197a;
        d dVar = d.f3196a;
        loop0: while (true) {
            b10 = ee.a.b(kVar, j3, dVar);
            if (!ee.a.e(b10)) {
                ee.r c10 = ee.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f10794c >= c10.f10794c) {
                        break loop0;
                    } else if (!c10.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c10.f()) {
                                    c10.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (ee.a.e(b10)) {
            i();
            if (kVar.f10794c * e.f3198b < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) ee.a.c(b10);
            long j11 = kVar3.f10794c;
            if (!t() && j3 <= d.get(this) / e.f3198b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3192n;
                    ee.r rVar2 = (ee.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f10794c >= j11 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j11 > j3) {
                long j12 = j11 * e.f3198b;
                do {
                    j10 = f3189c.get(this);
                    if (j10 >= j12) {
                        break;
                    }
                } while (!f3189c.compareAndSet(this, j10, j12));
                if (j11 * e.f3198b < p()) {
                    kVar3.b();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f3193r.get(this);
    }

    public final Throwable n() {
        Throwable m10 = m();
        if (m10 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return m10;
    }

    public final Throwable o() {
        Throwable m10 = m();
        if (m10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m10;
    }

    public final long p() {
        return f3188b.get(this) & 1152921504606846975L;
    }

    public final boolean r(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: be.c.r(long, boolean):boolean");
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j3 = d.get(this);
        if (j3 != 0 && j3 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: be.c.toString():java.lang.String");
    }

    public final void u(long r5, be.k r7) {
        throw new UnsupportedOperationException("Method not decompiled: be.c.u(long, be.k):void");
    }

    public final Object v(id.c cVar, Object obj) {
        zd.m mVar = new zd.m(1, u0.b(cVar));
        mVar.s();
        mVar.resumeWith(af.b.b(o()));
        Object r10 = mVar.r();
        if (r10 == jd.a.f16643a) {
            return r10;
        }
        return gd.k.f13829a;
    }

    public final void w(c2 c2Var, boolean z9) {
        Throwable o4;
        if (c2Var instanceof zd.l) {
            id.c cVar = (id.c) c2Var;
            if (z9) {
                o4 = n();
            } else {
                o4 = o();
            }
            cVar.resumeWith(af.b.b(o4));
        } else if (c2Var instanceof b) {
            b bVar = (b) c2Var;
            zd.m mVar = bVar.f3186b;
            kotlin.jvm.internal.j.b(mVar);
            bVar.f3186b = null;
            bVar.f3185a = e.f3206l;
            Throwable m10 = bVar.f3187c.m();
            if (m10 == null) {
                mVar.resumeWith(Boolean.FALSE);
            } else {
                mVar.resumeWith(af.b.b(m10));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + c2Var).toString());
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            zd.m mVar = bVar.f3186b;
            kotlin.jvm.internal.j.b(mVar);
            bVar.f3186b = null;
            bVar.f3185a = obj2;
            Boolean bool = Boolean.TRUE;
            k kVar = e.f3197a;
            com.google.android.gms.internal.clearcut.e d2 = mVar.d(bool, null);
            if (d2 == null) {
                return false;
            }
            mVar.f(d2);
            return true;
        } else if (obj instanceof zd.l) {
            zd.l lVar = (zd.l) obj;
            k kVar2 = e.f3197a;
            com.google.android.gms.internal.clearcut.e d10 = lVar.d(obj2, null);
            if (d10 == null) {
                return false;
            }
            lVar.f(d10);
            return true;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final Object z(k kVar, int i7, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f3221f;
        Object l10 = kVar.l(i7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3188b;
        if (l10 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f3208n;
                }
                if (kVar.k(i7, l10, obj)) {
                    k();
                    return e.f3207m;
                }
            }
        } else if (l10 == e.d && kVar.k(i7, l10, e.f3203i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            kVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object l11 = kVar.l(i7);
            if (l11 != null && l11 != e.f3200e) {
                if (l11 == e.d) {
                    if (kVar.k(i7, l11, e.f3203i)) {
                        k();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        kVar.n(i7, null);
                        return obj3;
                    }
                } else {
                    com.google.android.gms.internal.clearcut.e eVar = e.f3204j;
                    if (l11 == eVar) {
                        return e.f3209o;
                    }
                    if (l11 == e.h) {
                        return e.f3209o;
                    }
                    if (l11 == e.f3206l) {
                        k();
                        return e.f3209o;
                    } else if (l11 != e.f3202g && kVar.k(i7, l11, e.f3201f)) {
                        boolean z9 = l11 instanceof v;
                        if (z9) {
                            l11 = ((v) l11).f3231a;
                        }
                        if (y(l11)) {
                            kVar.o(i7, e.f3203i);
                            k();
                            Object obj4 = atomicReferenceArray.get(i7 * 2);
                            kVar.n(i7, null);
                            return obj4;
                        }
                        kVar.o(i7, eVar);
                        kVar.i();
                        if (z9) {
                            k();
                        }
                        return e.f3209o;
                    }
                }
            } else if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.k(i7, l11, e.h)) {
                    k();
                    return e.f3209o;
                }
            } else if (obj == null) {
                return e.f3208n;
            } else {
                if (kVar.k(i7, l11, obj)) {
                    k();
                    return e.f3207m;
                }
            }
        }
    }
}
