package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7712a;
    public final id.h f7713b;

    public c(id.h hVar, Throwable th2) {
        this.f7712a = th2;
        this.f7713b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7713b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7713b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7713b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7713b.plus(hVar);
    }
}
