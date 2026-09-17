package dd;
public enum k1 extends b2 {
    public k1() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6786m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f6726a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f6778c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f6778c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f6778c = wVar;
                    return;
                }
                lVar.f6778c = b2.f6753u0;
                return;
            }
            lVar.f6778c = b2.f6752t0;
        }
    }
}
