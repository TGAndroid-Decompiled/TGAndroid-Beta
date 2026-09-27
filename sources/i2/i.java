package i2;
public final class i {
    public final long f10732a;
    public final long f10733b;
    public long f10734c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f10735f = -9223372036854775807L;
    public long f10736g = -9223372036854775807L;
    public float f10738j = 0.97f;
    public float f10737i = 1.03f;
    public float f10739k = 1.0f;
    public long f10740l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f10741m = -9223372036854775807L;
    public long f10742n = -9223372036854775807L;

    public i(long j3, long j10) {
        this.f10732a = j3;
        this.f10733b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f10734c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f10735f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f10736g;
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
        this.f10741m = -9223372036854775807L;
        this.f10742n = -9223372036854775807L;
        this.f10740l = -9223372036854775807L;
    }
}
