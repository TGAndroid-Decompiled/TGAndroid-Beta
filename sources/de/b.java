package de;

import be.j2;
import be.l;
import ge.t;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import v7.i8;
public class b {
    public static final AtomicLongFieldUpdater f6489b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f6490c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f6491f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f6492g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f6493i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f6494j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f6495a;
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
        this.f6495a = i10;
        if (i10 >= 0) {
            h hVar = d.f6497a;
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
                hVar2 = d.f6497a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f6511r;
            return;
        }
        throw new IllegalArgumentException(i2.d.k(i10, "Invalid channel capacity: ", ", should be >=0").toString());
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
            h hVar = d.f6497a;
            a6.i d10 = lVar.d(null, id.i.f11390a);
            if (d10 != null) {
                lVar.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f6490c.get(this) + this.f6495a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f6491f.get(this);
        if (hVar.f10136c > ((h) obj2).f10136c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f6492g.get(this);
        int i10 = (hVar2.f10136c > ((h) obj2).f10136c ? 1 : (hVar2.f10136c == ((h) obj2).f10136c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        ge.d dVar = (ge.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.d.f10114a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            a6.i iVar = ge.a.f10109b;
            obj = null;
            if (obj3 == iVar) {
                break;
            }
            ge.d dVar2 = (ge.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, iVar)) {
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
            int i11 = d.f6498b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f10136c * d.f6498b) + i11 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l4 = hVar5.l(i11);
                    if (l4 != null && l4 != d.e) {
                        if (l4 instanceof j) {
                            if (hVar5.k(i11, l4, d.f6505l)) {
                                obj = ge.a.e(obj, ((j) l4).f6515a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l4 instanceof j2)) {
                            break;
                        } else if (hVar5.k(i11, l4, d.f6505l)) {
                            obj = ge.a.e(obj, l4);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l4, d.f6505l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((ge.d) ge.d.f10115b.get(hVar5));
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
        i(f6489b.get(this), false);
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
            long j10 = andIncrement / d.f6498b;
            if (g() <= andIncrement) {
                if (hVar.f10136c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f10136c != j10) {
                c cVar = c.f6496a;
                while (true) {
                    a2 = ge.a.a(hVar, j10, cVar);
                    if (!ge.a.d(a2)) {
                        t b10 = ge.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f10136c >= b10.f10136c) {
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
                if (ge.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) ge.a.b(a2);
                    long j11 = hVar3.f10136c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f6498b;
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
            int i10 = (int) (andIncrement % d.f6498b);
            Object l4 = hVar.l(i10);
            boolean z10 = l4 instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6490c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l4, d.f6501g)) {
                while (true) {
                    Object l10 = hVar.l(i10);
                    if (l10 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l10, new j((j2) l10))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l10, d.f6501g)) {
                            if (n(l10)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f6503j);
                                hVar.i();
                            }
                        }
                    } else if (l10 != d.f6503j) {
                        if (l10 == null) {
                            if (hVar.k(i10, l10, d.e)) {
                                break loop0;
                            }
                        } else if (l10 == d.d || l10 == d.h || l10 == d.f6502i || l10 == d.f6504k || l10 == d.f6505l) {
                            break loop0;
                        } else if (l10 != d.f6500f) {
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
                hVar.o(i10, d.f6503j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f6497a;
        c cVar = c.f6496a;
        loop0: while (true) {
            a2 = ge.a.a(hVar, j10, cVar);
            if (!ge.a.d(a2)) {
                t b10 = ge.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6492g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f10136c >= b10.f10136c) {
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
        if (ge.a.d(a2)) {
            c();
            if (hVar.f10136c * d.f6498b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) ge.a.b(a2);
            long j12 = hVar3.f10136c;
            if (!j() && j10 <= d.get(this) / d.f6498b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f10136c >= j12 || !hVar3.j()) {
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
                long j13 = j12 * d.f6498b;
                do {
                    j11 = f6490c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f6490c.compareAndSet(this, j11, j13));
                if (j12 * d.f6498b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f6493i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f6489b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: de.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r5, de.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: de.b.k(long, de.h):void");
    }

    public final void l(j2 j2Var, boolean z10) {
        Throwable f7;
        if (j2Var instanceof l) {
            kd.c cVar = (kd.c) j2Var;
            if (z10) {
                f7 = (Throwable) f6493i.get(this);
                if (f7 == null) {
                    f7 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f7 = f();
            }
            cVar.resumeWith(i8.a(f7));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
    }

    public final boolean m(Object obj, k kVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f6497a;
            a6.i d10 = lVar.d(null, kVar);
            if (d10 != null) {
                lVar.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f6514f;
        Object l4 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6489b;
        if (l4 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f6507n;
                }
                if (hVar.k(i10, l4, obj)) {
                    d();
                    return d.f6506m;
                }
            }
        } else if (l4 == d.d && hVar.k(i10, l4, d.f6502i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 != null && l10 != d.e) {
                if (l10 == d.d) {
                    if (hVar.k(i10, l10, d.f6502i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    a6.i iVar = d.f6503j;
                    if (l10 == iVar) {
                        return d.f6508o;
                    }
                    if (l10 == d.h) {
                        return d.f6508o;
                    }
                    if (l10 == d.f6505l) {
                        d();
                        return d.f6508o;
                    } else if (l10 != d.f6501g && hVar.k(i10, l10, d.f6500f)) {
                        boolean z10 = l10 instanceof j;
                        if (z10) {
                            l10 = ((j) l10).f6515a;
                        }
                        if (n(l10)) {
                            hVar.o(i10, d.f6502i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, iVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f6508o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l10, d.h)) {
                    d();
                    return d.f6508o;
                }
            } else if (obj == null) {
                return d.f6507n;
            } else {
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f6506m;
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
                    if (hVar.k(i10, null, d.f6503j)) {
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
                a6.i iVar = d.f6504k;
                if (l4 == iVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.f6505l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l4 instanceof j) {
                        l4 = ((j) l4).f6515a;
                    }
                    if (m(l4, kVar)) {
                        hVar.o(i10, d.f6502i);
                        return 0;
                    }
                    if (hVar.f6514f.getAndSet((i10 * 2) + 1, iVar) != iVar) {
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
            int i10 = d.f6499c;
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
        throw new UnsupportedOperationException("Method not decompiled: de.b.toString():java.lang.String");
    }
}
