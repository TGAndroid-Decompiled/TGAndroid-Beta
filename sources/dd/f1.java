package dd;
public enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6786m;
        char d = aVar.d();
        g1 g1Var = b2.f6745o0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f6778c = g1Var;
                    return;
                }
                lVar.l(this);
            }
            lVar.m(this);
            fVar.f();
            fVar.getClass();
            lVar.j();
            lVar.f6778c = b2.f6726a;
            return;
        }
        lVar.f6778c = g1Var;
    }
}
