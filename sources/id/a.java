package id;

import rd.p;
import v7.q8;
public abstract class a implements f {
    public final g f10561a;

    public a(g gVar) {
        this.f10561a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return q8.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f10561a;
    }

    @Override
    public h minusKey(g gVar) {
        return q8.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return q8.c(this, hVar);
    }
}
