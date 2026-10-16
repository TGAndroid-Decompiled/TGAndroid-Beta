package fe;

import td.p;
public final class c implements kd.h {
    public final Throwable f9143a;
    public final kd.h f9144b;

    public c(Throwable th2, kd.h hVar) {
        this.f9143a = th2;
        this.f9144b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f9144b.fold(obj, pVar);
    }

    @Override
    public final kd.f get(kd.g gVar) {
        return this.f9144b.get(gVar);
    }

    @Override
    public final kd.h minusKey(kd.g gVar) {
        return this.f9144b.minusKey(gVar);
    }

    @Override
    public final kd.h plus(kd.h hVar) {
        return this.f9144b.plus(hVar);
    }
}
