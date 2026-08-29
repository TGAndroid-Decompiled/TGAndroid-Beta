package o3;
public class g implements t {
    public final long f19087a;
    public final long f19088b;
    public final int f19089c;
    public final long d;
    public final int f19090e;
    public final long f19091f;
    public final boolean f19092g;

    public g(long j10, int i10, int i11, boolean z10, long j11) {
        this.f19087a = j10;
        this.f19088b = j11;
        this.f19089c = i11 == -1 ? 1 : i11;
        this.f19090e = i10;
        this.f19092g = z10;
        if (j10 == -1) {
            this.d = -1L;
            this.f19091f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f19091f = (Math.max(0L, j12) * 8000000) / i10;
    }

    @Override
    public final boolean c() {
        if (this.d == -1 && !this.f19092g) {
            return false;
        }
        return true;
    }

    @Override
    public final s g(long j10) {
        long j11 = this.f19088b;
        long j12 = this.d;
        int i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        if (i10 == 0 && !this.f19092g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i11 = this.f19090e;
        long j13 = this.f19089c;
        long j14 = (((i11 * j10) / 8000000) / j13) * j13;
        if (i10 != 0) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i11;
        u uVar2 = new u(max2, max);
        if (i10 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f19087a) {
                return new s(uVar2, new u((Math.max(0L, j15 - j11) * 8000000) / i11, j15));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override
    public final long h() {
        return this.f19091f;
    }
}
