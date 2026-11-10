package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.m;
import zd.x;
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
        kotlin.jvm.internal.j.b(hVar);
        return hVar;
    }

    public final id.c intercepted() {
        id.c cVar;
        id.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            id.e eVar = (id.e) getContext().get(id.d.f15457a);
            if (eVar != null) {
                cVar = new ee.f((x) eVar, this);
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
            id.f fVar = getContext().get(id.d.f15457a);
            kotlin.jvm.internal.j.b(fVar);
            id.e eVar = (id.e) fVar;
            ee.f fVar2 = (ee.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10779n;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar2) == ee.a.f10770c);
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            if (obj instanceof m) {
                mVar = (m) obj;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.f17258a;
    }

    public c(id.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
