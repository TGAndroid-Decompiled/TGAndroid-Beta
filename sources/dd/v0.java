package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f7648a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f7698c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f7698c = wVar;
            return;
        }
        lVar.f7701i.f7690j = true;
        lVar.k();
        lVar.f7698c = wVar;
    }
}
