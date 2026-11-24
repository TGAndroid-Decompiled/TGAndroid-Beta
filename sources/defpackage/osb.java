package defpackage;
public enum osb extends rub {
    public osb() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.m('-')) {
            bsbVar.f('-');
            bsbVar.a(rub.N);
            return;
        }
        bsbVar.c = rub.f;
    }
}
