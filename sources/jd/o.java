package jd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends h1 {
    public final m f11505e;

    public o(m mVar) {
        this.f11505e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.f11505e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            sc.c cVar = mVar.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            od.h hVar = (od.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.h.f19513n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                fc.a aVar = od.a.d;
                if (kotlin.jvm.internal.j.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q6)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        mVar.n(q6);
        if (!mVar.x()) {
            mVar.o();
        }
    }
}
