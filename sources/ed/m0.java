package ed;
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
                        w wVar = b2.f8833a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        lVar.k();
                                        lVar.f8886c = wVar;
                                        return;
                                    default:
                                        lVar.f8890i.j();
                                        aVar.q();
                                        lVar.f8886c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8886c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8886c = b2.f8841e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8890i.j();
                lVar.f8890i.d(d);
                lVar.f8886c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8890i.j();
        aVar.q();
        lVar.f8886c = n0Var;
    }
}
