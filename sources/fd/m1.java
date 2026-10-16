package fd;
public enum m1 extends a2 {
    public m1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f9134m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f9079a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f9127c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f9127c = vVar;
                        return;
                    }
                    kVar.j();
                    kVar.f9127c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f9127c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f9127c = a2.f9113z0;
            return;
        }
        kVar.f9127c = a2.f9108w0;
    }
}
