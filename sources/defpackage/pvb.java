package defpackage;
public enum pvb extends rwb {
    public pvb() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char d = ik1Var.d();
        qvb qvbVar = rwb.k0;
        if (d != 0) {
            if (d != '-') {
                mub mubVar = rwb.a;
                if (d != '>') {
                    if (d != 65535) {
                        rtbVar.e.append(d);
                        bubVar.c = qvbVar;
                        return;
                    }
                    bubVar.l(this);
                    bubVar.i();
                    bubVar.c = mubVar;
                    return;
                }
                bubVar.m(this);
                bubVar.i();
                bubVar.c = mubVar;
                return;
            }
            bubVar.c = rwb.j0;
            return;
        }
        bubVar.m(this);
        rtbVar.e.append((char) 65533);
        bubVar.c = qvbVar;
    }
}
