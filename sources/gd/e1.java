package gd;
public enum e1 extends a2 {
    public e1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12465m;
        char d = aVar.d();
        f1 f1Var = a2.f12428o0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f12458c = f1Var;
                    return;
                }
                kVar.l(this);
            }
            kVar.m(this);
            fVar.b();
            fVar.getClass();
            kVar.j();
            kVar.f12458c = a2.f12410a;
            return;
        }
        kVar.f12458c = f1Var;
    }
}
