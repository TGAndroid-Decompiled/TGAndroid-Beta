package defpackage;

import java.math.RoundingMode;
public final class iwc implements zy9 {
    public final go9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public iwc(go9 go9Var, int i, long j, long j2) {
        this.a = go9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / go9Var.c;
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
    public final yy9 e(long j) {
        go9 go9Var = this.a;
        long j2 = (go9Var.b * j) / (this.b * 1000000);
        long j3 = this.d - 1;
        long j4 = gcc.j(j2, 0L, j3);
        int i = go9Var.c;
        long j5 = this.c;
        long i2 = i(j4);
        bz9 bz9Var = new bz9(i2, (i * j4) + j5);
        if (i2 < j && j4 != j3) {
            long j6 = j4 + 1;
            return new yy9(bz9Var, new bz9(i(j6), (i * j6) + j5));
        }
        return new yy9(bz9Var, bz9Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = this.a.b;
        String str = gcc.a;
        return gcc.b0(j * this.b, 1000000L, j2, RoundingMode.DOWN);
    }
}
