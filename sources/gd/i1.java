package gd;
public enum i1 extends a2 {
    public i1() {
        super("AfterDoctypePublicKeyword", 54);
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
                            kVar.f12459c = a2.C0;
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
                kVar.f12459c = a2.f12437u0;
                return;
            }
            kVar.m(this);
            kVar.f12459c = a2.f12436t0;
            return;
        }
        kVar.f12459c = a2.f12435s0;
    }
}
