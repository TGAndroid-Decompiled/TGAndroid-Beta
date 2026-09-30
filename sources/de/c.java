package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7709a;
    public final id.h f7710b;

    public c(id.h hVar, Throwable th2) {
        this.f7709a = th2;
        this.f7710b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7710b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7710b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7710b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7710b.plus(hVar);
    }
}
