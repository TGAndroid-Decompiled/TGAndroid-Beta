package lc;
public enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f16831m;
        char d = aVar.d();
        g1 g1Var = b2.f16785k0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f16823c = g1Var;
                    return;
                }
                lVar.l(this);
            }
            lVar.m(this);
            fVar.c();
            fVar.getClass();
            lVar.j();
            lVar.f16823c = b2.f16770a;
            return;
        }
        lVar.f16823c = g1Var;
    }
}
