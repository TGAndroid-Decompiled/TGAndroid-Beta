package nc;
public enum u1 extends b2 {
    public u1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            w wVar = b2.f17237a;
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f17290c = b2.f17271y0;
                    return;
                }
                lVar.l(this);
                lVar.f17298m.getClass();
                lVar.j();
                lVar.f17290c = wVar;
                return;
            }
            lVar.j();
            lVar.f17290c = wVar;
        }
    }
}
