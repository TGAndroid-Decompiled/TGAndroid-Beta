package defpackage;
public enum irb extends qsb {
    public irb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String h = zj1Var.h(qsb.I0);
        if (h.length() > 0) {
            aqbVar.i.w(h);
        }
        char d = zj1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
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
                                            aqbVar.k();
                                            aqbVar.c = lqbVar;
                                            return;
                                        default:
                                            aqbVar.i.v(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c = aqbVar.c('>', true);
                                vpb vpbVar = aqbVar.i;
                                if (c != null) {
                                    vpbVar.x(c);
                                    return;
                                } else {
                                    vpbVar.v('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        aqbVar.l(this);
                        aqbVar.c = lqbVar;
                        return;
                    }
                }
                aqbVar.m(this);
                aqbVar.i.v(d);
                return;
            }
            aqbVar.c = qsb.X;
            return;
        }
        aqbVar.m(this);
        aqbVar.i.v((char) 65533);
    }
}
