package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f7638c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f7633a;
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
                                                lVar.f7683c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f7683c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f7683c = b2.f7636b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f7683c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f7683c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f7686i.e(d);
                    lVar.f7683c = t0Var;
                    return;
                }
                lVar.f7683c = b2.f7634a0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f7686i.e((char) 65533);
        lVar.f7683c = t0Var;
    }
}
