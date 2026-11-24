package defpackage;
public final class lc3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public lc3(fm4 fm4Var, int i) {
        this.a = (fm4Var.e & 1) != 0;
        this.b = ls6.c(i, false);
    }

    @Override
    public final int compareTo(Object obj) {
        lc3 lc3Var = (lc3) obj;
        return wo2.a.c(this.b, lc3Var.b).c(this.a, lc3Var.a).e();
    }
}
