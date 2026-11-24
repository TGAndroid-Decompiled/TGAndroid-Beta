package defpackage;
public enum qsb extends rub {
    public qsb() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.j()) {
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        char d = hl1Var.d();
        psb psbVar = rub.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    bsbVar.f(d);
                    bsbVar.c = psbVar;
                    return;
                }
                bsbVar.c = rub.O;
                return;
            }
            bsbVar.f(d);
            bsbVar.c = rub.N;
            return;
        }
        bsbVar.m(this);
        bsbVar.f((char) 65533);
        bsbVar.c = psbVar;
    }
}
