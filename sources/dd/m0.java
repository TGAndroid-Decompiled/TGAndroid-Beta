package dd;
public enum m0 extends b2 {
    public m0() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.X;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f6420a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        lVar.k();
                                        lVar.f6470c = wVar;
                                        return;
                                    default:
                                        lVar.f6473i.j();
                                        aVar.q();
                                        lVar.f6470c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f6470c = wVar;
                            return;
                        }
                    } else {
                        lVar.f6470c = b2.f6427e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f6473i.j();
                lVar.f6473i.d(d);
                lVar.f6470c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f6473i.j();
        aVar.q();
        lVar.f6470c = n0Var;
    }
}
