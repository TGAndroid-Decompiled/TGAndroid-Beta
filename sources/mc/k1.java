package mc;

public final enum k1 extends b2 {
    public k1() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        char cD = aVar.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            return;
        }
        if (cD == '\"') {
            lVar.f18007c = b2.f17974p0;
            return;
        }
        if (cD == '\'') {
            lVar.f18007c = b2.f17975q0;
            return;
        }
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.m(this);
            fVar.getClass();
            lVar.j();
            lVar.f18007c = wVar;
            return;
        }
        if (cD != 65535) {
            lVar.m(this);
            fVar.getClass();
            lVar.f18007c = b2.f17988y0;
        } else {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.f18007c = wVar;
        }
    }
}
