package hd;

import g7.u6;
public final class i2 implements qc.f, qc.g {
    public static final i2 f10451a = new Object();

    @Override
    public final Object fold(Object obj, zc.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final qc.f get(qc.g gVar) {
        return u6.a(this, gVar);
    }

    @Override
    public final qc.h minusKey(qc.g gVar) {
        return u6.b(this, gVar);
    }

    @Override
    public final qc.h plus(qc.h hVar) {
        return u6.c(this, hVar);
    }

    @Override
    public final qc.g getKey() {
        return this;
    }
}
