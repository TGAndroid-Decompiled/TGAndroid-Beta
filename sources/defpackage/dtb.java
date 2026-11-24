package defpackage;
public enum dtb extends rub {
    public dtb() {
        super("AttributeName", 34);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String h = hl1Var.h(rub.H0);
        wrb wrbVar = bsbVar.i;
        String str = wrbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        wrbVar.g = h;
        char d = hl1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        msb msbVar = rub.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        bsbVar.c = rub.a0;
                                        return;
                                    case '>':
                                        bsbVar.k();
                                        bsbVar.c = msbVar;
                                        return;
                                    default:
                                        bsbVar.i.u(d);
                                        return;
                                }
                            }
                        } else {
                            bsbVar.l(this);
                            bsbVar.c = msbVar;
                            return;
                        }
                    } else {
                        bsbVar.c = rub.f0;
                        return;
                    }
                }
                bsbVar.m(this);
                bsbVar.i.u(d);
                return;
            }
            bsbVar.c = rub.Z;
            return;
        }
        bsbVar.m(this);
        bsbVar.i.u((char) 65533);
    }
}
