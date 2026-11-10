package de;

import rd.p;
public final class d implements id.h {
    public final id.h f8679a;
    public final Throwable f8680b;

    public d(id.h hVar, Throwable th2) {
        this.f8679a = hVar;
        this.f8680b = th2;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8679a.fold(obj, pVar);
    }

    @Override
    public final id.f get(id.g gVar) {
        return this.f8679a.get(gVar);
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return this.f8679a.minusKey(gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return this.f8679a.plus(hVar);
    }
}
