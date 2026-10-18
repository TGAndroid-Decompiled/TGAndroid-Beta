package fd;
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            v vVar = a2.f10522a;
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f10570c = a2.C0;
                    return;
                }
                kVar.l(this);
                kVar.f10577m.getClass();
                kVar.j();
                kVar.f10570c = vVar;
                return;
            }
            kVar.j();
            kVar.f10570c = vVar;
        }
    }
}
