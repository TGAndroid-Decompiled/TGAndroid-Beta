package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends i1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        v1 i10 = i();
        m mVar = this.e;
        Throwable q5 = mVar.q(i10);
        if (mVar.x()) {
            ld.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            he.h hVar = (he.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.f12801n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                he.v vVar = he.a.d;
                if (kotlin.jvm.internal.i.a(obj, vVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, q5)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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
        mVar.n(q5);
        if (!mVar.x()) {
            mVar.o();
        }
    }
}
