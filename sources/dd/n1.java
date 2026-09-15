package dd;
public enum n1 extends b2 {
    public n1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7701m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f7644a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f7694c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f7694c = wVar;
                        return;
                    }
                    lVar.j();
                    lVar.f7694c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f7694c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f7694c = b2.f7678z0;
            return;
        }
        lVar.f7694c = b2.f7673w0;
    }
}
