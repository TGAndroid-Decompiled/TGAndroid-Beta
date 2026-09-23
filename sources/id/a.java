package id;

import rd.p;
import v7.n8;
public abstract class a implements f {
    public final g f11067a;

    public a(g gVar) {
        this.f11067a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return n8.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f11067a;
    }

    @Override
    public h minusKey(g gVar) {
        return n8.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return n8.c(this, hVar);
    }
}
