package i2;
public final class i {
    public final long f11740a;
    public final long f11741b;
    public long f11742c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f11744f = -9223372036854775807L;
    public long f11745g = -9223372036854775807L;
    public float f11747j = 0.97f;
    public float f11746i = 1.03f;
    public float f11748k = 1.0f;
    public long f11749l = -9223372036854775807L;
    public long f11743e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f11750m = -9223372036854775807L;
    public long f11751n = -9223372036854775807L;

    public i(long j3, long j10) {
        this.f11740a = j3;
        this.f11741b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f11742c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f11744f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f11745g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f11743e == j3) {
            return;
        }
        this.f11743e = j3;
        this.h = j3;
        this.f11750m = -9223372036854775807L;
        this.f11751n = -9223372036854775807L;
        this.f11749l = -9223372036854775807L;
    }
}
