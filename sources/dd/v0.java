package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f6753a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f6806c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f6806c = wVar;
            return;
        }
        lVar.f6810i.f6798j = true;
        lVar.k();
        lVar.f6806c = wVar;
    }
}
