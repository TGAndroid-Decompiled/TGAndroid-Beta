package defpackage;
public enum orb extends qsb {
    public orb() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char d = zj1Var.d();
        prb prbVar = qsb.k0;
        if (d != 0) {
            if (d != '-') {
                lqb lqbVar = qsb.a;
                if (d != '>') {
                    if (d != 65535) {
                        qpbVar.e.append(d);
                        aqbVar.c = prbVar;
                        return;
                    }
                    aqbVar.l(this);
                    aqbVar.i();
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.m(this);
                aqbVar.i();
                aqbVar.c = lqbVar;
                return;
            }
            aqbVar.c = qsb.j0;
            return;
        }
        aqbVar.m(this);
        qpbVar.e.append((char) 65533);
        aqbVar.c = prbVar;
    }
}
