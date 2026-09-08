package be;

import ee.t;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import v7.t7;
import zd.i2;
import zd.l;
public class b {
    public static final AtomicLongFieldUpdater f2620b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f2621c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f2622e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f2623f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f2624g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f2625i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f2626j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f2627a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public b(int i10) {
        long j3;
        this.f2627a = i10;
        if (i10 >= 0) {
            h hVar = d.f2629a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j3 = i10;
                } else {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                j3 = 0;
            }
            this.bufferEnd$volatile = j3;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            h hVar2 = new h(0L, null, this, 3);
            this.sendSegment$volatile = hVar2;
            this.receiveSegment$volatile = hVar2;
            if (j()) {
                hVar2 = d.f2629a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f2644r;
            return;
        }
        throw new IllegalArgumentException(i2.g.j(i10, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2622e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f2629a;
            d9.f b10 = lVar.b(null, gd.i.f10616a);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j3) {
        if (j3 >= d.get(this) && j3 >= f2621c.get(this) + this.f2627a) {
            return false;
        }
        return true;
    }

    public final h b(long j3) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f2623f.get(this);
        if (hVar.f9120c > ((h) obj2).f9120c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f2624g.get(this);
        int i10 = (hVar2.f9120c > ((h) obj2).f9120c ? 1 : (hVar2.f9120c == ((h) obj2).f9120c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        ee.d dVar = (ee.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.d.f9095a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            d9.f fVar = ee.a.f9089b;
            obj = null;
            if (obj3 == fVar) {
                break;
            }
            ee.d dVar2 = (ee.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, fVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        h hVar4 = (h) dVar;
        h hVar5 = hVar4;
        loop2: while (hVar5 != null) {
            int i11 = d.f2630b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f9120c * d.f2630b) + i11 < j3) {
                    break loop2;
                }
                while (true) {
                    Object l4 = hVar5.l(i11);
                    if (l4 != null && l4 != d.f2632e) {
                        if (l4 instanceof j) {
                            if (hVar5.k(i11, l4, d.f2638l)) {
                                obj = ee.a.e(obj, ((j) l4).f2649a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l4 instanceof i2)) {
                            break;
                        } else if (hVar5.k(i11, l4, d.f2638l)) {
                            obj = ee.a.e(obj, l4);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l4, d.f2638l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((ee.d) ee.d.f9096b.get(hVar5));
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l((i2) obj, true);
                return hVar4;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((i2) arrayList.get(size), true);
            }
        }
        return hVar4;
    }

    public final void c() {
        i(f2620b.get(this), false);
    }

    public final void d() {
        Object a2;
        if (j()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j3 = andIncrement / d.f2630b;
            if (g() <= andIncrement) {
                if (hVar.f9120c < j3 && hVar.c() != null) {
                    k(j3, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f9120c != j3) {
                c cVar = c.f2628a;
                while (true) {
                    a2 = ee.a.a(hVar, j3, cVar);
                    if (!ee.a.d(a2)) {
                        t b10 = ee.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f9120c >= b10.f9120c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                h hVar2 = null;
                if (ee.a.d(a2)) {
                    c();
                    k(j3, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) ee.a.b(a2);
                    long j10 = hVar3.f9120c;
                    if (j10 > j3) {
                        long j11 = j10 * d.f2630b;
                        if (d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f2622e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            h(this);
                        }
                    } else {
                        hVar2 = hVar3;
                    }
                }
                if (hVar2 == null) {
                    continue;
                } else {
                    hVar = hVar2;
                }
            }
            int i10 = (int) (andIncrement % d.f2630b);
            Object l4 = hVar.l(i10);
            boolean z10 = l4 instanceof i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2621c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l4, d.f2634g)) {
                while (true) {
                    Object l10 = hVar.l(i10);
                    if (l10 instanceof i2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l10, new j((i2) l10))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l10, d.f2634g)) {
                            if (n(l10)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f2636j);
                                hVar.i();
                            }
                        }
                    } else if (l10 != d.f2636j) {
                        if (l10 == null) {
                            if (hVar.k(i10, l10, d.f2632e)) {
                                break loop0;
                            }
                        } else if (l10 == d.d || l10 == d.h || l10 == d.f2635i || l10 == d.f2637k || l10 == d.f2638l) {
                            break loop0;
                        } else if (l10 != d.f2633f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l10).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (n(l4)) {
                hVar.o(i10, d.d);
                break;
            } else {
                hVar.o(i10, d.f2636j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j3, h hVar) {
        Object a2;
        long j10;
        h hVar2 = d.f2629a;
        c cVar = c.f2628a;
        loop0: while (true) {
            a2 = ee.a.a(hVar, j3, cVar);
            if (!ee.a.d(a2)) {
                t b10 = ee.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2624g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f9120c >= b10.f9120c) {
                        break loop0;
                    } else if (!b10.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b10.f()) {
                                    b10.e();
                                }
                            }
                        }
                        if (tVar.f()) {
                            tVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (ee.a.d(a2)) {
            c();
            if (hVar.f9120c * d.f2630b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) ee.a.b(a2);
            long j11 = hVar3.f9120c;
            if (!j() && j3 <= d.get(this) / d.f2630b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f9120c >= j11 || !hVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, hVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (hVar3.f()) {
                                hVar3.e();
                            }
                        }
                    }
                    if (tVar2.f()) {
                        tVar2.e();
                    }
                }
            }
            if (j11 > j3) {
                long j12 = j11 * d.f2630b;
                do {
                    j10 = f2621c.get(this);
                    if (j10 >= j12) {
                        break;
                    }
                } while (!f2621c.compareAndSet(this, j10, j12));
                if (j11 * d.f2630b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f2625i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f2620b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r15, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: be.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j3 = d.get(this);
        if (j3 != 0 && j3 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r6, be.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: be.b.k(long, be.h):void");
    }

    public final void l(i2 i2Var, boolean z10) {
        Throwable f7;
        if (i2Var instanceof l) {
            id.c cVar = (id.c) i2Var;
            if (z10) {
                f7 = (Throwable) f2625i.get(this);
                if (f7 == null) {
                    f7 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f7 = f();
            }
            cVar.resumeWith(t7.a(f7));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
    }

    public final boolean m(Object obj, k kVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f2629a;
            d9.f b10 = lVar.b(null, kVar);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f2648f;
        Object l4 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2620b;
        if (l4 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f2640n;
                }
                if (hVar.k(i10, l4, obj)) {
                    d();
                    return d.f2639m;
                }
            }
        } else if (l4 == d.d && hVar.k(i10, l4, d.f2635i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 != null && l10 != d.f2632e) {
                if (l10 == d.d) {
                    if (hVar.k(i10, l10, d.f2635i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    d9.f fVar = d.f2636j;
                    if (l10 == fVar) {
                        return d.f2641o;
                    }
                    if (l10 == d.h) {
                        return d.f2641o;
                    }
                    if (l10 == d.f2638l) {
                        d();
                        return d.f2641o;
                    } else if (l10 != d.f2634g && hVar.k(i10, l10, d.f2633f)) {
                        boolean z10 = l10 instanceof j;
                        if (z10) {
                            l10 = ((j) l10).f2649a;
                        }
                        if (n(l10)) {
                            hVar.o(i10, d.f2635i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, fVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f2641o;
                    }
                }
            } else if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l10, d.h)) {
                    d();
                    return d.f2641o;
                }
            } else if (obj == null) {
                return d.f2640n;
            } else {
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f2639m;
                }
            }
        }
    }

    public final int p(h hVar, int i10, k kVar, long j3, Object obj, boolean z10) {
        while (true) {
            Object l4 = hVar.l(i10);
            if (l4 == null) {
                if (a(j3) && !z10) {
                    if (hVar.k(i10, null, d.d)) {
                        break;
                    }
                } else if (z10) {
                    if (hVar.k(i10, null, d.f2636j)) {
                        hVar.i();
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (hVar.k(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (l4 == d.f2632e) {
                if (hVar.k(i10, l4, d.d)) {
                    break;
                }
            } else {
                d9.f fVar = d.f2637k;
                if (l4 == fVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.f2638l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l4 instanceof j) {
                        l4 = ((j) l4).f2649a;
                    }
                    if (m(l4, kVar)) {
                        hVar.o(i10, d.f2635i);
                        return 0;
                    }
                    if (hVar.f2648f.getAndSet((i10 * 2) + 1, fVar) != fVar) {
                        hVar.m(i10, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void q(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        b bVar = this;
        if (!bVar.j()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(bVar) > j3) {
                    break;
                }
                bVar = this;
            }
            int i10 = d.f2631c;
            int i11 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2622e;
                if (i11 < i10) {
                    long j10 = atomicLongFieldUpdater.get(bVar);
                    if (j10 != (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) || j10 != atomicLongFieldUpdater.get(bVar)) {
                        i11++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j11 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        bVar = this;
                    }
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(bVar);
                        long j13 = atomicLongFieldUpdater2.get(bVar);
                        long j14 = j13 & 4611686018427387903L;
                        if ((j13 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j12 == j14 && j12 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else if (!z10) {
                            bVar = this;
                            atomicLongFieldUpdater2.compareAndSet(bVar, j13, 4611686018427387904L + j14);
                        } else {
                            bVar = this;
                        }
                    }
                    while (true) {
                        long j15 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j15, j15 & 4611686018427387903L)) {
                            return;
                        }
                        bVar = this;
                    }
                }
            }
        }
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: be.b.toString():java.lang.String");
    }
}
