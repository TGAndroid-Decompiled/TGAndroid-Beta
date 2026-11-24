package defpackage;
public enum jtb extends rub {
    public jtb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String h = hl1Var.h(rub.I0);
        if (h.length() > 0) {
            bsbVar.i.w(h);
        }
        char d = hl1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
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
                                            bsbVar.k();
                                            bsbVar.c = msbVar;
                                            return;
                                        default:
                                            bsbVar.i.v(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c = bsbVar.c('>', true);
                                wrb wrbVar = bsbVar.i;
                                if (c != null) {
                                    wrbVar.x(c);
                                    return;
                                } else {
                                    wrbVar.v('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        bsbVar.l(this);
                        bsbVar.c = msbVar;
                        return;
                    }
                }
                bsbVar.m(this);
                bsbVar.i.v(d);
                return;
            }
            bsbVar.c = rub.X;
            return;
        }
        bsbVar.m(this);
        bsbVar.i.v((char) 65533);
    }
}
