package lc;
public enum m0 extends b2 {
    public m0() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = b2.T;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f16770a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        lVar.k();
                                        lVar.f16823c = wVar;
                                        return;
                                    default:
                                        lVar.f16827i.k();
                                        aVar.q();
                                        lVar.f16823c = n0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.f16823c = wVar;
                            return;
                        }
                    } else {
                        lVar.f16823c = b2.f16771a0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f16827i.k();
                lVar.f16827i.e(d);
                lVar.f16823c = n0Var;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f16827i.k();
        aVar.q();
        lVar.f16823c = n0Var;
    }
}
