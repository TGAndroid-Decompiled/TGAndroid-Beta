package defpackage;
public enum bub extends rub {
    public bub() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        char d = hl1Var.d();
        if (d != 0) {
            if (d != '\"') {
                msb msbVar = rub.a;
                if (d != '>') {
                    if (d != 65535) {
                        srbVar.f.append(d);
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
            bsbVar.c = rub.w0;
            return;
        }
        bsbVar.m(this);
        srbVar.f.append((char) 65533);
    }
}
