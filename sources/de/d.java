package de;

import rd.p;
public final class d implements id.h {
    public final id.h f8066a;
    public final Throwable f8067b;

    public d(id.h hVar, Throwable th2) {
        this.f8066a = hVar;
        this.f8067b = th2;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8066a.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f8066a.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f8066a.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f8066a.plus(hVar);
    }
}
