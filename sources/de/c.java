package de;

import rd.p;
public final class c implements id.h {
    public final Throwable f6823a;
    public final id.h f6824b;

    public c(id.h hVar, Throwable th2) {
        this.f6823a = th2;
        this.f6824b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f6824b.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f6824b.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f6824b.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f6824b.plus(hVar);
    }
}
