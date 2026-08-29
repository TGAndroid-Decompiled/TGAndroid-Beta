package nc;
public enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        char d = aVar.d();
        g1 g1Var = b2.f17252k0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f17290c = g1Var;
                    return;
                }
                lVar.l(this);
            }
            lVar.m(this);
            fVar.c();
            fVar.getClass();
            lVar.j();
            lVar.f17290c = b2.f17237a;
            return;
        }
        lVar.f17290c = g1Var;
    }
}
