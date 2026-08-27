package mc;

public final enum j0 extends b2 {
    public j0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        g0 g0Var = b2.N;
        if (cD == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.f18007c = g0Var;
            return;
        }
        if (cD == '-') {
            lVar.f(cD);
            return;
        }
        if (cD == '<') {
            lVar.f(cD);
            lVar.f18007c = b2.Q;
        } else if (cD == '>') {
            lVar.f(cD);
            lVar.f18007c = b2.f17963f;
        } else if (cD != 65535) {
            lVar.f(cD);
            lVar.f18007c = g0Var;
        } else {
            lVar.l(this);
            lVar.f18007c = b2.f17954a;
        }
    }
}
