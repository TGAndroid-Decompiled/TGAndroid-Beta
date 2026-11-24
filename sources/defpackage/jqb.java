package defpackage;
public enum jqb extends qsb {
    public jqb() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.I;
            return;
        }
        aqbVar.h("</");
        aqbVar.c = qsb.f;
    }
}
