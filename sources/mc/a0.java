package mc;

public final enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f18007c = b2.f17954a;
            return;
        }
        char cD = aVar.d();
        z zVar = b2.G;
        if (cD == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.f18007c = zVar;
        } else if (cD == '-') {
            lVar.f(cD);
            lVar.f18007c = b2.I;
        } else if (cD == '<') {
            lVar.f18007c = b2.J;
        } else {
            lVar.f(cD);
            lVar.f18007c = zVar;
        }
    }
}
