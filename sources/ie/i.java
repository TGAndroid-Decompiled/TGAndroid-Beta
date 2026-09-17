package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
public class i {
    public static final AtomicReferenceFieldUpdater f11991b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f11992c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f11993e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f11994f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final g f11995a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public i(int i10) {
        if (i10 >= 0 && i10 <= 1) {
            k kVar = new k(0L, null, 2);
            this.head$volatile = kVar;
            this.tail$volatile = kVar;
            this._availablePermits$volatile = 1 - i10;
            this.f11995a = new g(this, 0);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        k kVar;
        m mVar = cVar.f11983a;
        d dVar = cVar.f11984b;
        while (true) {
            int andDecrement = f11994f.getAndDecrement(this);
            if (andDecrement <= 1) {
                gd.i iVar = gd.i.f10616a;
                if (andDecrement > 0) {
                    d.f11985g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f11993e.getAndIncrement(this);
                f fVar = f.f11987a;
                long j3 = andIncrement / j.f12000f;
                while (true) {
                    a2 = ee.a.a(kVar2, j3, fVar);
                    if (!ee.a.d(a2)) {
                        t b10 = ee.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
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
                                        kVar2 = kVar;
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
                    kVar2 = kVar;
                }
                k kVar3 = (k) ee.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = kVar3.f12001e;
                int i10 = (int) (andIncrement % j.f12000f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        d9.f fVar2 = j.f11997b;
                        d9.f fVar3 = j.f11998c;
                        while (!atomicReferenceArray.compareAndSet(i10, fVar2, fVar3)) {
                            if (atomicReferenceArray.get(i10) != fVar2) {
                                break;
                            }
                        }
                        d.f11985g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.a(kVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ie.i.b():void");
    }
}
