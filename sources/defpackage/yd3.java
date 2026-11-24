package defpackage;
public final class yd3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public yd3(go4 go4Var, int i) {
        this.a = (go4Var.e & 1) != 0;
        this.b = kt6.c(i, false);
    }

    @Override
    public final int compareTo(Object obj) {
        yd3 yd3Var = (yd3) obj;
        return hq2.a.c(this.b, yd3Var.b).c(this.a, yd3Var.a).e();
    }
}
