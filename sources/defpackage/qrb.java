package defpackage;
public enum qrb extends qsb {
    public qrb() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char d = zj1Var.d();
        prb prbVar = qsb.k0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = qpbVar.e;
                    sb.append('-');
                    sb.append(d);
                    aqbVar.c = prbVar;
                    return;
                }
                aqbVar.l(this);
                aqbVar.i();
                aqbVar.c = qsb.a;
                return;
            }
            aqbVar.c = qsb.m0;
            return;
        }
        aqbVar.m(this);
        StringBuilder sb2 = qpbVar.e;
        sb2.append('-');
        sb2.append((char) 65533);
        aqbVar.c = prbVar;
    }
}
