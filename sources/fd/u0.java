package fd;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f10522a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f10570c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f10570c = vVar;
            return;
        }
        kVar.f10573i.f10564j = true;
        kVar.k();
        kVar.f10570c = vVar;
    }
}
