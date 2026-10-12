package fd;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f9076a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f9124c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f9124c = vVar;
            return;
        }
        kVar.f9127i.f9118j = true;
        kVar.k();
        kVar.f9124c = vVar;
    }
}
