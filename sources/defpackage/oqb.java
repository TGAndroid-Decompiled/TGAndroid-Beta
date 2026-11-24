package defpackage;
public enum oqb extends qsb {
    public oqb() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.j()) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        char i = zj1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    aqbVar.h(zj1Var.g('-', '<', 0));
                    return;
                } else {
                    aqbVar.a(qsb.O);
                    return;
                }
            }
            aqbVar.f('-');
            aqbVar.a(qsb.M);
            return;
        }
        aqbVar.m(this);
        zj1Var.a();
        aqbVar.f((char) 65533);
    }
}
