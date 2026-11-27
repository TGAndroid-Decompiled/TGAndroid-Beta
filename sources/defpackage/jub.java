package defpackage;
public enum jub extends rwb {
    public jub() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d != '!') {
            if (d != '/') {
                bubVar.h("<");
                ik1Var.q();
                bubVar.c = rwb.f;
                return;
            }
            bubVar.e();
            bubVar.c = rwb.H;
            return;
        }
        bubVar.h("<!");
        bubVar.c = rwb.J;
    }
}
