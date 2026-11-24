package defpackage;
public enum prb extends qsb {
    public prb() {
        super("Comment", 46);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char i = zj1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != 65535) {
                    qpbVar.e.append(zj1Var.g('-', 0));
                    return;
                }
                aqbVar.l(this);
                aqbVar.i();
                aqbVar.c = qsb.a;
                return;
            }
            aqbVar.a(qsb.l0);
            return;
        }
        aqbVar.m(this);
        zj1Var.a();
        qpbVar.e.append((char) 65533);
    }
}
