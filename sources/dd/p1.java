package dd;
public enum p1 extends b2 {
    public p1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7706m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f7649a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f7699c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f7699c = wVar;
                        return;
                    }
                    lVar.j();
                    lVar.f7699c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f7699c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f7699c = b2.f7683z0;
        }
    }
}
