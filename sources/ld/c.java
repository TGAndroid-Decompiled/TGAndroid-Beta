package ld;

import ae.b0;
import ae.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class c extends a {
    private final jd.h _context;
    private transient jd.c intercepted;

    public c(jd.c cVar, jd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public jd.h getContext() {
        jd.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final jd.c intercepted() {
        jd.c cVar;
        jd.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            jd.e eVar = (jd.e) getContext().get(jd.d.f14127a);
            if (eVar != null) {
                cVar = new fe.h((b0) eVar, this);
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
        jd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            jd.f fVar = getContext().get(jd.d.f14127a);
            kotlin.jvm.internal.i.b(fVar);
            jd.e eVar = (jd.e) fVar;
            fe.h hVar = (fe.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.f9894n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == fe.a.d);
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
        this.intercepted = b.f15533a;
    }

    public c(jd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
