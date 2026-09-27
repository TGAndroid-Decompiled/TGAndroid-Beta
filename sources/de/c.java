package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7699a;
    public final id.h f7700b;

    public c(id.h hVar, Throwable th2) {
        this.f7699a = th2;
        this.f7700b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7700b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7700b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7700b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7700b.plus(hVar);
    }
}
