package defpackage;
public enum rsb extends rub {
    public rsb() {
        super("ScriptDataEscapedDashDash", 23);
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
                    if (d != '>') {
                        bsbVar.f(d);
                        bsbVar.c = psbVar;
                        return;
                    }
                    bsbVar.f(d);
                    bsbVar.c = rub.f;
                    return;
                }
                bsbVar.c = rub.O;
                return;
            }
            bsbVar.f(d);
            return;
        }
        bsbVar.m(this);
        bsbVar.f((char) 65533);
        bsbVar.c = psbVar;
    }
}
