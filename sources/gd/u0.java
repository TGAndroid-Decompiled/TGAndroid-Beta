package gd;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f12410a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f12458c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f12458c = vVar;
            return;
        }
        kVar.f12461i.f12452j = true;
        kVar.k();
        kVar.f12458c = vVar;
    }
}
