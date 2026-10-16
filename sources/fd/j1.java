package fd;
public enum j1 extends a2 {
    public j1() {
        super("BeforeDoctypePublicIdentifier", 55);
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
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f9127c = vVar;
                    return;
                }
                kVar.f9127c = a2.f9105u0;
                return;
            }
            kVar.f9127c = a2.f9104t0;
        }
    }
}
