package defpackage;
public enum nqb extends qsb {
    public nqb() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.m('-')) {
            aqbVar.f('-');
            aqbVar.a(qsb.N);
            return;
        }
        aqbVar.c = qsb.f;
    }
}
