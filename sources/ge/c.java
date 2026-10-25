package ge;

import ud.p;
public final class c implements ld.h {
    public final Throwable f12475a;
    public final ld.h f12476b;

    public c(Throwable th2, ld.h hVar) {
        this.f12475a = th2;
        this.f12476b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f12476b.fold(obj, pVar);
    }

    @Override
    public final ld.f get(ld.g gVar) {
        return this.f12476b.get(gVar);
    }

    @Override
    public final ld.h minusKey(ld.g gVar) {
        return this.f12476b.minusKey(gVar);
    }

    @Override
    public final ld.h plus(ld.h hVar) {
        return this.f12476b.plus(hVar);
    }
}
