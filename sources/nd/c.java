package nd;

import ce.a0;
import ce.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class c extends a {
    private final ld.h _context;
    private transient ld.c intercepted;

    public c(ld.c cVar, ld.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public ld.h getContext() {
        ld.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final ld.c intercepted() {
        ld.c cVar;
        ld.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            ld.e eVar = (ld.e) getContext().get(ld.d.f16986a);
            if (eVar != null) {
                cVar = new he.h((a0) eVar, this);
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
        ld.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            ld.f fVar = getContext().get(ld.d.f16986a);
            kotlin.jvm.internal.i.b(fVar);
            ld.e eVar = (ld.e) fVar;
            he.h hVar = (he.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.f12800n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == he.a.d);
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
        this.intercepted = b.f18774a;
    }

    public c(ld.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
