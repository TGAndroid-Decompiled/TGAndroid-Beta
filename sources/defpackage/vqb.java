package defpackage;
public enum vqb extends qsb {
    public vqb() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    if (i != 65535) {
                        aqbVar.h(zj1Var.g('-', '<', 0));
                        return;
                    }
                    aqbVar.l(this);
                    aqbVar.c = qsb.a;
                    return;
                }
                aqbVar.f(i);
                aqbVar.a(qsb.V);
                return;
            }
            aqbVar.f(i);
            aqbVar.a(qsb.T);
            return;
        }
        aqbVar.m(this);
        zj1Var.a();
        aqbVar.f((char) 65533);
    }
}
