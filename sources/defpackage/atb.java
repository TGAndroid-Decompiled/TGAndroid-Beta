package defpackage;
public enum atb extends rub {
    public atb() {
        super("ScriptDataDoubleEscapedLessthanSign", 31);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.m('/')) {
            bsbVar.f('/');
            bsbVar.e();
            bsbVar.a(rub.W);
            return;
        }
        bsbVar.c = rub.S;
    }
}
