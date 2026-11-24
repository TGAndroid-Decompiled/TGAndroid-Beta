package defpackage;
public enum qtb extends rub {
    public qtb() {
        super("Comment", 46);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char i = hl1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != 65535) {
                    rrbVar.e.append(hl1Var.g('-', 0));
                    return;
                }
                bsbVar.l(this);
                bsbVar.i();
                bsbVar.c = rub.a;
                return;
            }
            bsbVar.a(rub.l0);
            return;
        }
        bsbVar.m(this);
        hl1Var.a();
        rrbVar.e.append((char) 65533);
    }
}
