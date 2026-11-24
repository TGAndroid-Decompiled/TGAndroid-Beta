package defpackage;
public enum lsb extends qsb {
    public lsb() {
        super("CdataSection", 66);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String c;
        StringBuilder sb = aqbVar.h;
        String[] strArr = zj1Var.h;
        char[] cArr = zj1Var.a;
        int p = zj1Var.p("]]>");
        if (p != -1) {
            c = zj1.c(cArr, strArr, zj1Var.e, p);
            zj1Var.e += p;
        } else {
            zj1Var.b();
            int i = zj1Var.e;
            c = zj1.c(cArr, strArr, i, zj1Var.c - i);
            zj1Var.e = zj1Var.c;
        }
        sb.append(c);
        if (!zj1Var.k("]]>") && !zj1Var.j()) {
            return;
        }
        String sb2 = sb.toString();
        ?? fs5Var = new fs5(5, (byte) 2);
        fs5Var.e = sb2;
        aqbVar.g(fs5Var);
        aqbVar.c = qsb.a;
    }
}
