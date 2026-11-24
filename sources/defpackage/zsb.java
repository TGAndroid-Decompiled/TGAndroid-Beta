package defpackage;
public enum zsb extends rub {
    public zsb() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        wsb wsbVar = rub.S;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
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
                    bsbVar.c = rub.f;
                    return;
                }
                bsbVar.f(d);
                bsbVar.c = rub.V;
                return;
            }
            bsbVar.f(d);
            return;
        }
        bsbVar.m(this);
        bsbVar.f((char) 65533);
        bsbVar.c = wsbVar;
    }
}
