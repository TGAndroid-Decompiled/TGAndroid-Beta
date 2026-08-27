package m3;

public class g implements t {

    public final long f17604a;

    public final long f17605b;

    public final int f17606c;
    public final long d;

    public final int f17607e;

    public final long f17608f;

    public final boolean f17609g;

    public g(long j10, int i10, int i11, boolean z10, long j11) {
        this.f17604a = j10;
        this.f17605b = j11;
        this.f17606c = i11 == -1 ? 1 : i11;
        this.f17607e = i10;
        this.f17609g = z10;
        if (j10 == -1) {
            this.d = -1L;
            this.f17608f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.d = j12;
            this.f17608f = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
    }

    @Override
    public final boolean e() {
        return this.d != -1 || this.f17609g;
    }

    @Override
    public final s h(long j10) {
        long j11 = this.f17605b;
        long j12 = this.d;
        if (j12 == -1 && !this.f17609g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i10 = this.f17607e;
        long j13 = this.f17606c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i10);
        u uVar2 = new u(jMax2, jMax);
        if (j12 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f17604a) {
                return new s(uVar2, new u((Math.max(0L, j14 - j11) * 8000000) / ((long) i10), j14));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override
    public final long i() {
        return this.f17608f;
    }
}
