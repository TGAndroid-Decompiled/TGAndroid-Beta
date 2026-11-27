package defpackage;
public enum avb extends rwb {
    public avb() {
        super("ScriptDataDoubleEscapedLessthanSign", 31);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.m('/')) {
            bubVar.f('/');
            bubVar.e();
            bubVar.a(rwb.W);
            return;
        }
        bubVar.c = rwb.S;
    }
}
