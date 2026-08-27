package mc;

public final enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.f18011i.f17999j = true;
            lVar.k();
            lVar.f18007c = wVar;
        } else if (cD == 65535) {
            lVar.l(this);
            lVar.f18007c = wVar;
        } else {
            lVar.m(this);
            aVar.q();
            lVar.f18007c = b2.S;
        }
    }
}
