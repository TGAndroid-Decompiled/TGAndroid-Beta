package le;

import he.t;
import he.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
public class h {
    public static final AtomicReferenceFieldUpdater f16997b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f16998c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f16999f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final m f17000a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h(int i10) {
        if (i10 >= 0 && i10 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head$volatile = jVar;
            this.tail$volatile = jVar;
            this._availablePermits$volatile = 1 - i10;
            this.f17000a = new m(this, 1);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        ce.m mVar = cVar.f16991a;
        d dVar = cVar.f16992b;
        while (true) {
            int andDecrement = f16999f.getAndDecrement(this);
            if (andDecrement <= 1) {
                jd.i iVar = jd.i.f15580a;
                if (andDecrement > 0) {
                    d.f16993g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.f16995a;
                long j10 = andIncrement / i.f17004f;
                while (true) {
                    a2 = he.a.a(jVar2, j10, fVar);
                    if (!he.a.d(a2)) {
                        t b10 = he.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.f12818c >= b10.f12818c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        jVar2 = jVar;
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
                    jVar2 = jVar;
                }
                j jVar3 = (j) he.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i10 = (int) (andIncrement % i.f17004f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        v vVar = i.f17002b;
                        v vVar2 = i.f17003c;
                        while (!atomicReferenceArray.compareAndSet(i10, vVar, vVar2)) {
                            if (atomicReferenceArray.get(i10) != vVar) {
                                break;
                            }
                        }
                        d.f16993g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.a(jVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: le.h.b():void");
    }
}
