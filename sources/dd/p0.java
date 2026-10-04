package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f8259c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f8254a;
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
                                                lVar.f8307c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f8307c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f8307c = b2.f8257b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f8307c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f8307c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f8311i.e(d);
                    lVar.f8307c = t0Var;
                    return;
                }
                lVar.f8307c = b2.f8255a0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8311i.e((char) 65533);
        lVar.f8307c = t0Var;
    }
}
