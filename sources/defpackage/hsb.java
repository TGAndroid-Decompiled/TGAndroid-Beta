package defpackage;
public enum hsb extends rub {
    public hsb() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.d(false);
            bsbVar.c = rub.F;
            return;
        }
        bsbVar.h("</");
        bsbVar.c = rub.e;
    }
}
