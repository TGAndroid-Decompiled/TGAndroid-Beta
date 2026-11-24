package defpackage;
public enum bsb extends qsb {
    public bsb() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        char d = zj1Var.d();
        if (d != 0) {
            if (d != '\'') {
                lqb lqbVar = qsb.a;
                if (d != '>') {
                    if (d != 65535) {
                        rpbVar.f.append(d);
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
            aqbVar.c = qsb.w0;
            return;
        }
        aqbVar.m(this);
        rpbVar.f.append((char) 65533);
    }
}
