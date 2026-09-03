package nd;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
import k7.p7;
import kf.k0;
import ld.i2;
import ld.l;
import qd.t;
public class b {
    public static final AtomicLongFieldUpdater f14898b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f14899c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f14900f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f14901g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f14902i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f14903j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f14904a;
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
        this.f14904a = i10;
        if (i10 >= 0) {
            h hVar = d.f14906a;
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
                hVar2 = d.f14906a;
                kotlin.jvm.internal.j.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f14920r;
            return;
        }
        throw new IllegalArgumentException(k0.k(i10, "Invalid channel capacity: ", ", should be >=0").toString());
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
            h hVar = d.f14906a;
            o3.c b10 = lVar.b(null, sc.i.f44318a);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f14899c.get(this) + this.f14904a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f14900f.get(this);
        if (hVar.f43071c > ((h) obj2).f43071c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f14901g.get(this);
        int i10 = (hVar2.f43071c > ((h) obj2).f43071c ? 1 : (hVar2.f43071c == ((h) obj2).f43071c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        qd.d dVar = (qd.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.d.f43049a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            o3.c cVar = qd.a.f43044b;
            obj = null;
            if (obj3 == cVar) {
                break;
            }
            qd.d dVar2 = (qd.d) obj3;
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
            int i11 = d.f14907b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f43071c * d.f14907b) + i11 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l10 = hVar5.l(i11);
                    if (l10 != null && l10 != d.e) {
                        if (l10 instanceof j) {
                            if (hVar5.k(i11, l10, d.f14914l)) {
                                obj = qd.a.e(obj, ((j) l10).f14924a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l10 instanceof i2)) {
                            break;
                        } else if (hVar5.k(i11, l10, d.f14914l)) {
                            obj = qd.a.e(obj, l10);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l10, d.f14914l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((qd.d) qd.d.f43050b.get(hVar5));
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
        i(f14898b.get(this), false);
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
            long j10 = andIncrement / d.f14907b;
            if (g() <= andIncrement) {
                if (hVar.f43071c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f43071c != j10) {
                c cVar = c.f14905a;
                while (true) {
                    a2 = qd.a.a(hVar, j10, cVar);
                    if (!qd.a.d(a2)) {
                        t b10 = qd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f43071c >= b10.f43071c) {
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
                if (qd.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) qd.a.b(a2);
                    long j11 = hVar3.f43071c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f14907b;
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
            int i10 = (int) (andIncrement % d.f14907b);
            Object l10 = hVar.l(i10);
            boolean z4 = l10 instanceof i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14899c;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l10, d.f14910g)) {
                while (true) {
                    Object l11 = hVar.l(i10);
                    if (l11 instanceof i2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l11, new j((i2) l11))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l11, d.f14910g)) {
                            if (n(l11)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f14912j);
                                hVar.i();
                            }
                        }
                    } else if (l11 != d.f14912j) {
                        if (l11 == null) {
                            if (hVar.k(i10, l11, d.e)) {
                                break loop0;
                            }
                        } else if (l11 == d.d || l11 == d.h || l11 == d.f14911i || l11 == d.f14913k || l11 == d.f14914l) {
                            break loop0;
                        } else if (l11 != d.f14909f) {
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
                hVar.o(i10, d.f14912j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f14906a;
        c cVar = c.f14905a;
        loop0: while (true) {
            a2 = qd.a.a(hVar, j10, cVar);
            if (!qd.a.d(a2)) {
                t b10 = qd.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14901g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f43071c >= b10.f43071c) {
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
        if (qd.a.d(a2)) {
            c();
            if (hVar.f43071c * d.f14907b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) qd.a.b(a2);
            long j12 = hVar3.f43071c;
            if (!j() && j10 <= d.get(this) / d.f14907b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f43071c >= j12 || !hVar3.j()) {
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
                long j13 = j12 * d.f14907b;
                do {
                    j11 = f14899c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f14899c.compareAndSet(this, j11, j13));
                if (j12 * d.f14907b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f14902i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f14898b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r15, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: nd.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r6, nd.h r8) {
        throw new UnsupportedOperationException("Method not decompiled: nd.b.k(long, nd.h):void");
    }

    public final void l(i2 i2Var, boolean z4) {
        Throwable f10;
        if (i2Var instanceof l) {
            uc.c cVar = (uc.c) i2Var;
            if (z4) {
                f10 = (Throwable) f14902i.get(this);
                if (f10 == null) {
                    f10 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f10 = f();
            }
            cVar.resumeWith(p7.a(f10));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
    }

    public final boolean m(Object obj, m mVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f14906a;
            o3.c b10 = lVar.b(null, mVar);
            if (b10 != null) {
                lVar.e(b10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f14923f;
        Object l10 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14898b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f14916n;
                }
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f14915m;
                }
            }
        } else if (l10 == d.d && hVar.k(i10, l10, d.f14911i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l11 = hVar.l(i10);
            if (l11 != null && l11 != d.e) {
                if (l11 == d.d) {
                    if (hVar.k(i10, l11, d.f14911i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    o3.c cVar = d.f14912j;
                    if (l11 == cVar) {
                        return d.f14917o;
                    }
                    if (l11 == d.h) {
                        return d.f14917o;
                    }
                    if (l11 == d.f14914l) {
                        d();
                        return d.f14917o;
                    } else if (l11 != d.f14910g && hVar.k(i10, l11, d.f14909f)) {
                        boolean z4 = l11 instanceof j;
                        if (z4) {
                            l11 = ((j) l11).f14924a;
                        }
                        if (n(l11)) {
                            hVar.o(i10, d.f14911i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, cVar);
                        hVar.i();
                        if (z4) {
                            d();
                        }
                        return d.f14917o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l11, d.h)) {
                    d();
                    return d.f14917o;
                }
            } else if (obj == null) {
                return d.f14916n;
            } else {
                if (hVar.k(i10, l11, obj)) {
                    d();
                    return d.f14915m;
                }
            }
        }
    }

    public final int p(h hVar, int i10, m mVar, long j10, Object obj, boolean z4) {
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 == null) {
                if (a(j10) && !z4) {
                    if (hVar.k(i10, null, d.d)) {
                        break;
                    }
                } else if (z4) {
                    if (hVar.k(i10, null, d.f14912j)) {
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
            } else if (l10 == d.e) {
                if (hVar.k(i10, l10, d.d)) {
                    break;
                }
            } else {
                o3.c cVar = d.f14913k;
                if (l10 == cVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l10 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l10 == d.f14914l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l10 instanceof j) {
                        l10 = ((j) l10).f14924a;
                    }
                    if (m(l10, mVar)) {
                        hVar.o(i10, d.f14911i);
                        return 0;
                    }
                    if (hVar.f14923f.getAndSet((i10 * 2) + 1, cVar) != cVar) {
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
        boolean z4;
        b bVar = this;
        if (!bVar.j()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(bVar) > j10) {
                    break;
                }
                bVar = this;
            }
            int i10 = d.f14908c;
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
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (j13 == j15 && j13 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else if (!z4) {
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
        throw new UnsupportedOperationException("Method not decompiled: nd.b.toString():java.lang.String");
    }
}
