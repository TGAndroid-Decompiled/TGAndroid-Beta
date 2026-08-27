package mc;

public final enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        boolean zO = aVar.o();
        h1 h1Var = b2.f17970l0;
        if (zO) {
            fVar.c();
            lVar.f18007c = h1Var;
            return;
        }
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            fVar.c();
            fVar.f17992c.append((char) 65533);
            lVar.f18007c = h1Var;
            return;
        }
        if (cD != ' ') {
            if (cD == 65535) {
                lVar.l(this);
                fVar.c();
                fVar.getClass();
                lVar.j();
                lVar.f18007c = b2.f17954a;
                return;
            }
            if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                return;
            }
            fVar.c();
            fVar.f17992c.append(cD);
            lVar.f18007c = h1Var;
        }
    }
}
