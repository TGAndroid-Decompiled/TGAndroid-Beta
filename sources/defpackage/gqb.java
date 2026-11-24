package defpackage;
public enum gqb extends qsb {
    public gqb() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.F;
            return;
        }
        aqbVar.h("</");
        aqbVar.c = qsb.e;
    }
}
