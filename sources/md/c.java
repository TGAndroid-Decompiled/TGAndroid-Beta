package md;

import ad.p;

public final class c implements rc.h {

    public final Throwable f18024a;

    public final rc.h f18025b;

    public c(Throwable th, rc.h hVar) {
        this.f18024a = th;
        this.f18025b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f18025b.fold(obj, pVar);
    }

    @Override
    public final rc.f get(rc.g gVar) {
        return this.f18025b.get(gVar);
    }

    @Override
    public final rc.h minusKey(rc.g gVar) {
        return this.f18025b.minusKey(gVar);
    }

    @Override
    public final rc.h plus(rc.h hVar) {
        return this.f18025b.plus(hVar);
    }
}
