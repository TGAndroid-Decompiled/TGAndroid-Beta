package defpackage;
public enum rrb extends qsb {
    public rrb() {
        super("CommentEnd", 48);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char d = zj1Var.d();
        prb prbVar = qsb.k0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    lqb lqbVar = qsb.a;
                    if (d != '>') {
                        if (d != 65535) {
                            aqbVar.m(this);
                            StringBuilder sb = qpbVar.e;
                            sb.append("--");
                            sb.append(d);
                            aqbVar.c = prbVar;
                            return;
                        }
                        aqbVar.l(this);
                        aqbVar.i();
                        aqbVar.c = lqbVar;
                        return;
                    }
                    aqbVar.i();
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.m(this);
                qpbVar.e.append('-');
                return;
            }
            aqbVar.m(this);
            aqbVar.c = qsb.n0;
            return;
        }
        aqbVar.m(this);
        StringBuilder sb2 = qpbVar.e;
        sb2.append("--");
        sb2.append((char) 65533);
        aqbVar.c = prbVar;
    }
}
