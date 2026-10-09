package ce;

import ae.k2;
import ae.l;
import fe.t;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import v7.a8;
public class b {
    public static final AtomicLongFieldUpdater f4607b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f4608c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f4609e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f4610f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f4611g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f4612i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f4613j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f4614a;
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
        this.f4614a = i10;
        if (i10 >= 0) {
            h hVar = d.f4616a;
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
                hVar2 = d.f4616a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f4631r;
            return;
        }
        throw new IllegalArgumentException(hg.c.i(i10, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4609e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f4616a;
            da.a a2 = lVar.a(null, hd.i.f11092a);
            if (a2 != null) {
                lVar.e(a2);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j3) {
        if (j3 >= d.get(this) && j3 >= f4608c.get(this) + this.f4614a) {
            return false;
        }
        return true;
    }

    public final h b(long j3) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f4610f.get(this);
        if (hVar.f9915c > ((h) obj2).f9915c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f4611g.get(this);
        int i10 = (hVar2.f9915c > ((h) obj2).f9915c ? 1 : (hVar2.f9915c == ((h) obj2).f9915c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        fe.d dVar = (fe.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.d.f9890a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            da.a aVar = fe.a.f9884b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            fe.d dVar2 = (fe.d) obj3;
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
            int i11 = d.f4617b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f9915c * d.f4617b) + i11 < j3) {
                    break loop2;
                }
                while (true) {
                    Object l4 = hVar5.l(i11);
                    if (l4 != null && l4 != d.f4619e) {
                        if (l4 instanceof j) {
                            if (hVar5.k(i11, l4, d.f4625l)) {
                                obj = fe.a.e(obj, ((j) l4).f4636a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l4 instanceof k2)) {
                            break;
                        } else if (hVar5.k(i11, l4, d.f4625l)) {
                            obj = fe.a.e(obj, l4);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l4, d.f4625l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((fe.d) fe.d.f9891b.get(hVar5));
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l((k2) obj, true);
                return hVar4;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((k2) arrayList.get(size), true);
            }
        }
        return hVar4;
    }

    public final void c() {
        i(f4607b.get(this), false);
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
            long j3 = andIncrement / d.f4617b;
            if (g() <= andIncrement) {
                if (hVar.f9915c < j3 && hVar.c() != null) {
                    k(j3, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f9915c != j3) {
                c cVar = c.f4615a;
                while (true) {
                    a2 = fe.a.a(hVar, j3, cVar);
                    if (!fe.a.d(a2)) {
                        t b10 = fe.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f9915c >= b10.f9915c) {
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
                if (fe.a.d(a2)) {
                    c();
                    k(j3, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) fe.a.b(a2);
                    long j10 = hVar3.f9915c;
                    if (j10 > j3) {
                        long j11 = j10 * d.f4617b;
                        if (d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4609e;
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
            int i10 = (int) (andIncrement % d.f4617b);
            Object l4 = hVar.l(i10);
            boolean z10 = l4 instanceof k2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4608c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l4, d.f4621g)) {
                while (true) {
                    Object l10 = hVar.l(i10);
                    if (l10 instanceof k2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l10, new j((k2) l10))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l10, d.f4621g)) {
                            if (n(l10)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f4623j);
                                hVar.i();
                            }
                        }
                    } else if (l10 != d.f4623j) {
                        if (l10 == null) {
                            if (hVar.k(i10, l10, d.f4619e)) {
                                break loop0;
                            }
                        } else if (l10 == d.d || l10 == d.h || l10 == d.f4622i || l10 == d.f4624k || l10 == d.f4625l) {
                            break loop0;
                        } else if (l10 != d.f4620f) {
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
                hVar.o(i10, d.f4623j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j3, h hVar) {
        Object a2;
        long j10;
        h hVar2 = d.f4616a;
        c cVar = c.f4615a;
        loop0: while (true) {
            a2 = fe.a.a(hVar, j3, cVar);
            if (!fe.a.d(a2)) {
                t b10 = fe.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4611g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f9915c >= b10.f9915c) {
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
        if (fe.a.d(a2)) {
            c();
            if (hVar.f9915c * d.f4617b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) fe.a.b(a2);
            long j11 = hVar3.f9915c;
            if (!j() && j3 <= d.get(this) / d.f4617b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f9915c >= j11 || !hVar3.j()) {
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
                long j12 = j11 * d.f4617b;
                do {
                    j10 = f4608c.get(this);
                    if (j10 >= j12) {
                        break;
                    }
                } while (!f4608c.compareAndSet(this, j10, j12));
                if (j11 * d.f4617b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f4612i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f4607b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ce.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j3 = d.get(this);
        if (j3 != 0 && j3 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r5, ce.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: ce.b.k(long, ce.h):void");
    }

    public final void l(k2 k2Var, boolean z10) {
        Throwable f7;
        if (k2Var instanceof l) {
            jd.c cVar = (jd.c) k2Var;
            if (z10) {
                f7 = (Throwable) f4612i.get(this);
                if (f7 == null) {
                    f7 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f7 = f();
            }
            cVar.resumeWith(a8.a(f7));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + k2Var).toString());
    }

    public final boolean m(Object obj, k kVar) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f4616a;
            da.a a2 = lVar.a(null, kVar);
            if (a2 != null) {
                lVar.e(a2);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f4635f;
        Object l4 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4607b;
        if (l4 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f4627n;
                }
                if (hVar.k(i10, l4, obj)) {
                    d();
                    return d.f4626m;
                }
            }
        } else if (l4 == d.d && hVar.k(i10, l4, d.f4622i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 != null && l10 != d.f4619e) {
                if (l10 == d.d) {
                    if (hVar.k(i10, l10, d.f4622i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    da.a aVar = d.f4623j;
                    if (l10 == aVar) {
                        return d.f4628o;
                    }
                    if (l10 == d.h) {
                        return d.f4628o;
                    }
                    if (l10 == d.f4625l) {
                        d();
                        return d.f4628o;
                    } else if (l10 != d.f4621g && hVar.k(i10, l10, d.f4620f)) {
                        boolean z10 = l10 instanceof j;
                        if (z10) {
                            l10 = ((j) l10).f4636a;
                        }
                        if (n(l10)) {
                            hVar.o(i10, d.f4622i);
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
                        return d.f4628o;
                    }
                }
            } else if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l10, d.h)) {
                    d();
                    return d.f4628o;
                }
            } else if (obj == null) {
                return d.f4627n;
            } else {
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f4626m;
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
                    if (hVar.k(i10, null, d.f4623j)) {
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
            } else if (l4 == d.f4619e) {
                if (hVar.k(i10, l4, d.d)) {
                    break;
                }
            } else {
                da.a aVar = d.f4624k;
                if (l4 == aVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.f4625l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l4 instanceof j) {
                        l4 = ((j) l4).f4636a;
                    }
                    if (m(l4, kVar)) {
                        hVar.o(i10, d.f4622i);
                        return 0;
                    }
                    if (hVar.f4635f.getAndSet((i10 * 2) + 1, aVar) != aVar) {
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
            int i10 = d.f4618c;
            int i11 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4609e;
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
        throw new UnsupportedOperationException("Method not decompiled: ce.b.toString():java.lang.String");
    }
}
