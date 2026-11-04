package fd;

import b8.cc;
import od.p;
public abstract class a implements f {
    public final g f11563a;

    public a(g gVar) {
        this.f11563a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return cc.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f11563a;
    }

    @Override
    public h minusKey(g gVar) {
        return cc.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return cc.c(this, hVar);
    }
}
