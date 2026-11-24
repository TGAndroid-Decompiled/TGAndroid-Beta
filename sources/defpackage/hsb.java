package defpackage;
public enum hsb extends qsb {
    public hsb() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        char d = zj1Var.d();
        if (d != 0) {
            if (d != '\"') {
                lqb lqbVar = qsb.a;
                if (d != '>') {
                    if (d != 65535) {
                        rpbVar.g.append(d);
                        return;
                    }
                    aqbVar.l(this);
                    aqbVar.j();
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.m(this);
                aqbVar.j();
                aqbVar.c = lqbVar;
                return;
            }
            aqbVar.c = qsb.C0;
            return;
        }
        aqbVar.m(this);
        rpbVar.g.append((char) 65533);
    }
}
