package ie;

import ee.r;
import ee.t;
import gd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
public class h {
    public static final AtomicReferenceFieldUpdater f16326b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f16327c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f16328e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f16329f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final b f16330a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f16330a = new b(this, 1);
    }

    public final void a(c cVar) {
        Object b10;
        j jVar;
        m mVar = cVar.f16320a;
        d dVar = cVar.f16321b;
        while (true) {
            int andDecrement = f16329f.getAndDecrement(this);
            if (andDecrement <= 1) {
                k kVar = k.f13480a;
                if (andDecrement > 0) {
                    d.f16322g.set(dVar, null);
                    mVar.C(kVar, mVar.f61983c, new b(new c1.c(dVar, cVar), 2));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f16328e.getAndIncrement(this);
                f fVar = f.f16324a;
                long j3 = andIncrement / i.f16335f;
                while (true) {
                    b10 = ee.a.b(jVar2, j3, fVar);
                    if (!ee.a.e(b10)) {
                        r c10 = ee.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (rVar.f10938c >= c10.f10938c) {
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
                AtomicReferenceArray atomicReferenceArray = jVar3.f16336e;
                int i7 = (int) (andIncrement % i.f16335f);
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        t tVar = i.f16332b;
                        t tVar2 = i.f16333c;
                        while (!atomicReferenceArray.compareAndSet(i7, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i7) != tVar) {
                                break;
                            }
                        }
                        d.f16322g.set(dVar, null);
                        mVar.C(kVar, mVar.f61983c, new b(new c1.c(dVar, cVar), 2));
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
