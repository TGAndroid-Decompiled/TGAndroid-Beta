package cd;

import ld.p;
import v7.g5;
public abstract class a implements f {
    public final g f4119a;

    public a(g gVar) {
        this.f4119a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return g5.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f4119a;
    }

    @Override
    public h minusKey(g gVar) {
        return g5.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return g5.c(this, hVar);
    }
}
