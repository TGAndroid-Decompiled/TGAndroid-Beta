package id;

import c8.m0;
import rd.p;
public abstract class a implements f {
    public final g f15449a;

    public a(g gVar) {
        this.f15449a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return m0.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f15449a;
    }

    @Override
    public h minusKey(g gVar) {
        return m0.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return m0.c(this, hVar);
    }
}
