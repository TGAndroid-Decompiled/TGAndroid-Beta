package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7698a;
    public final id.h f7699b;

    public c(id.h hVar, Throwable th2) {
        this.f7698a = th2;
        this.f7699b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7699b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7699b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7699b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7699b.plus(hVar);
    }
}
