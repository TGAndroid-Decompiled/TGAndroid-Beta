package kd;

import td.p;
public abstract class a implements f {
    public final g f15024a;

    public a(g gVar) {
        this.f15024a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return w7.h.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f15024a;
    }

    @Override
    public h minusKey(g gVar) {
        return w7.h.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return w7.h.c(this, hVar);
    }
}
