package de;

import rd.p;
public final class d implements id.h {
    public final id.h f8674a;
    public final Throwable f8675b;

    public d(id.h hVar, Throwable th2) {
        this.f8674a = hVar;
        this.f8675b = th2;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8674a.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f8674a.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f8674a.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f8674a.plus(hVar);
    }
}
