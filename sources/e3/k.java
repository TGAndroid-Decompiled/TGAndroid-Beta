package e3;
public class k implements b0 {
    public final long f9485a;
    public final long f9486b;
    public final int f9487c;
    public final long d;
    public final int f9488e;
    public final long f9489f;
    public final boolean f9490g;
    public final boolean h;

    public k(long j10, long j11, int i3, int i10, boolean z10, boolean z11) {
        this.f9485a = j10;
        this.f9486b = j11;
        this.f9487c = i10 == -1 ? 1 : i10;
        this.f9488e = i3;
        this.f9490g = z10;
        this.h = z11;
        if (j10 == -1) {
            this.d = -1L;
            this.f9489f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f9489f = (Math.max(0L, j12) * 8000000) / i3;
    }

    @Override
    public final boolean d() {
        if (this.d == -1 && !this.f9490g) {
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
        int i3 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        long j12 = this.f9486b;
        if (i3 == 0 && !this.f9490g) {
            c0 c0Var = new c0(0L, j12);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.f9488e;
        long j13 = this.f9487c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (i3 != 0) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i10;
        c0 c0Var2 = new c0(max2, max);
        if (i3 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f9485a) {
                return new a0(c0Var2, new c0((Math.max(0L, j15 - j12) * 8000000) / i10, j15));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f9489f;
    }
}
