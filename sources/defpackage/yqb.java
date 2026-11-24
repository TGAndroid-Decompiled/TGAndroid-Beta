package defpackage;
public enum yqb extends qsb {
    public yqb() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        vqb vqbVar = qsb.S;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            aqbVar.f(d);
                            aqbVar.c = vqbVar;
                            return;
                        }
                        aqbVar.l(this);
                        aqbVar.c = qsb.a;
                        return;
                    }
                    aqbVar.f(d);
                    aqbVar.c = qsb.f;
                    return;
                }
                aqbVar.f(d);
                aqbVar.c = qsb.V;
                return;
            }
            aqbVar.f(d);
            return;
        }
        aqbVar.m(this);
        aqbVar.f((char) 65533);
        aqbVar.c = vqbVar;
    }
}
