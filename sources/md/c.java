package md;

import be.a0;
import be.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class c extends a {
    private final kd.h _context;
    private transient kd.c intercepted;

    public c(kd.c cVar, kd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public kd.h getContext() {
        kd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final kd.c intercepted() {
        kd.c cVar;
        kd.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            kd.e eVar = (kd.e) getContext().get(kd.d.f15028a);
            if (eVar != null) {
                cVar = new ge.h((a0) eVar, this);
            } else {
                cVar = this;
            }
            this.intercepted = cVar;
            return cVar;
        }
        return cVar2;
    }

    @Override
    public void releaseIntercepted() {
        m mVar;
        kd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            kd.f fVar = getContext().get(kd.d.f15028a);
            kotlin.jvm.internal.i.b(fVar);
            kd.e eVar = (kd.e) fVar;
            ge.h hVar = (ge.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.h.f11022n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == ge.a.d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof m) {
                mVar = (m) obj;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.f16849a;
    }

    public c(kd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
