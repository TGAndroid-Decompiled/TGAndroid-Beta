package ee;

import a8.jd;
import ce.j2;
import ce.l;
import he.t;
import he.v;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
public class b {
    public static final AtomicLongFieldUpdater f9895b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f9896c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f9897f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f9898g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f9899i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f9900j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f9901a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public b(int i10) {
        long j10;
        this.f9901a = i10;
        if (i10 >= 0) {
            h hVar = d.f9903a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j10 = i10;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd$volatile = j10;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            h hVar2 = new h(0L, null, this, 3);
            this.sendSegment$volatile = hVar2;
            this.receiveSegment$volatile = hVar2;
            if (j()) {
                hVar2 = d.f9903a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f9917r;
            return;
        }
        throw new IllegalArgumentException(ic.a.j(i10, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f9903a;
            v d10 = lVar.d(null, jd.i.f15580a);
            if (d10 != null) {
                lVar.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f9896c.get(this) + this.f9901a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f9897f.get(this);
        if (hVar.f12818c > ((h) obj2).f12818c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f9898g.get(this);
        int i10 = (hVar2.f12818c > ((h) obj2).f12818c ? 1 : (hVar2.f12818c == ((h) obj2).f12818c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        he.d dVar = (he.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.d.f12796a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            v vVar = he.a.f12791b;
            obj = null;
            if (obj3 == vVar) {
                break;
            }
            he.d dVar2 = (he.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, vVar)) {
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
            int i11 = d.f9904b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f12818c * d.f9904b) + i11 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l4 = hVar5.l(i11);
                    if (l4 != null && l4 != d.e) {
                        if (l4 instanceof j) {
                            if (hVar5.k(i11, l4, d.f9911l)) {
                                obj = he.a.e(obj, ((j) l4).f9921a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l4 instanceof j2)) {
                            break;
                        } else if (hVar5.k(i11, l4, d.f9911l)) {
                            obj = he.a.e(obj, l4);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l4, d.f9911l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((he.d) he.d.f12797b.get(hVar5));
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l((j2) obj, true);
                return hVar4;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((j2) arrayList.get(size), true);
            }
        }
        return hVar4;
    }

    public final void c() {
        i(f9895b.get(this), false);
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
            long j10 = andIncrement / d.f9904b;
            if (g() <= andIncrement) {
                if (hVar.f12818c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f12818c != j10) {
                c cVar = c.f9902a;
                while (true) {
                    a2 = he.a.a(hVar, j10, cVar);
                    if (!he.a.d(a2)) {
                        t b10 = he.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f12818c >= b10.f12818c) {
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
                if (he.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) he.a.b(a2);
                    long j11 = hVar3.f12818c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f9904b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i10 = (int) (andIncrement % d.f9904b);
            Object l4 = hVar.l(i10);
            boolean z10 = l4 instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9896c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l4, d.f9907g)) {
                while (true) {
                    Object l10 = hVar.l(i10);
                    if (l10 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l10, new j((j2) l10))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l10, d.f9907g)) {
                            if (n(l10)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f9909j);
                                hVar.i();
                            }
                        }
                    } else if (l10 != d.f9909j) {
                        if (l10 == null) {
                            if (hVar.k(i10, l10, d.e)) {
                                break loop0;
                            }
                        } else if (l10 == d.d || l10 == d.h || l10 == d.f9908i || l10 == d.f9910k || l10 == d.f9911l) {
                            break loop0;
                        } else if (l10 != d.f9906f) {
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
                hVar.o(i10, d.f9909j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f9903a;
        c cVar = c.f9902a;
        loop0: while (true) {
            a2 = he.a.a(hVar, j10, cVar);
            if (!he.a.d(a2)) {
                t b10 = he.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9898g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f12818c >= b10.f12818c) {
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
        if (he.a.d(a2)) {
            c();
            if (hVar.f12818c * d.f9904b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) he.a.b(a2);
            long j12 = hVar3.f12818c;
            if (!j() && j10 <= d.get(this) / d.f9904b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f12818c >= j12 || !hVar3.j()) {
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
            if (j12 > j10) {
                long j13 = j12 * d.f9904b;
                do {
                    j11 = f9896c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f9896c.compareAndSet(this, j11, j13));
                if (j12 * d.f9904b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f9899i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f9895b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ee.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r5, ee.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: ee.b.k(long, ee.h):void");
    }

    public final void l(j2 j2Var, boolean z10) {
        Throwable f7;
        if (j2Var instanceof l) {
            ld.c cVar = (ld.c) j2Var;
            if (z10) {
                f7 = (Throwable) f9899i.get(this);
                if (f7 == null) {
                    f7 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f7 = f();
            }
            cVar.resumeWith(jd.a(f7));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
    }

    public final boolean m(Object obj, k kVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f9903a;
            v d10 = lVar.d(null, kVar);
            if (d10 != null) {
                lVar.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f9920f;
        Object l4 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9895b;
        if (l4 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f9913n;
                }
                if (hVar.k(i10, l4, obj)) {
                    d();
                    return d.f9912m;
                }
            }
        } else if (l4 == d.d && hVar.k(i10, l4, d.f9908i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 != null && l10 != d.e) {
                if (l10 == d.d) {
                    if (hVar.k(i10, l10, d.f9908i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    v vVar = d.f9909j;
                    if (l10 == vVar) {
                        return d.f9914o;
                    }
                    if (l10 == d.h) {
                        return d.f9914o;
                    }
                    if (l10 == d.f9911l) {
                        d();
                        return d.f9914o;
                    } else if (l10 != d.f9907g && hVar.k(i10, l10, d.f9906f)) {
                        boolean z10 = l10 instanceof j;
                        if (z10) {
                            l10 = ((j) l10).f9921a;
                        }
                        if (n(l10)) {
                            hVar.o(i10, d.f9908i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, vVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f9914o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l10, d.h)) {
                    d();
                    return d.f9914o;
                }
            } else if (obj == null) {
                return d.f9913n;
            } else {
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f9912m;
                }
            }
        }
    }

    public final int p(h hVar, int i10, k kVar, long j10, Object obj, boolean z10) {
        while (true) {
            Object l4 = hVar.l(i10);
            if (l4 == null) {
                if (a(j10) && !z10) {
                    if (hVar.k(i10, null, d.d)) {
                        break;
                    }
                } else if (z10) {
                    if (hVar.k(i10, null, d.f9909j)) {
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
            } else if (l4 == d.e) {
                if (hVar.k(i10, l4, d.d)) {
                    break;
                }
            } else {
                v vVar = d.f9910k;
                if (l4 == vVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.f9911l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l4 instanceof j) {
                        l4 = ((j) l4).f9921a;
                    }
                    if (m(l4, kVar)) {
                        hVar.o(i10, d.f9908i);
                        return 0;
                    }
                    if (hVar.f9920f.getAndSet((i10 * 2) + 1, vVar) != vVar) {
                        hVar.m(i10, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void q(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        b bVar = this;
        if (!bVar.j()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(bVar) > j10) {
                    break;
                }
                bVar = this;
            }
            int i10 = d.f9905c;
            int i11 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
                if (i11 < i10) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    if (j11 != (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) || j11 != atomicLongFieldUpdater.get(bVar)) {
                        i11++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j12 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        bVar = this;
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater.get(bVar);
                        long j14 = atomicLongFieldUpdater2.get(bVar);
                        long j15 = j14 & 4611686018427387903L;
                        if ((j14 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j13 == j15 && j13 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else if (!z10) {
                            bVar = this;
                            atomicLongFieldUpdater2.compareAndSet(bVar, j14, 4611686018427387904L + j15);
                        } else {
                            bVar = this;
                        }
                    }
                    while (true) {
                        long j16 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j16, j16 & 4611686018427387903L)) {
                            return;
                        }
                        bVar = this;
                    }
                }
            }
        }
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: ee.b.toString():java.lang.String");
    }
}
