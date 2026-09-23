package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f7632a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f7682c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f7682c = wVar;
            return;
        }
        lVar.f7685i.f7674j = true;
        lVar.k();
        lVar.f7682c = wVar;
    }
}
