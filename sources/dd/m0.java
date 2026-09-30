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
                        w wVar = b2.f7643a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        lVar.k();
                                        lVar.f7693c = wVar;
                                        return;
                                    default:
                                        lVar.f7696i.j();
                                        aVar.q();
                                        lVar.f7693c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f7693c = wVar;
                            return;
                        }
                    } else {
                        lVar.f7693c = b2.f7650e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7696i.j();
                lVar.f7696i.d(d);
                lVar.f7693c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7696i.j();
        aVar.q();
        lVar.f7693c = n0Var;
    }
}
