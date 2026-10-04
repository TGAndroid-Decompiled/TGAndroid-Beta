package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f8325a;
    public final id.h f8326b;

    public c(id.h hVar, Throwable th2) {
        this.f8325a = th2;
        this.f8326b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8326b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f8326b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f8326b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f8326b.plus(hVar);
    }
}
