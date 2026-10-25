package gd;
public enum p1 extends a2 {
    public p1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12466m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f12411a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.j();
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f12459c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f12459c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f12459c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f12459c = a2.f12445z0;
            return;
        }
        kVar.f12459c = a2.f12444y0;
    }
}
