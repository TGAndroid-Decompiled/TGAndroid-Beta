package defpackage;
public enum zqb extends qsb {
    public zqb() {
        super("ScriptDataDoubleEscapedLessthanSign", 31);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.m('/')) {
            aqbVar.f('/');
            aqbVar.e();
            aqbVar.a(qsb.W);
            return;
        }
        aqbVar.c = qsb.S;
    }
}
