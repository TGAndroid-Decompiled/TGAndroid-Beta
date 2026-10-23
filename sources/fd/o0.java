package fd;
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.f10541c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        v vVar = a2.f10536a;
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
                                                kVar.f10584c = vVar;
                                                return;
                                            default:
                                                aVar.q();
                                                kVar.f10584c = s0Var;
                                                return;
                                        }
                                    } else {
                                        kVar.f10584c = a2.f10539b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    kVar.f10584c = s0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.k();
                            kVar.f10584c = vVar;
                            return;
                        }
                    }
                    kVar.m(this);
                    kVar.f10587i.e(d);
                    kVar.f10584c = s0Var;
                    return;
                }
                kVar.f10584c = a2.f10537a0;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f10587i.e((char) 65533);
        kVar.f10584c = s0Var;
    }
}
