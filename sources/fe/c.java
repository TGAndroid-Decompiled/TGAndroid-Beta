package fe;

import td.p;
public final class c implements kd.h {
    public final Throwable f10586a;
    public final kd.h f10587b;

    public c(Throwable th2, kd.h hVar) {
        this.f10586a = th2;
        this.f10587b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f10587b.fold(obj, pVar);
    }

    @Override
    public final kd.f get(kd.g gVar) {
        return this.f10587b.get(gVar);
    }

    @Override
    public final kd.h minusKey(kd.g gVar) {
        return this.f10587b.minusKey(gVar);
    }

    @Override
    public final kd.h plus(kd.h hVar) {
        return this.f10587b.plus(hVar);
    }
}
