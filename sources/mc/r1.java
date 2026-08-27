package mc;

public final enum r1 extends b2 {
    public r1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        char cD = aVar.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            return;
        }
        if (cD == '\"') {
            lVar.f18007c = b2.f17982v0;
            return;
        }
        if (cD == '\'') {
            lVar.f18007c = b2.f17984w0;
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
