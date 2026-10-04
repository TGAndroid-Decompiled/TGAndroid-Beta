package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8254a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8307c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f8307c = wVar;
            return;
        }
        lVar.f8311i.f8299j = true;
        lVar.k();
        lVar.f8307c = wVar;
    }
}
