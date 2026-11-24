package defpackage;
public enum jub extends rub {
    public jub() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        char d = hl1Var.d();
        if (d != 0) {
            if (d != '\'') {
                msb msbVar = rub.a;
                if (d != '>') {
                    if (d != 65535) {
                        srbVar.g.append(d);
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.j();
                    bsbVar.c = msbVar;
                    return;
                }
                bsbVar.m(this);
                bsbVar.j();
                bsbVar.c = msbVar;
                return;
            }
            bsbVar.c = rub.C0;
            return;
        }
        bsbVar.m(this);
        srbVar.g.append((char) 65533);
    }
}
