package i2;
public final class h {
    public final long f12362a;
    public final long f12363b;
    public long f12364c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f12365f = -9223372036854775807L;
    public long f12366g = -9223372036854775807L;
    public float f12368j = 0.97f;
    public float f12367i = 1.03f;
    public float f12369k = 1.0f;
    public long f12370l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f12371m = -9223372036854775807L;
    public long f12372n = -9223372036854775807L;

    public h(long j10, long j11) {
        this.f12362a = j10;
        this.f12363b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f12364c;
        if (j11 != -9223372036854775807L) {
            j10 = this.d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f12365f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f12366g;
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
        this.f12371m = -9223372036854775807L;
        this.f12372n = -9223372036854775807L;
        this.f12370l = -9223372036854775807L;
    }
}
