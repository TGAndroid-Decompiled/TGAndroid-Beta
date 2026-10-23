package fd;
public enum i1 extends a2 {
    public i1() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10591m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f10536a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f10584c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10584c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f10584c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f10584c = a2.f10562u0;
                return;
            }
            kVar.m(this);
            kVar.f10584c = a2.f10561t0;
            return;
        }
        kVar.f10584c = a2.f10560s0;
    }
}
