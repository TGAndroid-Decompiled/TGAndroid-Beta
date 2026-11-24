package defpackage;
public final class xd3 extends de3 implements Comparable {
    public final int e;
    public final int f;

    public xd3(int i, uzb uzbVar, int i2, ae3 ae3Var, int i3) {
        super(i, uzbVar, i2);
        int i4;
        this.e = kt6.c(i3, ae3Var.B0) ? 1 : 0;
        go4 go4Var = this.d;
        int i5 = go4Var.A;
        int i6 = -1;
        if (i5 != -1 && (i4 = go4Var.B) != -1) {
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
        return Integer.compare(this.f, ((xd3) obj).f);
    }
}
