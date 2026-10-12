package ee;

import sd.p;
public final class c implements jd.h {
    public final Throwable f8900a;
    public final jd.h f8901b;

    public c(Throwable th2, jd.h hVar) {
        this.f8900a = th2;
        this.f8901b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f8901b.fold(obj, pVar);
    }

    @Override
    public final jd.f get(jd.g gVar) {
        return this.f8901b.get(gVar);
    }

    @Override
    public final jd.h minusKey(jd.g gVar) {
        return this.f8901b.minusKey(gVar);
    }

    @Override
    public final jd.h plus(jd.h hVar) {
        return this.f8901b.plus(hVar);
    }
}
