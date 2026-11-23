package dd;
public enum o0 extends b2 {
    public o0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8303a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8356c = b2.f8304a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8356c = wVar;
                                        return;
                                    default:
                                        lVar.f8360i.j();
                                        aVar.q();
                                        lVar.f8356c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8356c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8356c = b2.f8313f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8360i.j();
                lVar.f8360i.d(d);
                lVar.f8356c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8360i.d((char) 65533);
        lVar.f8356c = n0Var;
    }
}
