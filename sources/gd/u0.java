package gd;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f12411a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f12459c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f12459c = vVar;
            return;
        }
        kVar.f12462i.f12453j = true;
        kVar.k();
        kVar.f12459c = vVar;
    }
}
