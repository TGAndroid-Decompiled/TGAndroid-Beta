package ld;

import i7.c7;
import j7.l1;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.i2;
import jd.l;
import od.u;
public class b {
    public static final AtomicLongFieldUpdater f15160b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f15161c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f15162e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f15163f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f15164g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f15165i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f15166j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f15167a;
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
        this.f15167a = i10;
        if (i10 >= 0) {
            h hVar = d.f15169a;
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
                hVar2 = d.f15169a;
                kotlin.jvm.internal.j.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f15184r;
            return;
        }
        throw new IllegalArgumentException(l1.l(i10, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15162e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f15169a;
            fc.a a2 = lVar.a(null, qc.i.f46603a);
            if (a2 != null) {
                lVar.e(a2);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f15161c.get(this) + this.f15167a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f15163f.get(this);
        if (hVar.f19536c > ((h) obj2).f19536c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f15164g.get(this);
        int i10 = (hVar2.f19536c > ((h) obj2).f19536c ? 1 : (hVar2.f19536c == ((h) obj2).f19536c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        od.d dVar = (od.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.d.f19508a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            fc.a aVar = od.a.f19502b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            od.d dVar2 = (od.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
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
            int i11 = d.f15170b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f19536c * d.f15170b) + i11 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l10 = hVar5.l(i11);
                    if (l10 != null && l10 != d.f15172e) {
                        if (l10 instanceof j) {
                            if (hVar5.k(i11, l10, d.f15178l)) {
                                obj = od.a.e(obj, ((j) l10).f15189a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l10 instanceof i2)) {
                            break;
                        } else if (hVar5.k(i11, l10, d.f15178l)) {
                            obj = od.a.e(obj, l10);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l10, d.f15178l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((od.d) od.d.f19509b.get(hVar5));
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
        i(f15160b.get(this), false);
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
            long j10 = andIncrement / d.f15170b;
            if (g() <= andIncrement) {
                if (hVar.f19536c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f19536c != j10) {
                c cVar = c.f15168a;
                while (true) {
                    a2 = od.a.a(hVar, j10, cVar);
                    if (!od.a.d(a2)) {
                        u b10 = od.a.b(a2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f19536c >= b10.f19536c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                    }
                                }
                                if (uVar.f()) {
                                    uVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                h hVar2 = null;
                if (od.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) od.a.b(a2);
                    long j11 = hVar3.f19536c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f15170b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f15162e;
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
            int i10 = (int) (andIncrement % d.f15170b);
            Object l10 = hVar.l(i10);
            boolean z10 = l10 instanceof i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15161c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l10, d.f15174g)) {
                while (true) {
                    Object l11 = hVar.l(i10);
                    if (l11 instanceof i2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l11, new j((i2) l11))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l11, d.f15174g)) {
                            if (n(l11)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f15176j);
                                hVar.i();
                            }
                        }
                    } else if (l11 != d.f15176j) {
                        if (l11 == null) {
                            if (hVar.k(i10, l11, d.f15172e)) {
                                break loop0;
                            }
                        } else if (l11 == d.d || l11 == d.h || l11 == d.f15175i || l11 == d.f15177k || l11 == d.f15178l) {
                            break loop0;
                        } else if (l11 != d.f15173f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (n(l10)) {
                hVar.o(i10, d.d);
                break;
            } else {
                hVar.o(i10, d.f15176j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f15169a;
        c cVar = c.f15168a;
        loop0: while (true) {
            a2 = od.a.a(hVar, j10, cVar);
            if (!od.a.d(a2)) {
                u b10 = od.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15164g;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f19536c >= b10.f19536c) {
                        break loop0;
                    } else if (!b10.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (b10.f()) {
                                    b10.e();
                                }
                            }
                        }
                        if (uVar.f()) {
                            uVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (od.a.d(a2)) {
            c();
            if (hVar.f19536c * d.f15170b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) od.a.b(a2);
            long j12 = hVar3.f19536c;
            if (!j() && j10 <= d.get(this) / d.f15170b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f19536c >= j12 || !hVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, hVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (hVar3.f()) {
                                hVar3.e();
                            }
                        }
                    }
                    if (uVar2.f()) {
                        uVar2.e();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * d.f15170b;
                do {
                    j11 = f15161c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f15161c.compareAndSet(this, j11, j13));
                if (j12 * d.f15170b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f15165i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f15160b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r15, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: ld.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r6, ld.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: ld.b.k(long, ld.h):void");
    }

    public final void l(i2 i2Var, boolean z10) {
        Throwable f9;
        if (i2Var instanceof l) {
            sc.c cVar = (sc.c) i2Var;
            if (z10) {
                f9 = (Throwable) f15165i.get(this);
                if (f9 == null) {
                    f9 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f9 = f();
            }
            cVar.resumeWith(c7.a(f9));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
    }

    public final boolean m(Object obj, k1.l lVar) {
        if (obj instanceof l) {
            l lVar2 = (l) obj;
            h hVar = d.f15169a;
            fc.a a2 = lVar2.a(null, lVar);
            if (a2 != null) {
                lVar2.e(a2);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f15188f;
        Object l10 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15160b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f15180n;
                }
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f15179m;
                }
            }
        } else if (l10 == d.d && hVar.k(i10, l10, d.f15175i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l11 = hVar.l(i10);
            if (l11 != null && l11 != d.f15172e) {
                if (l11 == d.d) {
                    if (hVar.k(i10, l11, d.f15175i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    fc.a aVar = d.f15176j;
                    if (l11 == aVar) {
                        return d.f15181o;
                    }
                    if (l11 == d.h) {
                        return d.f15181o;
                    }
                    if (l11 == d.f15178l) {
                        d();
                        return d.f15181o;
                    } else if (l11 != d.f15174g && hVar.k(i10, l11, d.f15173f)) {
                        boolean z10 = l11 instanceof j;
                        if (z10) {
                            l11 = ((j) l11).f15189a;
                        }
                        if (n(l11)) {
                            hVar.o(i10, d.f15175i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, aVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f15181o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l11, d.h)) {
                    d();
                    return d.f15181o;
                }
            } else if (obj == null) {
                return d.f15180n;
            } else {
                if (hVar.k(i10, l11, obj)) {
                    d();
                    return d.f15179m;
                }
            }
        }
    }

    public final int p(h hVar, int i10, k1.l lVar, long j10, Object obj, boolean z10) {
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 == null) {
                if (a(j10) && !z10) {
                    if (hVar.k(i10, null, d.d)) {
                        break;
                    }
                } else if (z10) {
                    if (hVar.k(i10, null, d.f15176j)) {
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
            } else if (l10 == d.f15172e) {
                if (hVar.k(i10, l10, d.d)) {
                    break;
                }
            } else {
                fc.a aVar = d.f15177k;
                if (l10 == aVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l10 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l10 == d.f15178l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l10 instanceof j) {
                        l10 = ((j) l10).f15189a;
                    }
                    if (m(l10, lVar)) {
                        hVar.o(i10, d.f15175i);
                        return 0;
                    }
                    if (hVar.f15188f.getAndSet((i10 * 2) + 1, aVar) != aVar) {
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
            int i10 = d.f15171c;
            int i11 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15162e;
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
        throw new UnsupportedOperationException("Method not decompiled: ld.b.toString():java.lang.String");
    }
}
