package defpackage;
public enum qqb extends qsb {
    public qqb() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.j()) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        char d = zj1Var.d();
        oqb oqbVar = qsb.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        aqbVar.f(d);
                        aqbVar.c = oqbVar;
                        return;
                    }
                    aqbVar.f(d);
                    aqbVar.c = qsb.f;
                    return;
                }
                aqbVar.c = qsb.O;
                return;
            }
            aqbVar.f(d);
            return;
        }
        aqbVar.m(this);
        aqbVar.f((char) 65533);
        aqbVar.c = oqbVar;
    }
}
