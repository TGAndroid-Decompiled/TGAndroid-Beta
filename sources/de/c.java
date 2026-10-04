package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f8324a;
    public final id.h f8325b;

    public c(id.h hVar, Throwable th2) {
        this.f8324a = th2;
        this.f8325b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8325b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f8325b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f8325b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f8325b.plus(hVar);
    }
}
