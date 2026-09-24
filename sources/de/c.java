package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7697a;
    public final id.h f7698b;

    public c(id.h hVar, Throwable th2) {
        this.f7697a = th2;
        this.f7698b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7698b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7698b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7698b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7698b.plus(hVar);
    }
}
