package defpackage;
public final class kt2 extends jt2 implements ez9 {
    public final long i;
    public final long j;

    public kt2(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        this.i = j3;
        this.j = j == -1 ? -1L : j;
    }

    @Override
    public final long a() {
        return this.j;
    }

    @Override
    public final long b() {
        return this.b;
    }

    @Override
    public final yy9 e(long j) {
        long j2 = this.i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.j;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                bz9 bz9Var = new bz9(Math.max(0L, j2 - (((Math.max(0L, (j4 + j5) - j5) << 3) * 1000000) / this.e)), Math.max(j5, j3 - j4));
                return new yy9(bz9Var, bz9Var);
            }
        }
        return super.e(j);
    }

    @Override
    public final long f(long j) {
        return ((Math.max(0L, j - this.b) << 3) * 1000000) / this.e;
    }

    @Override
    public final int g() {
        return this.e;
    }

    @Override
    public final long h() {
        long j = this.i;
        if (j != -9223372036854775807L) {
            return j;
        }
        return this.f;
    }
}
