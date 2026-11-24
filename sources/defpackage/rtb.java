package defpackage;
public enum rtb extends rub {
    public rtb() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char d = hl1Var.d();
        qtb qtbVar = rub.k0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = rrbVar.e;
                    sb.append('-');
                    sb.append(d);
                    bsbVar.c = qtbVar;
                    return;
                }
                bsbVar.l(this);
                bsbVar.i();
                bsbVar.c = rub.a;
                return;
            }
            bsbVar.c = rub.m0;
            return;
        }
        bsbVar.m(this);
        StringBuilder sb2 = rrbVar.e;
        sb2.append('-');
        sb2.append((char) 65533);
        bsbVar.c = qtbVar;
    }
}
