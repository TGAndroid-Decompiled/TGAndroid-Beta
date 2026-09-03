package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends h1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.e;
        Throwable q10 = mVar.q(i10);
        if (mVar.x()) {
            uc.c cVar = mVar.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            qd.h hVar = (qd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.f43054n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                o3.c cVar2 = qd.a.d;
                if (kotlin.jvm.internal.j.a(obj, cVar2)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar2, q10)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != cVar2) {
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
        mVar.n(q10);
        if (!mVar.x()) {
            mVar.o();
        }
    }
}
