package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f7633a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f7683c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f7683c = wVar;
            return;
        }
        lVar.f7686i.f7675j = true;
        lVar.k();
        lVar.f7683c = wVar;
    }
}
