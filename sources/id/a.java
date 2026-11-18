package id;

import c8.p0;
import rd.p;
public abstract class a implements f {
    public final g f16225a;

    public a(g gVar) {
        this.f16225a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return p0.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f16225a;
    }

    @Override
    public h minusKey(g gVar) {
        return p0.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return p0.c(this, hVar);
    }
}
