package defpackage;
public enum otb extends rub {
    public otb() {
        super("CommentStart", 44);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char d = hl1Var.d();
        qtb qtbVar = rub.k0;
        if (d != 0) {
            if (d != '-') {
                msb msbVar = rub.a;
                if (d != '>') {
                    if (d != 65535) {
                        rrbVar.e.append(d);
                        bsbVar.c = qtbVar;
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.i();
                    bsbVar.c = msbVar;
                    return;
                }
                bsbVar.m(this);
                bsbVar.i();
                bsbVar.c = msbVar;
                return;
            }
            bsbVar.c = rub.j0;
            return;
        }
        bsbVar.m(this);
        rrbVar.e.append((char) 65533);
        bsbVar.c = qtbVar;
    }
}
