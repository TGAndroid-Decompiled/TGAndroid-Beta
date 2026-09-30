package id;

import rd.p;
import v7.o8;
public abstract class a implements f {
    public final g f11081a;

    public a(g gVar) {
        this.f11081a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return o8.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f11081a;
    }

    @Override
    public h minusKey(g gVar) {
        return o8.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return o8.c(this, hVar);
    }
}
