package kd;

import td.p;
import w7.k;
public abstract class a implements f {
    public final g f14224a;

    public a(g gVar) {
        this.f14224a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return k.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f14224a;
    }

    @Override
    public h minusKey(g gVar) {
        return k.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return k.c(this, hVar);
    }
}
