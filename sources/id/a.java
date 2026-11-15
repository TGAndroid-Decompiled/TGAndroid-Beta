package id;

import c8.n0;
import rd.p;
public abstract class a implements f {
    public final g f15909a;

    public a(g gVar) {
        this.f15909a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return n0.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f15909a;
    }

    @Override
    public h minusKey(g gVar) {
        return n0.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return n0.c(this, hVar);
    }
}
