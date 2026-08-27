package mc;

public final enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        char cD = aVar.d();
        g1 g1Var = b2.f17969k0;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            lVar.f18007c = g1Var;
            return;
        }
        if (cD != '>') {
            if (cD != 65535) {
                lVar.m(this);
                lVar.f18007c = g1Var;
                return;
            }
            lVar.l(this);
        }
        lVar.m(this);
        fVar.c();
        fVar.getClass();
        lVar.j();
        lVar.f18007c = b2.f17954a;
    }
}
