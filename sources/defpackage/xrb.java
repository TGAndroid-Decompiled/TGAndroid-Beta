package defpackage;
public enum xrb extends qsb {
    public xrb() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        boolean j = zj1Var.j();
        lqb lqbVar = qsb.a;
        if (j) {
            aqbVar.l(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else if (zj1Var.n('\t', '\n', '\r', '\f', ' ')) {
            zj1Var.a();
        } else if (zj1Var.m('>')) {
            aqbVar.j();
            aqbVar.a(lqbVar);
        } else if (zj1Var.l("PUBLIC")) {
            aqbVar.c = qsb.s0;
        } else if (zj1Var.l("SYSTEM")) {
            aqbVar.c = qsb.y0;
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.D0);
        }
    }
}
