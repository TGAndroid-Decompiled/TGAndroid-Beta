package c3;
public class k implements e0 {
    public final long f4637a;
    public final long f4638b;
    public final int f4639c;
    public final long d;
    public final int e;
    public final long f4640f;
    public final boolean f4641g;
    public final boolean h;

    public k(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        this.f4637a = j10;
        this.f4638b = j11;
        this.f4639c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.f4641g = z10;
        this.h = z11;
        if (j10 == -1) {
            this.d = -1L;
            this.f4640f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f4640f = (Math.max(0L, j12) * 8000000) / i10;
    }

    @Override
    public final boolean d() {
        if (this.d == -1 && !this.f4641g) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        return this.h;
    }

    @Override
    public final d0 f(long j10) {
        long j11 = this.d;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        long j12 = this.f4638b;
        if (i10 == 0 && !this.f4641g) {
            f0 f0Var = new f0(0L, j12);
            return new d0(f0Var, f0Var);
        }
        int i11 = this.e;
        long j13 = this.f4639c;
        long j14 = (((i11 * j10) / 8000000) / j13) * j13;
        if (i10 != 0) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i11;
        f0 f0Var2 = new f0(max2, max);
        if (i10 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f4637a) {
                return new d0(f0Var2, new f0((Math.max(0L, j15 - j12) * 8000000) / i11, j15));
            }
        }
        return new d0(f0Var2, f0Var2);
    }

    @Override
    public final long h() {
        return this.f4640f;
    }
}
