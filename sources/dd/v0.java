package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f8274a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8327c = b2.X;
                return;
            }
            lVar.l(this);
            lVar.f8327c = wVar;
            return;
        }
        lVar.f8331i.f8319j = true;
        lVar.k();
        lVar.f8327c = wVar;
    }
}
