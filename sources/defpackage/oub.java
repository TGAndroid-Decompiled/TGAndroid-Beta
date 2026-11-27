package defpackage;
public enum oub extends rwb {
    public oub() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.m('-')) {
            bubVar.f('-');
            bubVar.a(rwb.N);
            return;
        }
        bubVar.c = rwb.f;
    }
}
