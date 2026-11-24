package defpackage;
public enum ysb extends rub {
    public ysb() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        wsb wsbVar = rub.S;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != 65535) {
                        bsbVar.f(d);
                        bsbVar.c = wsbVar;
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.c = rub.a;
                    return;
                }
                bsbVar.f(d);
                bsbVar.c = rub.V;
                return;
            }
            bsbVar.f(d);
            bsbVar.c = rub.U;
            return;
        }
        bsbVar.m(this);
        bsbVar.f((char) 65533);
        bsbVar.c = wsbVar;
    }
}
