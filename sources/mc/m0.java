package mc;

public final enum m0 extends b2 {
    public m0() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        n0 n0Var = b2.T;
        if (cD == 0) {
            lVar.m(this);
            lVar.f18011i.k();
            aVar.q();
            lVar.f18007c = n0Var;
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '\'') {
                if (cD == '/') {
                    lVar.f18007c = b2.f17955a0;
                    return;
                }
                w wVar = b2.f17954a;
                if (cD == 65535) {
                    lVar.l(this);
                    lVar.f18007c = wVar;
                    return;
                }
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                    return;
                }
                switch (cD) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        lVar.k();
                        lVar.f18007c = wVar;
                        break;
                    default:
                        lVar.f18011i.k();
                        aVar.q();
                        lVar.f18007c = n0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.f18011i.k();
            lVar.f18011i.e(cD);
            lVar.f18007c = n0Var;
        }
    }
}
