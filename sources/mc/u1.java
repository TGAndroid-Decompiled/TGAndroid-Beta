package mc;

public final enum u1 extends b2 {
    public u1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            return;
        }
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.j();
            lVar.f18007c = wVar;
        } else if (cD != 65535) {
            lVar.m(this);
            lVar.f18007c = b2.f17988y0;
        } else {
            lVar.l(this);
            lVar.f18015m.getClass();
            lVar.j();
            lVar.f18007c = wVar;
        }
    }
}
