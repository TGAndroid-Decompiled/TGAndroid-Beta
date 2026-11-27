package defpackage;
public final class dd3 extends jd3 implements Comparable {
    public final int e;
    public final int f;

    public dd3(int i, t1c t1cVar, int i2, gd3 gd3Var, int i3) {
        super(i, t1cVar, i2);
        int i4;
        this.e = qu6.c(i3, gd3Var.B0) ? 1 : 0;
        ko4 ko4Var = this.d;
        int i5 = ko4Var.A;
        int i6 = -1;
        if (i5 != -1 && (i4 = ko4Var.B) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((dd3) obj).f);
    }
}
