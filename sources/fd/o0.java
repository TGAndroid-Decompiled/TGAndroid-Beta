package fd;
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.f10524c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        v vVar = a2.f10519a;
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
                                                kVar.f10567c = vVar;
                                                return;
                                            default:
                                                aVar.q();
                                                kVar.f10567c = s0Var;
                                                return;
                                        }
                                    } else {
                                        kVar.f10567c = a2.f10522b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    kVar.f10567c = s0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.k();
                            kVar.f10567c = vVar;
                            return;
                        }
                    }
                    kVar.m(this);
                    kVar.f10570i.e(d);
                    kVar.f10567c = s0Var;
                    return;
                }
                kVar.f10567c = a2.f10520a0;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f10570i.e((char) 65533);
        kVar.f10567c = s0Var;
    }
}
