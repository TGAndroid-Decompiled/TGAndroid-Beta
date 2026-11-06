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
                        w wVar = b2.f8602a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        lVar.k();
                                        lVar.f8655c = wVar;
                                        return;
                                    default:
                                        lVar.f8659i.j();
                                        aVar.q();
                                        lVar.f8655c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8655c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8655c = b2.f8610e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8659i.j();
                lVar.f8659i.d(d);
                lVar.f8655c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8659i.j();
        aVar.q();
        lVar.f8655c = n0Var;
    }
}
