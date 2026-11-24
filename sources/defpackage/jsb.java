package defpackage;
public enum jsb extends rub {
    public jsb() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        if (d != '!') {
            if (d != '/') {
                bsbVar.h("<");
                hl1Var.q();
                bsbVar.c = rub.f;
                return;
            }
            bsbVar.e();
            bsbVar.c = rub.H;
            return;
        }
        bsbVar.h("<!");
        bsbVar.c = rub.J;
    }
}
