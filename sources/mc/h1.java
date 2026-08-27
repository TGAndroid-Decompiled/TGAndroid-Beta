package mc;

public final enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        if (aVar.o()) {
            fVar.f17992c.append(aVar.e());
            return;
        }
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            fVar.f17992c.append((char) 65533);
            return;
        }
        if (cD != ' ') {
            w wVar = b2.f17954a;
            if (cD == '>') {
                lVar.j();
                lVar.f18007c = wVar;
                return;
            }
            if (cD == 65535) {
                lVar.l(this);
                fVar.getClass();
                lVar.j();
                lVar.f18007c = wVar;
                return;
            }
            if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                fVar.f17992c.append(cD);
                return;
            }
        }
        lVar.f18007c = b2.m0;
    }
}
