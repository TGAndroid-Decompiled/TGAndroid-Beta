package defpackage;
public enum ftb extends rub {
    public ftb() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        jtb jtbVar = rub.d0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        msb msbVar = rub.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                bsbVar.m(this);
                                                bsbVar.k();
                                                bsbVar.c = msbVar;
                                                return;
                                            default:
                                                hl1Var.q();
                                                bsbVar.c = jtbVar;
                                                return;
                                        }
                                    } else {
                                        bsbVar.c = rub.c0;
                                        return;
                                    }
                                } else {
                                    hl1Var.q();
                                    bsbVar.c = jtbVar;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            bsbVar.l(this);
                            bsbVar.k();
                            bsbVar.c = msbVar;
                            return;
                        }
                    }
                    bsbVar.m(this);
                    bsbVar.i.v(d);
                    bsbVar.c = jtbVar;
                    return;
                }
                bsbVar.c = rub.b0;
                return;
            }
            return;
        }
        bsbVar.m(this);
        bsbVar.i.v((char) 65533);
        bsbVar.c = jtbVar;
    }
}
