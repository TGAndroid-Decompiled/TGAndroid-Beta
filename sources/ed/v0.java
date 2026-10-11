package ed;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8832a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8885c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f8885c = wVar;
            return;
        }
        lVar.f8889i.f8877j = true;
        lVar.k();
        lVar.f8885c = wVar;
    }
}
