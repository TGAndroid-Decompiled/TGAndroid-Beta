package defpackage;
public enum tsb extends rub {
    public tsb() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.d(false);
            wrb wrbVar = bsbVar.i;
            char i = hl1Var.i();
            wrbVar.getClass();
            wrbVar.y(String.valueOf(i));
            bsbVar.h.append(hl1Var.i());
            bsbVar.a(rub.Q);
            return;
        }
        bsbVar.h("</");
        bsbVar.c = rub.L;
    }
}
