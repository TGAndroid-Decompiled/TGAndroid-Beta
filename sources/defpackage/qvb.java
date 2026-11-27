package defpackage;
public enum qvb extends rwb {
    public qvb() {
        super("Comment", 46);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char i = ik1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != 65535) {
                    rtbVar.e.append(ik1Var.g('-', 0));
                    return;
                }
                bubVar.l(this);
                bubVar.i();
                bubVar.c = rwb.a;
                return;
            }
            bubVar.a(rwb.l0);
            return;
        }
        bubVar.m(this);
        ik1Var.a();
        rtbVar.e.append((char) 65533);
    }
}
