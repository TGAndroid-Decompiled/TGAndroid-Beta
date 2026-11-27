package defpackage;
public enum hub extends rwb {
    public hub() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.d(false);
            bubVar.c = rwb.F;
            return;
        }
        bubVar.h("</");
        bubVar.c = rwb.e;
    }
}
