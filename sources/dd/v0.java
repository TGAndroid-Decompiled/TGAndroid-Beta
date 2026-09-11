package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f6726a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f6778c = b2.W;
                return;
            }
            lVar.l(this);
            lVar.f6778c = wVar;
            return;
        }
        lVar.f6782i.f6771s = true;
        lVar.k();
        lVar.f6778c = wVar;
    }
}
