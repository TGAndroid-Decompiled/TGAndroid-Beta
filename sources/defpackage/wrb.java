package defpackage;
public enum wrb extends qsb {
    public wrb() {
        super("DoctypeName", 52);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        if (zj1Var.o()) {
            rpbVar.e.append(zj1Var.e());
            return;
        }
        char d = zj1Var.d();
        if (d != 0) {
            if (d != ' ') {
                lqb lqbVar = qsb.a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            rpbVar.e.append(d);
                            return;
                        }
                    } else {
                        aqbVar.l(this);
                        aqbVar.j();
                        aqbVar.c = lqbVar;
                        return;
                    }
                } else {
                    aqbVar.j();
                    aqbVar.c = lqbVar;
                    return;
                }
            }
            aqbVar.c = qsb.r0;
            return;
        }
        aqbVar.m(this);
        rpbVar.e.append((char) 65533);
    }
}
