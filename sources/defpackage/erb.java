package defpackage;
public enum erb extends qsb {
    public erb() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        irb irbVar = qsb.d0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        lqb lqbVar = qsb.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                aqbVar.m(this);
                                                aqbVar.k();
                                                aqbVar.c = lqbVar;
                                                return;
                                            default:
                                                zj1Var.q();
                                                aqbVar.c = irbVar;
                                                return;
                                        }
                                    } else {
                                        aqbVar.c = qsb.c0;
                                        return;
                                    }
                                } else {
                                    zj1Var.q();
                                    aqbVar.c = irbVar;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            aqbVar.l(this);
                            aqbVar.k();
                            aqbVar.c = lqbVar;
                            return;
                        }
                    }
                    aqbVar.m(this);
                    aqbVar.i.v(d);
                    aqbVar.c = irbVar;
                    return;
                }
                aqbVar.c = qsb.b0;
                return;
            }
            return;
        }
        aqbVar.m(this);
        aqbVar.i.v((char) 65533);
        aqbVar.c = irbVar;
    }
}
