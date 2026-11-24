package defpackage;
public enum iqb extends qsb {
    public iqb() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d != '!') {
            if (d != '/') {
                aqbVar.h("<");
                zj1Var.q();
                aqbVar.c = qsb.f;
                return;
            }
            aqbVar.e();
            aqbVar.c = qsb.H;
            return;
        }
        aqbVar.h("<!");
        aqbVar.c = qsb.J;
    }
}
