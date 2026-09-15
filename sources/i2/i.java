package i2;
public final class i {
    public final long f10737a;
    public final long f10738b;
    public long f10739c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f10740f = -9223372036854775807L;
    public long f10741g = -9223372036854775807L;
    public float f10743j = 0.97f;
    public float f10742i = 1.03f;
    public float f10744k = 1.0f;
    public long f10745l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f10746m = -9223372036854775807L;
    public long f10747n = -9223372036854775807L;

    public i(long j3, long j10) {
        this.f10737a = j3;
        this.f10738b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f10739c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f10740f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f10741g;
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
        this.f10746m = -9223372036854775807L;
        this.f10747n = -9223372036854775807L;
        this.f10745l = -9223372036854775807L;
    }
}
