package defpackage;
public enum frb extends qsb {
    public frb() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String g = zj1Var.g(qsb.G0);
        int length = g.length();
        vpb vpbVar = aqbVar.i;
        if (length > 0) {
            vpbVar.w(g);
        } else {
            vpbVar.j = true;
        }
        char d = zj1Var.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        aqbVar.i.v(d);
                        return;
                    }
                    aqbVar.l(this);
                    aqbVar.c = qsb.a;
                    return;
                }
                int[] c = aqbVar.c('\"', true);
                vpb vpbVar2 = aqbVar.i;
                if (c != null) {
                    vpbVar2.x(c);
                    return;
                } else {
                    vpbVar2.v('&');
                    return;
                }
            }
            aqbVar.c = qsb.e0;
            return;
        }
        aqbVar.m(this);
        aqbVar.i.v((char) 65533);
    }
}
