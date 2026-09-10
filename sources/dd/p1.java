package dd;
public enum p1 extends b2 {
    public p1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6477m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f6420a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f6470c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f6470c = wVar;
                        return;
                    }
                    lVar.j();
                    lVar.f6470c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f6470c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f6470c = b2.f6454z0;
        }
    }
}
