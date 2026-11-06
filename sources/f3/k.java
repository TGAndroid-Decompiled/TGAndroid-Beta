package f3;
public class k implements c0 {
    public final long f11043a;
    public final long f11044b;
    public final int f11045c;
    public final long d;
    public final int f11046e;
    public final long f11047f;
    public final boolean f11048g;
    public final boolean h;

    public k(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        this.f11043a = j3;
        this.f11044b = j10;
        this.f11045c = i10 == -1 ? 1 : i10;
        this.f11046e = i7;
        this.f11048g = z9;
        this.h = z10;
        if (j3 == -1) {
            this.d = -1L;
            this.f11047f = -9223372036854775807L;
            return;
        }
        long j11 = j3 - j10;
        this.d = j11;
        this.f11047f = (Math.max(0L, j11) * 8000000) / i7;
    }

    @Override
    public final boolean d() {
        if (this.d == -1 && !this.f11048g) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        return this.h;
    }

    @Override
    public final b0 f(long j3) {
        long j10 = this.d;
        int i7 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = this.f11044b;
        if (i7 == 0 && !this.f11048g) {
            d0 d0Var = new d0(0L, j11);
            return new b0(d0Var, d0Var);
        }
        int i10 = this.f11046e;
        long j12 = this.f11045c;
        long j13 = (((i10 * j3) / 8000000) / j12) * j12;
        if (i7 != 0) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i10;
        d0 d0Var2 = new d0(max2, max);
        if (i7 != 0 && max2 < j3) {
            long j14 = max + j12;
            if (j14 < this.f11043a) {
                return new b0(d0Var2, new d0((Math.max(0L, j14 - j11) * 8000000) / i10, j14));
            }
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final long h() {
        return this.f11047f;
    }
}
