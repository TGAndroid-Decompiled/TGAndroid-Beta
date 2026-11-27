package defpackage;
public enum rvb extends rwb {
    public rvb() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char d = ik1Var.d();
        qvb qvbVar = rwb.k0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = rtbVar.e;
                    sb.append('-');
                    sb.append(d);
                    bubVar.c = qvbVar;
                    return;
                }
                bubVar.l(this);
                bubVar.i();
                bubVar.c = rwb.a;
                return;
            }
            bubVar.c = rwb.m0;
            return;
        }
        bubVar.m(this);
        StringBuilder sb2 = rtbVar.e;
        sb2.append('-');
        sb2.append((char) 65533);
        bubVar.c = qvbVar;
    }
}
