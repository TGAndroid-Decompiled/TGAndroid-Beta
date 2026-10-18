package fd;
public enum m1 extends a2 {
    public m1() {
        super("AfterDoctypePublicIdentifier", 58);
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
                    kVar.j();
                    kVar.f10568c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f10568c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f10568c = a2.f10554z0;
            return;
        }
        kVar.f10568c = a2.f10549w0;
    }
}
