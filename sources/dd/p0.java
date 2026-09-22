package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f7651c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f7646a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                lVar.m(this);
                                                lVar.k();
                                                lVar.f7696c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f7696c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f7696c = b2.f7649b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f7696c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f7696c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f7699i.e(d);
                    lVar.f7696c = t0Var;
                    return;
                }
                lVar.f7696c = b2.f7647a0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7699i.e((char) 65533);
        lVar.f7696c = t0Var;
    }
}
