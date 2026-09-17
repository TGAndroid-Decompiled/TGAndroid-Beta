package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.a0;
import zd.m;
public abstract class c extends a {
    private final id.h _context;
    private transient id.c intercepted;

    public c(id.c cVar, id.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public id.h getContext() {
        id.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final id.c intercepted() {
        id.c cVar;
        id.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            id.e eVar = (id.e) getContext().get(id.d.f11953a);
            if (eVar != null) {
                cVar = new ee.h((a0) eVar, this);
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
        id.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            id.f fVar = getContext().get(id.d.f11953a);
            kotlin.jvm.internal.i.b(fVar);
            id.e eVar = (id.e) fVar;
            ee.h hVar = (ee.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.f9072n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == ee.a.d);
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
        this.intercepted = b.f14893a;
    }

    public c(id.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
