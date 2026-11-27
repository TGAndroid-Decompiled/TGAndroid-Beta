package defpackage;
public enum gvb extends rwb {
    public gvb() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String g = ik1Var.g(rwb.G0);
        int length = g.length();
        wtb wtbVar = bubVar.i;
        if (length > 0) {
            wtbVar.w(g);
        } else {
            wtbVar.j = true;
        }
        char d = ik1Var.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        bubVar.i.v(d);
                        return;
                    }
                    bubVar.l(this);
                    bubVar.c = rwb.a;
                    return;
                }
                int[] c = bubVar.c('\"', true);
                wtb wtbVar2 = bubVar.i;
                if (c != null) {
                    wtbVar2.x(c);
                    return;
                } else {
                    wtbVar2.v('&');
                    return;
                }
            }
            bubVar.c = rwb.e0;
            return;
        }
        bubVar.m(this);
        bubVar.i.v((char) 65533);
    }
}
