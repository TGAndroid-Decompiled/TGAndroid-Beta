package fd;
public enum j1 extends a2 {
    public j1() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10575m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f10520a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f10568c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10568c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f10568c = vVar;
                    return;
                }
                kVar.f10568c = a2.f10546u0;
                return;
            }
            kVar.f10568c = a2.f10545t0;
        }
    }
}
