package ed;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8833a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8886c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f8886c = wVar;
            return;
        }
        lVar.f8890i.f8878j = true;
        lVar.k();
        lVar.f8886c = wVar;
    }
}
