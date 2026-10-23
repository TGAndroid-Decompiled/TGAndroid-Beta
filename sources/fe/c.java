package fe;

import td.p;
public final class c implements kd.h {
    public final Throwable f10600a;
    public final kd.h f10601b;

    public c(Throwable th2, kd.h hVar) {
        this.f10600a = th2;
        this.f10601b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f10601b.fold(obj, pVar);
    }

    @Override
    public final kd.f get(kd.g gVar) {
        return this.f10601b.get(gVar);
    }

    @Override
    public final kd.h minusKey(kd.g gVar) {
        return this.f10601b.minusKey(gVar);
    }

    @Override
    public final kd.h plus(kd.h hVar) {
        return this.f10601b.plus(hVar);
    }
}
