package defpackage;
public enum mqb extends qsb {
    public mqb() {
        super("ScriptDataEscapeStart", 19);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.m('-')) {
            aqbVar.f('-');
            aqbVar.a(qsb.K);
            return;
        }
        aqbVar.c = qsb.f;
    }
}
