package fd;
public enum e1 extends a2 {
    public e1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10591m;
        char d = aVar.d();
        f1 f1Var = a2.f10554o0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f10584c = f1Var;
                    return;
                }
                kVar.l(this);
            }
            kVar.m(this);
            fVar.b();
            fVar.getClass();
            kVar.j();
            kVar.f10584c = a2.f10536a;
            return;
        }
        kVar.f10584c = f1Var;
    }
}
