package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends i1 {
    public final m f10467e;

    public o(m mVar) {
        this.f10467e = mVar;
    }

    @Override
    public final void a(Throwable th) {
        v1 i9 = i();
        m mVar = this.f10467e;
        Throwable q10 = mVar.q(i9);
        if (mVar.x()) {
            qc.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            md.h hVar = (md.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.f17650n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                e5.c cVar2 = md.a.d;
                if (kotlin.jvm.internal.i.a(obj, cVar2)) {
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
