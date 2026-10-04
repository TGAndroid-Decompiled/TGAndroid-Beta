package dd;
public enum p0 extends b2 {
    public p0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        t0 t0Var = b2.f8260c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        w wVar = b2.f8255a;
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
                                                lVar.f8308c = wVar;
                                                return;
                                            default:
                                                aVar.q();
                                                lVar.f8308c = t0Var;
                                                return;
                                        }
                                    } else {
                                        lVar.f8308c = b2.f8258b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    lVar.f8308c = t0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            lVar.l(this);
                            lVar.k();
                            lVar.f8308c = wVar;
                            return;
                        }
                    }
                    lVar.m(this);
                    lVar.f8312i.e(d);
                    lVar.f8308c = t0Var;
                    return;
                }
                lVar.f8308c = b2.f8256a0;
                return;
            }
            return;
        }
        lVar.m(this);
        lVar.f8312i.e((char) 65533);
        lVar.f8308c = t0Var;
    }
}
