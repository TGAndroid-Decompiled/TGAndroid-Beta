package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8265a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8318c = b2.X;
                return;
            }
            lVar.l(this);
            lVar.f8318c = wVar;
            return;
        }
        lVar.f8322i.f8310j = true;
        lVar.k();
        lVar.f8318c = wVar;
    }
}
