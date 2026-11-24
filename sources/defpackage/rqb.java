package defpackage;
public enum rqb extends qsb {
    public rqb() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.e();
            aqbVar.h.append(zj1Var.i());
            aqbVar.h("<" + zj1Var.i());
            aqbVar.a(qsb.R);
        } else if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.P);
        } else {
            aqbVar.f('<');
            aqbVar.c = qsb.L;
        }
    }
}
