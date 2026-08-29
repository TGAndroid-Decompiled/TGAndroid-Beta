package jd;

import i7.s7;
public final class h2 implements sc.f, sc.g {
    public static final h2 f11484a = new Object();

    @Override
    public final Object fold(Object obj, bd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final sc.f get(sc.g gVar) {
        return s7.a(this, gVar);
    }

    @Override
    public final sc.h minusKey(sc.g gVar) {
        return s7.b(this, gVar);
    }

    @Override
    public final sc.h plus(sc.h hVar) {
        return s7.c(this, hVar);
    }

    @Override
    public final sc.g getKey() {
        return this;
    }
}
