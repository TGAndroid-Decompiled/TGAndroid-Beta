package jd;

import g7.y5;
import hd.j2;
import hd.l;
import j3.r0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import md.t;
public class b {
    public static final AtomicLongFieldUpdater f14307b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f14308c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f14309e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f14310f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f14311g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f14312i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f14313j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f14314a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public b(int i9) {
        long j10;
        this.f14314a = i9;
        if (i9 >= 0) {
            h hVar = d.f14316a;
            if (i9 != 0) {
                if (i9 != Integer.MAX_VALUE) {
                    j10 = i9;
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
                hVar2 = d.f14316a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f14331r;
            return;
        }
        throw new IllegalArgumentException(r0.m(i9, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14309e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f14316a;
            e5.c b10 = lVar.b(null, oc.i.f19197a);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f14308c.get(this) + this.f14314a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f14310f.get(this);
        if (hVar.f17670c > ((h) obj2).f17670c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f14311g.get(this);
        int i9 = (hVar2.f17670c > ((h) obj2).f17670c ? 1 : (hVar2.f17670c == ((h) obj2).f17670c ? 0 : -1));
        h hVar3 = obj2;
        if (i9 > 0) {
            hVar3 = hVar2;
        }
        md.d dVar = (md.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.d.f17645a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            e5.c cVar = md.a.f17639b;
            obj = null;
            if (obj3 == cVar) {
                break;
            }
            md.d dVar2 = (md.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, cVar)) {
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
            int i10 = d.f14317b - 1;
            obj = obj;
            while (-1 < i10) {
                if ((hVar5.f17670c * d.f14317b) + i10 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l10 = hVar5.l(i10);
                    if (l10 != null && l10 != d.f14319e) {
                        if (l10 instanceof j) {
                            if (hVar5.k(i10, l10, d.f14325l)) {
                                obj = md.a.e(obj, ((j) l10).f14336a);
                                hVar5.m(i10, true);
                                break;
                            }
                        } else if (!(l10 instanceof j2)) {
                            break;
                        } else if (hVar5.k(i10, l10, d.f14325l)) {
                            obj = md.a.e(obj, l10);
                            hVar5.m(i10, true);
                            break;
                        }
                    } else if (hVar5.k(i10, l10, d.f14325l)) {
                        hVar5.i();
                        break;
                    }
                }
                i10--;
                obj = obj;
            }
            hVar5 = (h) ((md.d) md.d.f17646b.get(hVar5));
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
        i(f14307b.get(this), false);
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
            long j10 = andIncrement / d.f14317b;
            if (g() <= andIncrement) {
                if (hVar.f17670c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f17670c != j10) {
                c cVar = c.f14315a;
                while (true) {
                    a2 = md.a.a(hVar, j10, cVar);
                    if (!md.a.d(a2)) {
                        t b10 = md.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f17670c >= b10.f17670c) {
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
                if (md.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) md.a.b(a2);
                    long j11 = hVar3.f17670c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f14317b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f14309e;
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
            int i9 = (int) (andIncrement % d.f14317b);
            Object l10 = hVar.l(i9);
            boolean z10 = l10 instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14308c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i9, l10, d.f14321g)) {
                while (true) {
                    Object l11 = hVar.l(i9);
                    if (l11 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i9, l11, new j((j2) l11))) {
                                break loop0;
                            }
                        } else if (hVar.k(i9, l11, d.f14321g)) {
                            if (n(l11)) {
                                hVar.o(i9, d.d);
                                break;
                            } else {
                                hVar.o(i9, d.f14323j);
                                hVar.i();
                            }
                        }
                    } else if (l11 != d.f14323j) {
                        if (l11 == null) {
                            if (hVar.k(i9, l11, d.f14319e)) {
                                break loop0;
                            }
                        } else if (l11 == d.d || l11 == d.h || l11 == d.f14322i || l11 == d.f14324k || l11 == d.f14325l) {
                            break loop0;
                        } else if (l11 != d.f14320f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (n(l10)) {
                hVar.o(i9, d.d);
                break;
            } else {
                hVar.o(i9, d.f14323j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f14316a;
        c cVar = c.f14315a;
        loop0: while (true) {
            a2 = md.a.a(hVar, j10, cVar);
            if (!md.a.d(a2)) {
                t b10 = md.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14311g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f17670c >= b10.f17670c) {
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
        if (md.a.d(a2)) {
            c();
            if (hVar.f17670c * d.f14317b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) md.a.b(a2);
            long j12 = hVar3.f17670c;
            if (!j() && j10 <= d.get(this) / d.f14317b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f17670c >= j12 || !hVar3.j()) {
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
                long j13 = j12 * d.f14317b;
                do {
                    j11 = f14308c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f14308c.compareAndSet(this, j11, j13));
                if (j12 * d.f14317b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th = (Throwable) f14312i.get(this);
        if (th == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th;
    }

    public final long g() {
        return f14307b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r15, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: jd.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r6, jd.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: jd.b.k(long, jd.h):void");
    }

    public final void l(j2 j2Var, boolean z10) {
        Throwable f10;
        if (j2Var instanceof l) {
            qc.c cVar = (qc.c) j2Var;
            if (z10) {
                f10 = (Throwable) f14312i.get(this);
                if (f10 == null) {
                    f10 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f10 = f();
            }
            cVar.resumeWith(y5.a(f10));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
    }

    public final boolean m(Object obj, k kVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f14316a;
            e5.c b10 = lVar.b(null, kVar);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i9, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f14335f;
        Object l10 = hVar.l(i9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14307b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f14327n;
                }
                if (hVar.k(i9, l10, obj)) {
                    d();
                    return d.f14326m;
                }
            }
        } else if (l10 == d.d && hVar.k(i9, l10, d.f14322i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i9 * 2);
            hVar.n(i9, null);
            return obj2;
        }
        while (true) {
            Object l11 = hVar.l(i9);
            if (l11 != null && l11 != d.f14319e) {
                if (l11 == d.d) {
                    if (hVar.k(i9, l11, d.f14322i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i9 * 2);
                        hVar.n(i9, null);
                        return obj3;
                    }
                } else {
                    e5.c cVar = d.f14323j;
                    if (l11 == cVar) {
                        return d.f14328o;
                    }
                    if (l11 == d.h) {
                        return d.f14328o;
                    }
                    if (l11 == d.f14325l) {
                        d();
                        return d.f14328o;
                    } else if (l11 != d.f14321g && hVar.k(i9, l11, d.f14320f)) {
                        boolean z10 = l11 instanceof j;
                        if (z10) {
                            l11 = ((j) l11).f14336a;
                        }
                        if (n(l11)) {
                            hVar.o(i9, d.f14322i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i9 * 2);
                            hVar.n(i9, null);
                            return obj4;
                        }
                        hVar.o(i9, cVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f14328o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i9, l11, d.h)) {
                    d();
                    return d.f14328o;
                }
            } else if (obj == null) {
                return d.f14327n;
            } else {
                if (hVar.k(i9, l11, obj)) {
                    d();
                    return d.f14326m;
                }
            }
        }
    }

    public final int p(h hVar, int i9, k kVar, long j10, Object obj, boolean z10) {
        while (true) {
            Object l10 = hVar.l(i9);
            if (l10 == null) {
                if (a(j10) && !z10) {
                    if (hVar.k(i9, null, d.d)) {
                        break;
                    }
                } else if (z10) {
                    if (hVar.k(i9, null, d.f14323j)) {
                        hVar.i();
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (hVar.k(i9, null, obj)) {
                        return 2;
                    }
                }
            } else if (l10 == d.f14319e) {
                if (hVar.k(i9, l10, d.d)) {
                    break;
                }
            } else {
                e5.c cVar = d.f14324k;
                if (l10 == cVar) {
                    hVar.n(i9, null);
                    return 5;
                } else if (l10 == d.h) {
                    hVar.n(i9, null);
                    return 5;
                } else if (l10 == d.f14325l) {
                    hVar.n(i9, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i9, null);
                    if (l10 instanceof j) {
                        l10 = ((j) l10).f14336a;
                    }
                    if (m(l10, kVar)) {
                        hVar.o(i9, d.f14322i);
                        return 0;
                    }
                    if (hVar.f14335f.getAndSet((i9 * 2) + 1, cVar) != cVar) {
                        hVar.m(i9, true);
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
            int i9 = d.f14318c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14309e;
                if (i10 < i9) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    if (j11 != (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) || j11 != atomicLongFieldUpdater.get(bVar)) {
                        i10++;
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
        throw new UnsupportedOperationException("Method not decompiled: jd.b.toString():java.lang.String");
    }
}
