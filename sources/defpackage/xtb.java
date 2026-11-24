package defpackage;
public enum xtb extends rub {
    public xtb() {
        super("DoctypeName", 52);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        if (hl1Var.o()) {
            srbVar.e.append(hl1Var.e());
            return;
        }
        char d = hl1Var.d();
        if (d != 0) {
            if (d != ' ') {
                msb msbVar = rub.a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            srbVar.e.append(d);
                            return;
                        }
                    } else {
                        bsbVar.l(this);
                        bsbVar.j();
                        bsbVar.c = msbVar;
                        return;
                    }
                } else {
                    bsbVar.j();
                    bsbVar.c = msbVar;
                    return;
                }
            }
            bsbVar.c = rub.r0;
            return;
        }
        bsbVar.m(this);
        srbVar.e.append((char) 65533);
    }
}
