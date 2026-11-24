package defpackage;
public enum zrb extends qsb {
    public zrb() {
        super("BeforeDoctypePublicIdentifier", 55);
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
                    aqbVar.m(this);
                    aqbVar.j();
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.c = qsb.v0;
                return;
            }
            aqbVar.c = qsb.u0;
        }
    }
}
