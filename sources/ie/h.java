package ie;

import ee.r;
import gd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
public class h {
    public static final AtomicReferenceFieldUpdater f15467b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f15468c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f15469e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f15470f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final b f15471a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f15471a = new b(this, 1);
    }

    public final void a(c cVar) {
        Object b10;
        j jVar;
        m mVar = cVar.f15461a;
        d dVar = cVar.f15462b;
        while (true) {
            int andDecrement = f15470f.getAndDecrement(this);
            if (andDecrement <= 1) {
                k kVar = k.f13831a;
                if (andDecrement > 0) {
                    d.f15463g.set(dVar, null);
                    mVar.C(kVar, mVar.f60088c, new b(new c1.b(dVar, cVar), 2));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f15469e.getAndIncrement(this);
                f fVar = f.f15465a;
                long j3 = andIncrement / i.f15476f;
                while (true) {
                    b10 = ee.a.b(jVar2, j3, fVar);
                    if (!ee.a.e(b10)) {
                        r c10 = ee.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (rVar.f10799c >= c10.f10799c) {
                                break;
                            } else if (!c10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c10.f()) {
                                            c10.e();
                                        }
                                        jVar2 = jVar;
                                    }
                                }
                                if (rVar.f()) {
                                    rVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) ee.a.c(b10);
                AtomicReferenceArray atomicReferenceArray = jVar3.f15477e;
                int i7 = (int) (andIncrement % i.f15476f);
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        com.google.android.gms.internal.clearcut.e eVar = i.f15473b;
                        com.google.android.gms.internal.clearcut.e eVar2 = i.f15474c;
                        while (!atomicReferenceArray.compareAndSet(i7, eVar, eVar2)) {
                            if (atomicReferenceArray.get(i7) != eVar) {
                                break;
                            }
                        }
                        d.f15463g.set(dVar, null);
                        mVar.C(kVar, mVar.f60088c, new b(new c1.b(dVar, cVar), 2));
                        return;
                    }
                }
                cVar.a(jVar3, i7);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ie.h.b():void");
    }
}
