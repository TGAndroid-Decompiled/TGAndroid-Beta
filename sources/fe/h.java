package fe;

import be.r;
import be.t;
import dd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.m;
public class h {
    public static final AtomicReferenceFieldUpdater f11576b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f11577c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f11578e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f11579f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final b f11580a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.f11580a = new b(this, 1);
    }

    public final void a(c cVar) {
        Object b10;
        j jVar;
        m mVar = cVar.f11570a;
        d dVar = cVar.f11571b;
        while (true) {
            int andDecrement = f11579f.getAndDecrement(this);
            if (andDecrement <= 1) {
                k kVar = k.f8801a;
                if (andDecrement > 0) {
                    d.f11572g.set(dVar, null);
                    mVar.C(kVar, mVar.f57500c, new b(new c1.b(dVar, cVar), 2));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f11578e.getAndIncrement(this);
                f fVar = f.f11574a;
                long j10 = andIncrement / i.f11585f;
                while (true) {
                    b10 = be.a.b(jVar2, j10, fVar);
                    if (!be.a.e(b10)) {
                        r c2 = be.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (rVar.f3282c >= c2.f3282c) {
                                break;
                            } else if (!c2.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c2.f()) {
                                            c2.e();
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
                j jVar3 = (j) be.a.c(b10);
                AtomicReferenceArray atomicReferenceArray = jVar3.f11586e;
                int i3 = (int) (andIncrement % i.f11585f);
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        t tVar = i.f11582b;
                        t tVar2 = i.f11583c;
                        while (!atomicReferenceArray.compareAndSet(i3, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i3) != tVar) {
                                break;
                            }
                        }
                        d.f11572g.set(dVar, null);
                        mVar.C(kVar, mVar.f57500c, new b(new c1.b(dVar, cVar), 2));
                        return;
                    }
                }
                cVar.a(jVar3, i3);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: fe.h.b():void");
    }
}
