package defpackage;
public enum krb extends qsb {
    public krb() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        lqb lqbVar = qsb.a;
        if (d != '>') {
            if (d != 65535) {
                aqbVar.m(this);
                zj1Var.q();
                aqbVar.c = qsb.X;
                return;
            }
            aqbVar.l(this);
            aqbVar.c = lqbVar;
            return;
        }
        aqbVar.i.l = true;
        aqbVar.k();
        aqbVar.c = lqbVar;
    }
}
