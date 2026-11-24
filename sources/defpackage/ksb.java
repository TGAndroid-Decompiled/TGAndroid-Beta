package defpackage;
public enum ksb extends rub {
    public ksb() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.d(false);
            bsbVar.c = rub.I;
            return;
        }
        bsbVar.h("</");
        bsbVar.c = rub.f;
    }
}
