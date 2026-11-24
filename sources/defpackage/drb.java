package defpackage;
public enum drb extends qsb {
    public drb() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        crb crbVar = qsb.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        lqb lqbVar = qsb.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        aqbVar.c = qsb.a0;
                                        return;
                                    case '>':
                                        aqbVar.k();
                                        aqbVar.c = lqbVar;
                                        return;
                                    default:
                                        aqbVar.i.A();
                                        zj1Var.q();
                                        aqbVar.c = crbVar;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            aqbVar.l(this);
                            aqbVar.c = lqbVar;
                            return;
                        }
                    } else {
                        aqbVar.c = qsb.f0;
                        return;
                    }
                }
                aqbVar.m(this);
                aqbVar.i.A();
                aqbVar.i.u(d);
                aqbVar.c = crbVar;
                return;
            }
            return;
        }
        aqbVar.m(this);
        aqbVar.i.u((char) 65533);
        aqbVar.c = crbVar;
    }
}
