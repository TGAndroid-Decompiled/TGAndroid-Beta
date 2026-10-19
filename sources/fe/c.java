package fe;

import td.p;
public final class c implements kd.h {
    public final Throwable f10583a;
    public final kd.h f10584b;

    public c(Throwable th2, kd.h hVar) {
        this.f10583a = th2;
        this.f10584b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f10584b.fold(obj, pVar);
    }

    @Override
    public final kd.f get(kd.g gVar) {
        return this.f10584b.get(gVar);
    }

    @Override
    public final kd.h minusKey(kd.g gVar) {
        return this.f10584b.minusKey(gVar);
    }

    @Override
    public final kd.h plus(kd.h hVar) {
        return this.f10584b.plus(hVar);
    }
}
