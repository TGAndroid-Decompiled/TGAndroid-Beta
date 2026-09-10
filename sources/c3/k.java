package c3;
public class k implements b0 {
    public final long f4195a;
    public final long f4196b;
    public final int f4197c;
    public final long d;
    public final int e;
    public final long f4198f;
    public final boolean f4199g;

    public k(long j3, int i10, int i11, boolean z10, long j10) {
        this.f4195a = j3;
        this.f4196b = j10;
        this.f4197c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.f4199g = z10;
        if (j3 == -1) {
            this.d = -1L;
            this.f4198f = -9223372036854775807L;
            return;
        }
        long j11 = j3 - j10;
        this.d = j11;
        this.f4198f = (Math.max(0L, j11) * 8000000) / i10;
    }

    @Override
    public final boolean f() {
        if (this.d == -1 && !this.f4199g) {
            return false;
        }
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long j10 = this.f4196b;
        long j11 = this.d;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        if (i10 == 0 && !this.f4199g) {
            c0 c0Var = new c0(0L, j10);
            return new a0(c0Var, c0Var);
        }
        int i11 = this.e;
        long j12 = this.f4197c;
        long j13 = (((i11 * j3) / 8000000) / j12) * j12;
        if (i10 != 0) {
            j13 = Math.min(j13, j11 - j12);
        }
        long max = Math.max(j13, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i11;
        c0 c0Var2 = new c0(max2, max);
        if (i10 != 0 && max2 < j3) {
            long j14 = max + j12;
            if (j14 < this.f4195a) {
                return new a0(c0Var2, new c0((Math.max(0L, j14 - j10) * 8000000) / i11, j14));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long l() {
        return this.f4198f;
    }
}
