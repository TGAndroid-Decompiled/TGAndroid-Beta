package m3;
public class g implements t {
    public final long f17228a;
    public final long f17229b;
    public final int f17230c;
    public final long d;
    public final int f17231e;
    public final long f17232f;
    public final boolean f17233g;

    public g(long j10, int i9, int i10, boolean z10, long j11) {
        this.f17228a = j10;
        this.f17229b = j11;
        this.f17230c = i10 == -1 ? 1 : i10;
        this.f17231e = i9;
        this.f17233g = z10;
        if (j10 == -1) {
            this.d = -1L;
            this.f17232f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f17232f = (Math.max(0L, j12) * 8000000) / i9;
    }

    @Override
    public final boolean e() {
        if (this.d == -1 && !this.f17233g) {
            return false;
        }
        return true;
    }

    @Override
    public final s h(long j10) {
        long j11 = this.f17229b;
        long j12 = this.d;
        int i9 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        if (i9 == 0 && !this.f17233g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i10 = this.f17231e;
        long j13 = this.f17230c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (i9 != 0) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i10;
        u uVar2 = new u(max2, max);
        if (i9 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f17228a) {
                return new s(uVar2, new u((Math.max(0L, j15 - j11) * 8000000) / i10, j15));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override
    public final long i() {
        return this.f17232f;
    }
}
