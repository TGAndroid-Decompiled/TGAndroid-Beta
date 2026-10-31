package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a0;
import td.m;
public abstract class c extends a {
    private final cd.h _context;
    private transient cd.c intercepted;

    public c(cd.c cVar, cd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public cd.h getContext() {
        cd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final cd.c intercepted() {
        cd.c cVar;
        cd.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            cd.e eVar = (cd.e) getContext().get(cd.d.f4122a);
            if (eVar != null) {
                cVar = new yd.h((a0) eVar, this);
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
        cd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            cd.f fVar = getContext().get(cd.d.f4122a);
            kotlin.jvm.internal.i.b(fVar);
            cd.e eVar = (cd.e) fVar;
            yd.h hVar = (yd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.f54402n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == yd.a.d);
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
        this.intercepted = b.f6482a;
    }

    public c(cd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
