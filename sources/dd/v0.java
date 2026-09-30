package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f7643a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f7693c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f7693c = wVar;
            return;
        }
        lVar.f7696i.f7685j = true;
        lVar.k();
        lVar.f7693c = wVar;
    }
}
