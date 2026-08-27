package id;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class o extends i1 {

    public final m f11176e;

    public o(m mVar) {
        this.f11176e = mVar;
    }

    @Override
    public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
        v1 v1VarI = i();
        m mVar = this.f11176e;
        Throwable thQ = mVar.q(v1VarI);
        if (mVar.x()) {
            rc.c cVar = mVar.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            nd.h hVar = (nd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.h.f18486n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                ec.a aVar = nd.a.d;
                if (kotlin.jvm.internal.j.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, thQ)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        mVar.n(thQ);
        if (mVar.x()) {
            return;
        }
        mVar.o();
    }
}
