package defpackage;
public enum jvb extends rwb {
    public jvb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String h = ik1Var.h(rwb.I0);
        if (h.length() > 0) {
            bubVar.i.w(h);
        }
        char d = ik1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
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
                                            bubVar.k();
                                            bubVar.c = mubVar;
                                            return;
                                        default:
                                            bubVar.i.v(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c = bubVar.c('>', true);
                                wtb wtbVar = bubVar.i;
                                if (c != null) {
                                    wtbVar.x(c);
                                    return;
                                } else {
                                    wtbVar.v('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        bubVar.l(this);
                        bubVar.c = mubVar;
                        return;
                    }
                }
                bubVar.m(this);
                bubVar.i.v(d);
                return;
            }
            bubVar.c = rwb.X;
            return;
        }
        bubVar.m(this);
        bubVar.i.v((char) 65533);
    }
}
