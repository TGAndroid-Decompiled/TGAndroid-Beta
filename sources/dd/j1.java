package dd;
public enum j1 extends b2 {
    public j1() {
        super("AfterDoctypePublicKeyword", 54);
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
                lVar.m(this);
                lVar.f7683c = b2.f7659u0;
                return;
            }
            lVar.m(this);
            lVar.f7683c = b2.f7658t0;
            return;
        }
        lVar.f7683c = b2.f7657s0;
    }
}
