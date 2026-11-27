package defpackage;
public enum mwb extends rwb {
    public mwb() {
        super("CdataSection", 66);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String c;
        StringBuilder sb = bubVar.h;
        String[] strArr = ik1Var.h;
        char[] cArr = ik1Var.a;
        int p = ik1Var.p("]]>");
        if (p != -1) {
            c = ik1.c(cArr, strArr, ik1Var.e, p);
            ik1Var.e += p;
        } else {
            ik1Var.b();
            int i = ik1Var.e;
            c = ik1.c(cArr, strArr, i, ik1Var.c - i);
            ik1Var.e = ik1Var.c;
        }
        sb.append(c);
        if (!ik1Var.k("]]>") && !ik1Var.j()) {
            return;
        }
        String sb2 = sb.toString();
        ?? iu5Var = new iu5(5, (byte) 2);
        iu5Var.e = sb2;
        bubVar.g(iu5Var);
        bubVar.c = rwb.a;
    }
}
