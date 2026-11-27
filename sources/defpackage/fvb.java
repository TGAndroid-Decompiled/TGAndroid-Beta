package defpackage;
public enum fvb extends rwb {
    public fvb() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        jvb jvbVar = rwb.d0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        mub mubVar = rwb.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                bubVar.m(this);
                                                bubVar.k();
                                                bubVar.c = mubVar;
                                                return;
                                            default:
                                                ik1Var.q();
                                                bubVar.c = jvbVar;
                                                return;
                                        }
                                    } else {
                                        bubVar.c = rwb.c0;
                                        return;
                                    }
                                } else {
                                    ik1Var.q();
                                    bubVar.c = jvbVar;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            bubVar.l(this);
                            bubVar.k();
                            bubVar.c = mubVar;
                            return;
                        }
                    }
                    bubVar.m(this);
                    bubVar.i.v(d);
                    bubVar.c = jvbVar;
                    return;
                }
                bubVar.c = rwb.b0;
                return;
            }
            return;
        }
        bubVar.m(this);
        bubVar.i.v((char) 65533);
        bubVar.c = jvbVar;
    }
}
