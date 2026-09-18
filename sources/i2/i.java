package i2;
public final class i {
    public final long f10740a;
    public final long f10741b;
    public long f10742c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f10743f = -9223372036854775807L;
    public long f10744g = -9223372036854775807L;
    public float f10746j = 0.97f;
    public float f10745i = 1.03f;
    public float f10747k = 1.0f;
    public long f10748l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f10749m = -9223372036854775807L;
    public long f10750n = -9223372036854775807L;

    public i(long j3, long j10) {
        this.f10740a = j3;
        this.f10741b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f10742c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f10743f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f10744g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.e == j3) {
            return;
        }
        this.e = j3;
        this.h = j3;
        this.f10749m = -9223372036854775807L;
        this.f10750n = -9223372036854775807L;
        this.f10748l = -9223372036854775807L;
    }
}
