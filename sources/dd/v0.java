package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8271a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8324c = b2.X;
                return;
            }
            lVar.l(this);
            lVar.f8324c = wVar;
            return;
        }
        lVar.f8328i.f8316j = true;
        lVar.k();
        lVar.f8324c = wVar;
    }
}
