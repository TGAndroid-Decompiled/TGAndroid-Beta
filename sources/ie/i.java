package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
public class i {
    public static final AtomicReferenceFieldUpdater f12070b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f12071c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f12072e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f12073f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final g f12074a;
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
            this.f12074a = new g(this, 0);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        k kVar;
        m mVar = cVar.f12062a;
        d dVar = cVar.f12063b;
        while (true) {
            int andDecrement = f12073f.getAndDecrement(this);
            if (andDecrement <= 1) {
                gd.i iVar = gd.i.f10453a;
                if (andDecrement > 0) {
                    d.f12064g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f12072e.getAndIncrement(this);
                f fVar = f.f12066a;
                long j3 = andIncrement / j.f12079f;
                while (true) {
                    a2 = ee.a.a(kVar2, j3, fVar);
                    if (!ee.a.d(a2)) {
                        t b10 = ee.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f8893c >= b10.f8893c) {
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
                AtomicReferenceArray atomicReferenceArray = kVar3.f12080e;
                int i10 = (int) (andIncrement % j.f12079f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        com.google.android.gms.internal.clearcut.e eVar = j.f12076b;
                        com.google.android.gms.internal.clearcut.e eVar2 = j.f12077c;
                        while (!atomicReferenceArray.compareAndSet(i10, eVar, eVar2)) {
                            if (atomicReferenceArray.get(i10) != eVar) {
                                break;
                            }
                        }
                        d.f12064g.set(dVar, null);
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
