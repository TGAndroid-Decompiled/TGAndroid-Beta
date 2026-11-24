package defpackage;

import java.math.RoundingMode;
public final class urc implements fv9 {
    public final sk9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public urc(sk9 sk9Var, int i, long j, long j2) {
        this.a = sk9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / sk9Var.c;
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
    public final ev9 f(long j) {
        sk9 sk9Var = this.a;
        long j2 = (sk9Var.b * j) / (this.b * 1000000);
        long j3 = this.d - 1;
        long j4 = g8c.j(j2, 0L, j3);
        int i = sk9Var.c;
        long j5 = this.c;
        long i2 = i(j4);
        hv9 hv9Var = new hv9(i2, (i * j4) + j5);
        if (i2 < j && j4 != j3) {
            long j6 = j4 + 1;
            return new ev9(hv9Var, new hv9(i(j6), (i * j6) + j5));
        }
        return new ev9(hv9Var, hv9Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = this.a.b;
        String str = g8c.a;
        return g8c.b0(j * this.b, 1000000L, j2, RoundingMode.DOWN);
    }
}
