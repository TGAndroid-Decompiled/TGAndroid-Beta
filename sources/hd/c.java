package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.m;
import wd.x;
public abstract class c extends a {
    private final fd.h _context;
    private transient fd.c intercepted;

    public c(fd.c cVar, fd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public fd.h getContext() {
        fd.h hVar = this._context;
        kotlin.jvm.internal.j.b(hVar);
        return hVar;
    }

    public final fd.c intercepted() {
        fd.c cVar;
        fd.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            fd.e eVar = (fd.e) getContext().get(fd.d.f11566a);
            if (eVar != null) {
                cVar = new be.f((x) eVar, this);
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
        fd.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            fd.f fVar = getContext().get(fd.d.f11566a);
            kotlin.jvm.internal.j.b(fVar);
            fd.e eVar = (fd.e) fVar;
            be.f fVar2 = (be.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.f3262n;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar2) == be.a.f3253c);
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
        this.intercepted = b.f14391a;
    }

    public c(fd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
