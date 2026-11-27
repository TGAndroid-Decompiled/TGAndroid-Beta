package defpackage;
public enum gub extends rwb {
    public gub() {
        super("RawtextLessthanSign", 13);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.m('/')) {
            bubVar.e();
            bubVar.a(rwb.E);
            return;
        }
        bubVar.f('<');
        bubVar.c = rwb.e;
    }
}
