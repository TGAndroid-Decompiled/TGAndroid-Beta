package mc;

public final enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        m0 m0Var = b2.S;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            lVar.f18007c = m0Var;
            return;
        }
        if (cD == '/') {
            lVar.f18007c = b2.f17955a0;
            return;
        }
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.k();
            lVar.f18007c = wVar;
        } else if (cD == 65535) {
            lVar.l(this);
            lVar.f18007c = wVar;
        } else {
            lVar.m(this);
            aVar.q();
            lVar.f18007c = m0Var;
        }
    }
}
