package defpackage;

import java.math.RoundingMode;
public final class wtc implements ix9 {
    public final tm9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public wtc(tm9 tm9Var, int i, long j, long j2) {
        this.a = tm9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / tm9Var.c;
        this.d = j3;
        this.e = i(j3);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final hx9 f(long j) {
        tm9 tm9Var = this.a;
        long j2 = (tm9Var.b * j) / (this.b * 1000000);
        long j3 = this.d - 1;
        long j4 = hac.j(j2, 0L, j3);
        int i = tm9Var.c;
        long j5 = this.c;
        long i2 = i(j4);
        kx9 kx9Var = new kx9(i2, (i * j4) + j5);
        if (i2 < j && j4 != j3) {
            long j6 = j4 + 1;
            return new hx9(kx9Var, new kx9(i(j6), (i * j6) + j5));
        }
        return new hx9(kx9Var, kx9Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = this.a.b;
        String str = hac.a;
        return hac.b0(j * this.b, 1000000L, j2, RoundingMode.DOWN);
    }
}
