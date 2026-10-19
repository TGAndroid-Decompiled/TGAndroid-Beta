package fd;
public enum o1 extends a2 {
    public o1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10574m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f10519a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f10567c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10567c = vVar;
                        return;
                    }
                    kVar.j();
                    kVar.f10567c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f10567c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f10567c = a2.f10553z0;
        }
    }
}
