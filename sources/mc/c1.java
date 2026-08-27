package mc;

public final enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f18016n;
        char cD = aVar.d();
        a1 a1Var = b2.f17964f0;
        if (cD == 0) {
            lVar.m(this);
            StringBuilder sb2 = eVar.f17991c;
            sb2.append("--");
            sb2.append((char) 65533);
            lVar.f18007c = a1Var;
            return;
        }
        if (cD == '!') {
            lVar.m(this);
            lVar.f18007c = b2.f17967i0;
            return;
        }
        if (cD == '-') {
            lVar.m(this);
            eVar.f17991c.append('-');
            return;
        }
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.i();
            lVar.f18007c = wVar;
        } else if (cD == 65535) {
            lVar.l(this);
            lVar.i();
            lVar.f18007c = wVar;
        } else {
            lVar.m(this);
            StringBuilder sb3 = eVar.f17991c;
            sb3.append("--");
            sb3.append(cD);
            lVar.f18007c = a1Var;
        }
    }
}
