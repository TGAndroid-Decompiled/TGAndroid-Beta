package dd;
public enum k1 extends b2 {
    public k1() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8661m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f8600a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f8653c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8653c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8653c = wVar;
                    return;
                }
                lVar.f8653c = b2.f8627u0;
                return;
            }
            lVar.f8653c = b2.f8626t0;
        }
    }
}
