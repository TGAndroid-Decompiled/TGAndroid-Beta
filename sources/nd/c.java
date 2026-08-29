package nd;

import bd.p;
public final class c implements sc.h {
    public final Throwable f17307a;
    public final sc.h f17308b;

    public c(Throwable th2, sc.h hVar) {
        this.f17307a = th2;
        this.f17308b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f17308b.fold(obj, pVar);
    }

    @Override
    public final sc.f get(sc.g gVar) {
        return this.f17308b.get(gVar);
    }

    @Override
    public final sc.h minusKey(sc.g gVar) {
        return this.f17308b.minusKey(gVar);
    }

    @Override
    public final sc.h plus(sc.h hVar) {
        return this.f17308b.plus(hVar);
    }
}
