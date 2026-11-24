package defpackage;
public enum gtb extends rub {
    public gtb() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String g = hl1Var.g(rub.G0);
        int length = g.length();
        wrb wrbVar = bsbVar.i;
        if (length > 0) {
            wrbVar.w(g);
        } else {
            wrbVar.j = true;
        }
        char d = hl1Var.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        bsbVar.i.v(d);
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.c = rub.a;
                    return;
                }
                int[] c = bsbVar.c('\"', true);
                wrb wrbVar2 = bsbVar.i;
                if (c != null) {
                    wrbVar2.x(c);
                    return;
                } else {
                    wrbVar2.v('&');
                    return;
                }
            }
            bsbVar.c = rub.e0;
            return;
        }
        bsbVar.m(this);
        bsbVar.i.v((char) 65533);
    }
}
