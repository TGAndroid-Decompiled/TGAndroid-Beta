package gd;
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.f12416c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        v vVar = a2.f12411a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                kVar.m(this);
                                                kVar.k();
                                                kVar.f12459c = vVar;
                                                return;
                                            default:
                                                aVar.q();
                                                kVar.f12459c = s0Var;
                                                return;
                                        }
                                    } else {
                                        kVar.f12459c = a2.f12414b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    kVar.f12459c = s0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.k();
                            kVar.f12459c = vVar;
                            return;
                        }
                    }
                    kVar.m(this);
                    kVar.f12462i.e(d);
                    kVar.f12459c = s0Var;
                    return;
                }
                kVar.f12459c = a2.f12412a0;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f12462i.e((char) 65533);
        kVar.f12459c = s0Var;
    }
}
