package c3;
public class k implements b0 {
    public final long f6068a;
    public final long f6069b;
    public final int f6070c;
    public final long d;
    public final int e;
    public final long f6071f;
    public final boolean f6072g;
    public final boolean h;

    public k(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        this.f6068a = j10;
        this.f6069b = j11;
        this.f6070c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.f6072g = z10;
        this.h = z11;
        if (j10 == -1) {
            this.d = -1L;
            this.f6071f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f6071f = (Math.max(0L, j12) * 8000000) / i10;
    }

    @Override
    public final boolean d() {
        if (this.d == -1 && !this.f6072g) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        return this.h;
    }

    @Override
    public final a0 f(long j10) {
        long j11 = this.d;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        long j12 = this.f6069b;
        if (i10 == 0 && !this.f6072g) {
            c0 c0Var = new c0(0L, j12);
            return new a0(c0Var, c0Var);
        }
        int i11 = this.e;
        long j13 = this.f6070c;
        long j14 = (((i11 * j10) / 8000000) / j13) * j13;
        if (i10 != 0) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i11;
        c0 c0Var2 = new c0(max2, max);
        if (i10 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f6068a) {
                return new a0(c0Var2, new c0((Math.max(0L, j15 - j12) * 8000000) / i11, j15));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f6071f;
    }
}
