package gd;
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            v vVar = a2.f12411a;
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f12459c = a2.C0;
                    return;
                }
                kVar.l(this);
                kVar.f12466m.getClass();
                kVar.j();
                kVar.f12459c = vVar;
                return;
            }
            kVar.j();
            kVar.f12459c = vVar;
        }
    }
}
