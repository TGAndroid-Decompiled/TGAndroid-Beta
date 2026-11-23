package f3;
public class k implements b0 {
    public final long f11207a;
    public final long f11208b;
    public final int f11209c;
    public final long d;
    public final int f11210e;
    public final long f11211f;
    public final boolean f11212g;
    public final boolean h;

    public k(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        this.f11207a = j3;
        this.f11208b = j10;
        this.f11209c = i10 == -1 ? 1 : i10;
        this.f11210e = i7;
        this.f11212g = z10;
        this.h = z11;
        if (j3 == -1) {
            this.d = -1L;
            this.f11211f = -9223372036854775807L;
            return;
        }
        long j11 = j3 - j10;
        this.d = j11;
        this.f11211f = (Math.max(0L, j11) * 8000000) / i7;
    }

    @Override
    public final boolean d() {
        if (this.d == -1 && !this.f11212g) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        return this.h;
    }

    @Override
    public final a0 f(long j3) {
        long j10 = this.d;
        int i7 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = this.f11208b;
        if (i7 == 0 && !this.f11212g) {
            c0 c0Var = new c0(0L, j11);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.f11210e;
        long j12 = this.f11209c;
        long j13 = (((i10 * j3) / 8000000) / j12) * j12;
        if (i7 != 0) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i10;
        c0 c0Var2 = new c0(max2, max);
        if (i7 != 0 && max2 < j3) {
            long j14 = max + j12;
            if (j14 < this.f11207a) {
                return new a0(c0Var2, new c0((Math.max(0L, j14 - j11) * 8000000) / i10, j14));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f11211f;
    }
}
