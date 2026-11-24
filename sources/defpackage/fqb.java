package defpackage;
public enum fqb extends qsb {
    public fqb() {
        super("RawtextLessthanSign", 13);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.E);
            return;
        }
        aqbVar.f('<');
        aqbVar.c = qsb.e;
    }
}
