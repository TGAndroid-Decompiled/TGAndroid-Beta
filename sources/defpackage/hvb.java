package defpackage;
public enum hvb extends rwb {
    public hvb() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String g = ik1Var.g(rwb.F0);
        int length = g.length();
        wtb wtbVar = bubVar.i;
        if (length > 0) {
            wtbVar.w(g);
        } else {
            wtbVar.j = true;
        }
        char d = ik1Var.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        bubVar.i.v(d);
                        return;
                    } else {
                        bubVar.c = rwb.e0;
                        return;
                    }
                }
                int[] c = bubVar.c('\'', true);
                wtb wtbVar2 = bubVar.i;
                if (c != null) {
                    wtbVar2.x(c);
                    return;
                } else {
                    wtbVar2.v('&');
                    return;
                }
            }
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        bubVar.m(this);
        bubVar.i.v((char) 65533);
    }
}
