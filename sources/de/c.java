package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f6795a;
    public final id.h f6796b;

    public c(id.h hVar, Throwable th2) {
        this.f6795a = th2;
        this.f6796b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f6796b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f6796b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f6796b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f6796b.plus(hVar);
    }
}
