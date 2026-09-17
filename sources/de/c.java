package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f7715a;
    public final id.h f7716b;

    public c(id.h hVar, Throwable th2) {
        this.f7715a = th2;
        this.f7716b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f7716b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f7716b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f7716b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f7716b.plus(hVar);
    }
}
