package ed;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8830a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8883c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f8883c = wVar;
            return;
        }
        lVar.f8887i.f8875j = true;
        lVar.k();
        lVar.f8883c = wVar;
    }
}
