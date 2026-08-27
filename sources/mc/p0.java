package mc;

public final enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        t0 t0Var = b2.Y;
        if (cD == 0) {
            lVar.m(this);
            lVar.f18011i.f((char) 65533);
            lVar.f18007c = t0Var;
            return;
        }
        if (cD != ' ') {
            if (cD == '\"') {
                lVar.f18007c = b2.W;
                return;
            }
            if (cD != '`') {
                w wVar = b2.f17954a;
                if (cD == 65535) {
                    lVar.l(this);
                    lVar.k();
                    lVar.f18007c = wVar;
                    return;
                }
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                    return;
                }
                if (cD == '&') {
                    aVar.q();
                    lVar.f18007c = t0Var;
                    return;
                }
                if (cD == '\'') {
                    lVar.f18007c = b2.X;
                    return;
                }
                switch (cD) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        lVar.m(this);
                        lVar.k();
                        lVar.f18007c = wVar;
                        break;
                    default:
                        aVar.q();
                        lVar.f18007c = t0Var;
                        break;
                }
                return;
            }
            lVar.m(this);
            lVar.f18011i.f(cD);
            lVar.f18007c = t0Var;
        }
    }
}
