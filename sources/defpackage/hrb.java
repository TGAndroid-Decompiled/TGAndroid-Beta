package defpackage;
public enum hrb extends qsb {
    public hrb() {
        super("Rcdata", 2);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i != 0) {
            if (i != '&') {
                if (i != '<') {
                    if (i != 65535) {
                        aqbVar.h(zj1Var.g('&', '<', 0));
                        return;
                    } else {
                        aqbVar.g(new spb());
                        return;
                    }
                }
                aqbVar.a(qsb.s);
                return;
            }
            aqbVar.a(qsb.d);
            return;
        }
        aqbVar.m(this);
        zj1Var.a();
        aqbVar.f((char) 65533);
    }
}
