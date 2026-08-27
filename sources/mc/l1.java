package mc;

public final enum l1 extends b2 {
    public l1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            fVar.d.append((char) 65533);
            return;
        }
        if (cD == '\"') {
            lVar.f18007c = b2.f17977r0;
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
            fVar.d.append(cD);
            return;
        }
        lVar.l(this);
        fVar.getClass();
        lVar.j();
        lVar.f18007c = wVar;
    }
}
