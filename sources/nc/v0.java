package nc;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f17237a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f17290c = b2.S;
                return;
            }
            lVar.l(this);
            lVar.f17290c = wVar;
            return;
        }
        lVar.f17294i.f17282j = true;
        lVar.k();
        lVar.f17290c = wVar;
    }
}
