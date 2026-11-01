package ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.m;
import yd.t;
public class i {
    public static final AtomicReferenceFieldUpdater f4134b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f4135c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f4136f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final g f4137a;
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
            this.f4137a = new g(this, 0);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        k kVar;
        m mVar = cVar.f4126a;
        d dVar = cVar.f4127b;
        while (true) {
            int andDecrement = f4136f.getAndDecrement(this);
            if (andDecrement <= 1) {
                ad.j jVar = ad.j.f401a;
                if (andDecrement > 0) {
                    d.f4128g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), jVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.f4130a;
                long j10 = andIncrement / j.f4141f;
                while (true) {
                    a2 = yd.a.a(kVar2, j10, fVar);
                    if (!yd.a.d(a2)) {
                        t b10 = yd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f54440c >= b10.f54440c) {
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
                k kVar3 = (k) yd.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = kVar3.e;
                int i10 = (int) (andIncrement % j.f4141f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        ea.a aVar = j.f4139b;
                        ea.a aVar2 = j.f4140c;
                        while (!atomicReferenceArray.compareAndSet(i10, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i10) != aVar) {
                                break;
                            }
                        }
                        d.f4128g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), jVar);
                        return;
                    }
                }
                cVar.a(kVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ce.i.b():void");
    }
}
