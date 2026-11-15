package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f7995d0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f7989a;
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
                                                lVar.f8042c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f8042c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f8042c = b2.f7994c0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f8042c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f8042c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f8046i.e(d);
                    lVar.f8042c = t0Var;
                    return;
                }
                lVar.f8042c = b2.f7992b0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8046i.e((char) 65533);
        lVar.f8042c = t0Var;
    }
}
