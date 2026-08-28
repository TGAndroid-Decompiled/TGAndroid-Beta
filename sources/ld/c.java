package ld;

import zc.p;
public final class c implements qc.h {
    public final Throwable f16840a;
    public final qc.h f16841b;

    public c(Throwable th, qc.h hVar) {
        this.f16840a = th;
        this.f16841b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f16841b.fold(obj, pVar);
    }

    @Override
    public final qc.f get(qc.g gVar) {
        return this.f16841b.get(gVar);
    }

    @Override
    public final qc.h minusKey(qc.g gVar) {
        return this.f16841b.minusKey(gVar);
    }

    @Override
    public final qc.h plus(qc.h hVar) {
        return this.f16841b.plus(hVar);
    }
}
