package fe;

import td.p;
public final class c implements kd.h {
    public final Throwable f9140a;
    public final kd.h f9141b;

    public c(Throwable th2, kd.h hVar) {
        this.f9140a = th2;
        this.f9141b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f9141b.fold(obj, pVar);
    }

    @Override
    public final kd.f get(kd.g gVar) {
        return this.f9141b.get(gVar);
    }

    @Override
    public final kd.h minusKey(kd.g gVar) {
        return this.f9141b.minusKey(gVar);
    }

    @Override
    public final kd.h plus(kd.h hVar) {
        return this.f9141b.plus(hVar);
    }
}
