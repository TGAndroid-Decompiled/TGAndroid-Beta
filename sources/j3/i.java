package j3;
public final class i {
    public final long f8612a;
    public final long f8613b;
    public long f8614c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f8615f = -9223372036854775807L;
    public long f8616g = -9223372036854775807L;
    public float f8618j = 0.97f;
    public float f8617i = 1.03f;
    public float f8619k = 1.0f;
    public long f8620l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f8621m = -9223372036854775807L;
    public long f8622n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f8612a = j10;
        this.f8613b = j11;
    }

    public final void a() {
        long j10 = this.f8614c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f8615f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f8616g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.e == j10) {
            return;
        }
        this.e = j10;
        this.h = j10;
        this.f8621m = -9223372036854775807L;
        this.f8622n = -9223372036854775807L;
        this.f8620l = -9223372036854775807L;
    }
}
