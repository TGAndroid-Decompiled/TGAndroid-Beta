package dd;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f7992a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f8045c = b2.X;
                return;
            }
            lVar.l(this);
            lVar.f8045c = wVar;
            return;
        }
        lVar.f8049i.f8037j = true;
        lVar.k();
        lVar.f8045c = wVar;
    }
}
