package j3;
public final class i {
    public final long f8594a;
    public final long f8595b;
    public long f8596c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f8597f = -9223372036854775807L;
    public long f8598g = -9223372036854775807L;
    public float f8600j = 0.97f;
    public float f8599i = 1.03f;
    public float f8601k = 1.0f;
    public long f8602l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f8603m = -9223372036854775807L;
    public long f8604n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f8594a = j10;
        this.f8595b = j11;
    }

    public final void a() {
        long j10 = this.f8596c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f8597f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f8598g;
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
        this.f8603m = -9223372036854775807L;
        this.f8604n = -9223372036854775807L;
        this.f8602l = -9223372036854775807L;
    }
}
