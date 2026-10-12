package fd;
public enum p1 extends a2 {
    public p1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f9131m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f9076a;
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
                        kVar.f9124c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f9124c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f9124c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f9124c = a2.f9110z0;
            return;
        }
        kVar.f9124c = a2.f9109y0;
    }
}
