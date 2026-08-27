package kd;

import h3.w0;
import h7.k6;
import id.j2;
import id.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import nd.t;

public class b {

    public static final AtomicLongFieldUpdater f15156b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    public static final AtomicLongFieldUpdater f15157c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    public static final AtomicLongFieldUpdater f15158e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    public static final AtomicReferenceFieldUpdater f15159f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    public static final AtomicReferenceFieldUpdater f15160g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");

    public static final AtomicReferenceFieldUpdater f15161i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    public static final AtomicReferenceFieldUpdater f15162j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;

    public final int f15163a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public b(int i10) {
        this.f15163a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(i0.a.l(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        h hVar = d.f15165a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        h hVar2 = new h(0L, null, this, 3);
        this.sendSegment$volatile = hVar2;
        this.receiveSegment$volatile = hVar2;
        if (j()) {
            hVar2 = d.f15165a;
            kotlin.jvm.internal.j.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = hVar2;
        this._closeCause$volatile = d.f15180r;
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15158e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof l)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        l lVar = (l) obj;
        h hVar = d.f15165a;
        ec.a aVarB = lVar.b(null, pc.i.f45696a);
        if (aVarB == null) {
            return false;
        }
        lVar.e(aVarB);
        return true;
    }

    public final boolean a(long j10) {
        return j10 < d.get(this) || j10 < f15157c.get(this) + ((long) this.f15163a);
    }

    public final h b(long j10) {
        Object objE;
        Object obj = h.get(this);
        h hVar = (h) f15159f.get(this);
        if (hVar.f18506c > ((h) obj).f18506c) {
            obj = hVar;
        }
        h hVar2 = (h) f15160g.get(this);
        if (hVar2.f18506c > ((h) obj).f18506c) {
            obj = hVar2;
        }
        nd.d dVar = (nd.d) obj;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.d.f18481a;
            Object obj2 = atomicReferenceFieldUpdater.get(dVar);
            ec.a aVar = nd.a.f18475b;
            objE = null;
            if (obj2 == aVar) {
                break;
            }
            nd.d dVar2 = (nd.d) obj2;
            if (dVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        h hVar3 = (h) dVar;
        loop2: for (h hVar4 = hVar3; hVar4 != null; hVar4 = (h) ((nd.d) nd.d.f18482b.get(hVar4))) {
            for (int i10 = d.f15166b - 1; -1 < i10; i10--) {
                if ((hVar4.f18506c * ((long) d.f15166b)) + ((long) i10) < j10) {
                    break loop2;
                }
                while (true) {
                    Object objL = hVar4.l(i10);
                    if (objL != null && objL != d.f15168e) {
                        if (!(objL instanceof j)) {
                            if (!(objL instanceof j2)) {
                                break;
                            }
                            if (hVar4.k(i10, objL, d.f15174l)) {
                                objE = nd.a.e(objE, objL);
                                hVar4.m(i10, true);
                                break;
                            }
                        } else {
                            if (hVar4.k(i10, objL, d.f15174l)) {
                                objE = nd.a.e(objE, ((j) objL).f15185a);
                                hVar4.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar4.k(i10, objL, d.f15174l)) {
                            hVar4.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objE != null) {
            if (!(objE instanceof ArrayList)) {
                l((j2) objE, true);
                return hVar3;
            }
            ArrayList arrayList = (ArrayList) objE;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((j2) arrayList.get(size), true);
            }
        }
        return hVar3;
    }

    public final void c() {
        i(f15156b.get(this), false);
    }

    public final void d() {
        Object objA;
        if (j()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j10 = andIncrement / ((long) d.f15166b);
            if (g() <= andIncrement) {
                if (hVar.f18506c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f18506c != j10) {
                c cVar = c.f15164a;
                while (true) {
                    objA = nd.a.a(hVar, j10, cVar);
                    if (!nd.a.d(objA)) {
                        t tVarB = nd.a.b(objA);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f18506c >= tVarB.f18506c) {
                                break;
                            }
                            if (!tVarB.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                                    if (!tVar.f()) {
                                        break;
                                    }
                                    tVar.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == tVar);
                            if (tVarB.f()) {
                                tVarB.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                h hVar2 = null;
                if (nd.a.d(objA)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) nd.a.b(objA);
                    long j11 = hVar3.f18506c;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) d.f15166b);
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f15158e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
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
            int i10 = (int) (andIncrement % ((long) d.f15166b));
            Object objL = hVar.l(i10);
            boolean z10 = objL instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15157c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, objL, d.f15170g)) {
                while (true) {
                    Object objL2 = hVar.l(i10);
                    if (objL2 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, objL2, new j((j2) objL2))) {
                                h(this);
                                return;
                            }
                        } else if (hVar.k(i10, objL2, d.f15170g)) {
                            if (!n(objL2)) {
                                hVar.o(i10, d.f15172j);
                                hVar.i();
                                break;
                            } else {
                                hVar.o(i10, d.d);
                                h(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == d.f15172j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (hVar.k(i10, objL2, d.f15168e)) {
                                h(this);
                                return;
                            }
                        } else if (objL2 == d.d || objL2 == d.h || objL2 == d.f15171i || objL2 == d.f15173k || objL2 == d.f15174l) {
                            h(this);
                            return;
                        } else if (objL2 != d.f15169f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                h(this);
            } else if (n(objL)) {
                hVar.o(i10, d.d);
                h(this);
                return;
            } else {
                hVar.o(i10, d.f15172j);
                hVar.i();
                h(this);
            }
        }
    }

    public final h e(long j10, h hVar) {
        Object objA;
        long j11;
        h hVar2 = d.f15165a;
        c cVar = c.f15164a;
        loop0: while (true) {
            objA = nd.a.a(hVar, j10, cVar);
            if (!nd.a.d(objA)) {
                t tVarB = nd.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15160g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f18506c >= tVarB.f18506c) {
                        break loop0;
                    }
                    if (!tVarB.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                            if (!tVar.f()) {
                                break loop0;
                            }
                            tVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (tVarB.f()) {
                        tVarB.e();
                    }
                }
            } else {
                break;
            }
        }
        if (nd.a.d(objA)) {
            c();
            if (hVar.f18506c * ((long) d.f15166b) < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) nd.a.b(objA);
            long j12 = hVar3.f18506c;
            if (!j() && j10 <= d.get(this) / ((long) d.f15166b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f18506c >= j12 || !hVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, hVar3)) {
                            if (!tVar2.f()) {
                                break loop3;
                            }
                            tVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == tVar2);
                    if (hVar3.f()) {
                        hVar3.e();
                    }
                }
            }
            if (j12 <= j10) {
                return hVar3;
            }
            long j13 = j12 * ((long) d.f15166b);
            do {
                j11 = f15157c.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f15157c.compareAndSet(this, j11, j13));
            if (j12 * ((long) d.f15166b) < g()) {
                hVar3.b();
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th = (Throwable) f15161i.get(this);
        return th == null ? new w0("Channel was closed") : th;
    }

    public final long g() {
        return f15156b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15157c;
            if (i10 == 2) {
                b(1152921504606846975L & j10);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15160g;
                        h hVarE = (h) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (g() <= j11) {
                            break;
                        }
                        long j12 = d.f15166b;
                        long j13 = j11 / j12;
                        if (hVarE.f18506c != j13 && (hVarE = e(j13, hVarE)) == null) {
                            if (((h) atomicReferenceFieldUpdater.get(this)).f18506c < j13) {
                                break;
                            }
                        } else {
                            hVarE.b();
                            int i11 = (int) (j11 % j12);
                            while (true) {
                                Object objL = hVarE.l(i11);
                                if (objL != null && objL != d.f15168e) {
                                    if (objL != d.d && (objL == d.f15172j || objL == d.f15174l || objL == d.f15171i || objL == d.h || (objL != d.f15170g && (objL == d.f15169f || j11 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (hVarE.k(i11, objL, d.h)) {
                                    d();
                                    break;
                                }
                            }
                            f15157c.compareAndSet(this, j11, j11 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(i0.a.k(i10, "unexpected close status: ").toString());
                }
                h hVarB = b(1152921504606846975L & j10);
                Object objE = null;
                loop0: do {
                    for (int i12 = d.f15166b - 1; -1 < i12; i12--) {
                        long j14 = (hVarB.f18506c * ((long) d.f15166b)) + ((long) i12);
                        while (true) {
                            Object objL2 = hVarB.l(i12);
                            if (objL2 == d.f15171i) {
                                break loop0;
                            }
                            if (objL2 != d.d) {
                                if (objL2 != d.f15168e && objL2 != null) {
                                    if (!(objL2 instanceof j2) && !(objL2 instanceof j)) {
                                        ec.a aVar = d.f15170g;
                                        if (objL2 == aVar || objL2 == d.f15169f) {
                                            break loop0;
                                        }
                                        if (objL2 != aVar) {
                                            break;
                                        }
                                    } else {
                                        if (j14 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        j2 j2Var = objL2 instanceof j ? ((j) objL2).f15185a : (j2) objL2;
                                        if (hVarB.k(i12, objL2, d.f15174l)) {
                                            objE = nd.a.e(objE, j2Var);
                                            hVarB.n(i12, null);
                                            hVarB.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (hVarB.k(i12, objL2, d.f15174l)) {
                                        hVarB.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (hVarB.k(i12, objL2, d.f15174l)) {
                                    hVarB.n(i12, null);
                                    hVarB.i();
                                    break;
                                }
                            }
                        }
                    }
                    hVarB = (h) ((nd.d) nd.d.f18482b.get(hVarB));
                } while (hVarB != null);
                if (objE != null) {
                    if (objE instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objE;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            l((j2) arrayList.get(size), false);
                        }
                    } else {
                        l((j2) objE, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j() {
        long j10 = d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    public final void k(long j10, h hVar) {
        h hVar2;
        h hVar3;
        while (hVar.f18506c < j10 && (hVar3 = (h) hVar.c()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.d() || (hVar2 = (h) hVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f18506c >= hVar.f18506c) {
                        return;
                    }
                    if (!hVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, hVar)) {
                            if (tVar.f()) {
                                tVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (hVar.f()) {
                        hVar.e();
                    }
                }
            } else {
                hVar = hVar2;
            }
        }
    }

    public final void l(j2 j2Var, boolean z10) {
        Throwable thF;
        if (!(j2Var instanceof l)) {
            throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
        }
        rc.c cVar = (rc.c) j2Var;
        if (z10) {
            thF = (Throwable) f15161i.get(this);
            if (thF == null) {
                thF = new i("Channel was closed");
            }
        } else {
            thF = f();
        }
        cVar.resumeWith(k6.a(thF));
    }

    public final boolean m(Object obj, k kVar) {
        if (!(obj instanceof l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        l lVar = (l) obj;
        h hVar = d.f15165a;
        ec.a aVarB = lVar.b(null, kVar);
        if (aVarB == null) {
            return false;
        }
        lVar.e(aVarB);
        return true;
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f15184f;
        Object objL = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15156b;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f15176n;
                }
                if (hVar.k(i10, objL, obj)) {
                    d();
                    return d.f15175m;
                }
            }
        } else if (objL == d.d && hVar.k(i10, objL, d.f15171i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = hVar.l(i10);
            if (objL2 == null || objL2 == d.f15168e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hVar.k(i10, objL2, d.h)) {
                        d();
                        return d.f15177o;
                    }
                } else {
                    if (obj == null) {
                        return d.f15176n;
                    }
                    if (hVar.k(i10, objL2, obj)) {
                        d();
                        return d.f15175m;
                    }
                }
            } else if (objL2 != d.d) {
                ec.a aVar = d.f15172j;
                if (objL2 == aVar) {
                    return d.f15177o;
                }
                if (objL2 == d.h) {
                    return d.f15177o;
                }
                if (objL2 == d.f15174l) {
                    d();
                    return d.f15177o;
                }
                if (objL2 != d.f15170g && hVar.k(i10, objL2, d.f15169f)) {
                    boolean z10 = objL2 instanceof j;
                    if (z10) {
                        objL2 = ((j) objL2).f15185a;
                    }
                    if (n(objL2)) {
                        hVar.o(i10, d.f15171i);
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                    hVar.o(i10, aVar);
                    hVar.i();
                    if (z10) {
                        d();
                    }
                    return d.f15177o;
                }
            } else if (hVar.k(i10, objL2, d.f15171i)) {
                d();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                hVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int p(h hVar, int i10, k kVar, long j10, Object obj, boolean z10) {
        while (true) {
            Object objL = hVar.l(i10);
            if (objL == null) {
                if (!a(j10) || z10) {
                    if (z10) {
                        if (hVar.k(i10, null, d.f15172j)) {
                            hVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (hVar.k(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (hVar.k(i10, null, d.d)) {
                    break;
                }
            } else {
                if (objL != d.f15168e) {
                    ec.a aVar = d.f15173k;
                    if (objL == aVar) {
                        hVar.n(i10, null);
                        return 5;
                    }
                    if (objL == d.h) {
                        hVar.n(i10, null);
                        return 5;
                    }
                    if (objL == d.f15174l) {
                        hVar.n(i10, null);
                        c();
                        return 4;
                    }
                    hVar.n(i10, null);
                    if (objL instanceof j) {
                        objL = ((j) objL).f15185a;
                    }
                    if (m(objL, kVar)) {
                        hVar.o(i10, d.f15171i);
                        return 0;
                    }
                    if (hVar.f15184f.getAndSet((i10 * 2) + 1, aVar) != aVar) {
                        hVar.m(i10, true);
                    }
                    return 5;
                }
                if (hVar.k(i10, objL, d.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void q(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.j()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(bVar) > j10) {
                break;
            } else {
                bVar = this;
            }
        }
        int i10 = d.f15167c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15158e;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(bVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j11 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(bVar);
                    long j14 = atomicLongFieldUpdater2.get(bVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z10) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f15156b.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f15163a + ',');
        sb2.append("data=[");
        List listC = qc.h.c(f15160g.get(this), f15159f.get(this), h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((h) obj) != d.f15165a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((h) next).f18506c;
            do {
                Object next2 = it.next();
                long j11 = ((h) next2).f18506c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        h hVar = (h) next;
        long j12 = f15157c.get(this);
        long jG = g();
        loop2: do {
            int i11 = d.f15166b;
            for (int i12 = 0; i12 < i11; i12++) {
                long j13 = (hVar.f18506c * ((long) d.f15166b)) + ((long) i12);
                if (j13 >= jG && j13 >= j12) {
                    break loop2;
                }
                Object objL = hVar.l(i12);
                Object obj2 = hVar.f15184f.get(i12 * 2);
                if (objL instanceof l) {
                    string = (j13 >= j12 || j13 < jG) ? (j13 >= jG || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objL instanceof j) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.j.a(objL, d.f15169f) ? true : kotlin.jvm.internal.j.a(objL, d.f15170g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objL == null ? true : objL.equals(d.f15168e) ? true : kotlin.jvm.internal.j.a(objL, d.f15171i) ? true : kotlin.jvm.internal.j.a(objL, d.h) ? true : kotlin.jvm.internal.j.a(objL, d.f15173k) ? true : kotlin.jvm.internal.j.a(objL, d.f15172j) ? true : kotlin.jvm.internal.j.a(objL, d.f15174l))) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            hVar = (h) hVar.c();
        } while (hVar != null);
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(gd.j.c(sb2)) == ',') {
            kotlin.jvm.internal.j.d(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
