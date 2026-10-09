package ed;
public enum n1 extends b2 {
    public n1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8894m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f8833a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f8886c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8886c = wVar;
                        return;
                    }
                    lVar.j();
                    lVar.f8886c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f8886c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f8886c = b2.f8868z0;
            return;
        }
        lVar.f8886c = b2.f8863w0;
    }
}
