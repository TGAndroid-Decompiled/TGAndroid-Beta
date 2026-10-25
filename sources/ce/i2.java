package ce;

import a8.yd;
public final class i2 implements ld.f, ld.g {
    public static final i2 f6236a = new Object();

    @Override
    public final Object fold(Object obj, ud.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final ld.f get(ld.g gVar) {
        return yd.a(this, gVar);
    }

    @Override
    public final ld.h minusKey(ld.g gVar) {
        return yd.b(this, gVar);
    }

    @Override
    public final ld.h plus(ld.h hVar) {
        return yd.c(this, hVar);
    }

    @Override
    public final ld.g getKey() {
        return this;
    }
}
