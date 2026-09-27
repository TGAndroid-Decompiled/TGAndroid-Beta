package dd;
public enum r1 extends b2 {
    public r1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7690m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f7633a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f7683c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f7683c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f7683c = wVar;
                    return;
                }
                lVar.f7683c = b2.A0;
                return;
            }
            lVar.f7683c = b2.f7667z0;
        }
    }
}
