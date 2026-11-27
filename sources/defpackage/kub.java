package defpackage;
public enum kub extends rwb {
    public kub() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.d(false);
            bubVar.c = rwb.I;
            return;
        }
        bubVar.h("</");
        bubVar.c = rwb.f;
    }
}
