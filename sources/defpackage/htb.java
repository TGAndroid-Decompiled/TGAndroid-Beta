package defpackage;
public enum htb extends rub {
    public htb() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String g = hl1Var.g(rub.F0);
        int length = g.length();
        wrb wrbVar = bsbVar.i;
        if (length > 0) {
            wrbVar.w(g);
        } else {
            wrbVar.j = true;
        }
        char d = hl1Var.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        bsbVar.i.v(d);
                        return;
                    } else {
                        bsbVar.c = rub.e0;
                        return;
                    }
                }
                int[] c = bsbVar.c('\'', true);
                wrb wrbVar2 = bsbVar.i;
                if (c != null) {
                    wrbVar2.x(c);
                    return;
                } else {
                    wrbVar2.v('&');
                    return;
                }
            }
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        bsbVar.m(this);
        bsbVar.i.v((char) 65533);
    }
}
