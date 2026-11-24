package defpackage;
public enum csb extends qsb {
    public csb() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    lqb lqbVar = qsb.a;
                    if (d != '>') {
                        if (d != 65535) {
                            aqbVar.m(this);
                            aqbVar.c = qsb.D0;
                            return;
                        }
                        aqbVar.l(this);
                        aqbVar.j();
                        aqbVar.c = lqbVar;
                        return;
                    }
                    aqbVar.j();
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.m(this);
                aqbVar.c = qsb.B0;
                return;
            }
            aqbVar.m(this);
            aqbVar.c = qsb.A0;
            return;
        }
        aqbVar.c = qsb.x0;
    }
}
