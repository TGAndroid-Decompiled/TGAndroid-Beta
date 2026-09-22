package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7714a;
    public final id.h f7715b;

    public c(id.h hVar, Throwable th2) {
        this.f7714a = th2;
        this.f7715b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7715b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7715b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7715b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7715b.plus(hVar);
    }
}
