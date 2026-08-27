package mc;

public final enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f18016n;
        char cD = aVar.d();
        a1 a1Var = b2.f17964f0;
        if (cD == 0) {
            lVar.m(this);
            eVar.f17991c.append((char) 65533);
            lVar.f18007c = a1Var;
            return;
        }
        if (cD == '-') {
            lVar.f18007c = b2.f17962e0;
            return;
        }
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.m(this);
            lVar.i();
            lVar.f18007c = wVar;
        } else if (cD != 65535) {
            eVar.f17991c.append(cD);
            lVar.f18007c = a1Var;
        } else {
            lVar.l(this);
            lVar.i();
            lVar.f18007c = wVar;
        }
    }
}
