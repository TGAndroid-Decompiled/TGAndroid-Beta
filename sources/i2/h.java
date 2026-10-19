package i2;
public final class h {
    public final long f12364a;
    public final long f12365b;
    public long f12366c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f12367f = -9223372036854775807L;
    public long f12368g = -9223372036854775807L;
    public float f12370j = 0.97f;
    public float f12369i = 1.03f;
    public float f12371k = 1.0f;
    public long f12372l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f12373m = -9223372036854775807L;
    public long f12374n = -9223372036854775807L;

    public h(long j10, long j11) {
        this.f12364a = j10;
        this.f12365b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f12366c;
        if (j11 != -9223372036854775807L) {
            j10 = this.d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f12367f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f12368g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.e == j10) {
            return;
        }
        this.e = j10;
        this.h = j10;
        this.f12373m = -9223372036854775807L;
        this.f12374n = -9223372036854775807L;
        this.f12372l = -9223372036854775807L;
    }
}
