package defpackage;
public enum sqb extends qsb {
    public sqb() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.d(false);
            vpb vpbVar = aqbVar.i;
            char i = zj1Var.i();
            vpbVar.getClass();
            vpbVar.y(String.valueOf(i));
            aqbVar.h.append(zj1Var.i());
            aqbVar.a(qsb.Q);
            return;
        }
        aqbVar.h("</");
        aqbVar.c = qsb.L;
    }
}
