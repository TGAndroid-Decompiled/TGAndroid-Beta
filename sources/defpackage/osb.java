package defpackage;
public enum osb extends qsb {
    public osb() {
        super("TagOpen", 7);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i != '!') {
            if (i != '/') {
                if (i != '?') {
                    if (zj1Var.o()) {
                        aqbVar.d(true);
                        aqbVar.c = qsb.r;
                        return;
                    }
                    aqbVar.m(this);
                    aqbVar.f('<');
                    aqbVar.c = qsb.a;
                    return;
                }
                aqbVar.a(qsb.g0);
                return;
            }
            aqbVar.a(qsb.n);
            return;
        }
        aqbVar.a(qsb.h0);
    }
}
