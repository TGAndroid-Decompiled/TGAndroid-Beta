package jd;

import sd.p;
import v7.v8;
public abstract class a implements f {
    public final g f14124a;

    public a(g gVar) {
        this.f14124a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return v8.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f14124a;
    }

    @Override
    public h minusKey(g gVar) {
        return v8.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return v8.c(this, hVar);
    }
}
