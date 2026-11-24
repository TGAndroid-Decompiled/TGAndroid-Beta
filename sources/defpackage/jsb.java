package defpackage;
public enum jsb extends qsb {
    public jsb() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
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
        }
    }
}
