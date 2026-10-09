package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends j1 {
    public final m f479e;

    public o(m mVar) {
        this.f479e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        w1 i10 = i();
        m mVar = this.f479e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            jd.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            fe.h hVar = (fe.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.f9895n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                da.a aVar = fe.a.d;
                if (kotlin.jvm.internal.i.a(obj, aVar)) {
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
