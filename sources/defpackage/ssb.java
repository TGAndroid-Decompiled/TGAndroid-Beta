package defpackage;
public enum ssb extends rub {
    public ssb() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.e();
            bsbVar.h.append(hl1Var.i());
            bsbVar.h("<" + hl1Var.i());
            bsbVar.a(rub.R);
        } else if (hl1Var.m('/')) {
            bsbVar.e();
            bsbVar.a(rub.P);
        } else {
            bsbVar.f('<');
            bsbVar.c = rub.L;
        }
    }
}
