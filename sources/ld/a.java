package ld;

import a8.yd;
import ud.p;
public abstract class a implements f {
    public final g f16983a;

    public a(g gVar) {
        this.f16983a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return yd.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f16983a;
    }

    @Override
    public h minusKey(g gVar) {
        return yd.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return yd.c(this, hVar);
    }
}
