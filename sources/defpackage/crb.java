package defpackage;
public enum crb extends qsb {
    public crb() {
        super("AttributeName", 34);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String h = zj1Var.h(qsb.H0);
        vpb vpbVar = aqbVar.i;
        String str = vpbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        vpbVar.g = h;
        char d = zj1Var.d();
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
                                        aqbVar.i.u(d);
                                        return;
                                }
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
                aqbVar.i.u(d);
                return;
            }
            aqbVar.c = qsb.Z;
            return;
        }
        aqbVar.m(this);
        aqbVar.i.u((char) 65533);
    }
}
