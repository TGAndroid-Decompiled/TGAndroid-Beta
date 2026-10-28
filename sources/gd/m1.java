package gd;
public enum m1 extends a2 {
    public m1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12465m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f12410a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f12458c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f12458c = vVar;
                        return;
                    }
                    kVar.j();
                    kVar.f12458c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f12458c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f12458c = a2.f12444z0;
            return;
        }
        kVar.f12458c = a2.f12439w0;
    }
}
