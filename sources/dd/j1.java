package dd;
public enum j1 extends b2 {
    public j1() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8332m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f8271a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f8324c = b2.D0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8324c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8324c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f8324c = b2.f8299v0;
                return;
            }
            lVar.m(this);
            lVar.f8324c = b2.f8298u0;
            return;
        }
        lVar.f8324c = b2.f8297t0;
    }
}
