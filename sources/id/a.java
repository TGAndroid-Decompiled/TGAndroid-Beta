package id;

import c8.q0;
import rd.p;
public abstract class a implements f {
    public final g f16313a;

    public a(g gVar) {
        this.f16313a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return q0.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f16313a;
    }

    @Override
    public h minusKey(g gVar) {
        return q0.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return q0.c(this, hVar);
    }
}
