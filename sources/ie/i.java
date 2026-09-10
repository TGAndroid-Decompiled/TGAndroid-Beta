package ie;

import ee.t;
import ee.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
public class i {
    public static final AtomicReferenceFieldUpdater f10576b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f10577c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f10578f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final g f10579a;
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
            this.f10579a = new g(this, 0);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        k kVar;
        m mVar = cVar.f10568a;
        d dVar = cVar.f10569b;
        while (true) {
            int andDecrement = f10578f.getAndDecrement(this);
            if (andDecrement <= 1) {
                gd.i iVar = gd.i.f8748a;
                if (andDecrement > 0) {
                    d.f10570g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.f10572a;
                long j3 = andIncrement / j.f10583f;
                while (true) {
                    a2 = ee.a.a(kVar2, j3, fVar);
                    if (!ee.a.d(a2)) {
                        t b10 = ee.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f7499c >= b10.f7499c) {
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
                AtomicReferenceArray atomicReferenceArray = kVar3.e;
                int i10 = (int) (andIncrement % j.f10583f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        v vVar = j.f10581b;
                        v vVar2 = j.f10582c;
                        while (!atomicReferenceArray.compareAndSet(i10, vVar, vVar2)) {
                            if (atomicReferenceArray.get(i10) != vVar) {
                                break;
                            }
                        }
                        d.f10570g.set(dVar, null);
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
