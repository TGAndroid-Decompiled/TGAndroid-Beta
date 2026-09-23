package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f7637c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f7632a;
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
                                                lVar.f7682c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f7682c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f7682c = b2.f7635b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f7682c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f7682c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f7685i.e(d);
                    lVar.f7682c = t0Var;
                    return;
                }
                lVar.f7682c = b2.f7633a0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7685i.e((char) 65533);
        lVar.f7682c = t0Var;
    }
}
