package defpackage;
public enum nsb extends rub {
    public nsb() {
        super("ScriptDataEscapeStart", 19);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.m('-')) {
            bsbVar.f('-');
            bsbVar.a(rub.K);
            return;
        }
        bsbVar.c = rub.f;
    }
}
