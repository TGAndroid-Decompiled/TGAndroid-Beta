package gd;
public enum q1 extends a2 {
    public q1() {
        super("BeforeDoctypeSystemIdentifier", 61);
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
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f12458c = vVar;
                    return;
                }
                kVar.f12458c = a2.A0;
                return;
            }
            kVar.f12458c = a2.f12444z0;
        }
    }
}
