package h3;
public final class i {
    public final long f9477a;
    public final long f9478b;
    public long f9479c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f9481f = -9223372036854775807L;
    public long f9482g = -9223372036854775807L;
    public float f9484j = 0.97f;
    public float f9483i = 1.03f;
    public float f9485k = 1.0f;
    public long f9486l = -9223372036854775807L;
    public long f9480e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f9487m = -9223372036854775807L;
    public long f9488n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f9477a = j10;
        this.f9478b = j11;
    }

    public final void a() {
        long j10 = this.f9479c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f9481f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f9482g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f9480e == j10) {
            return;
        }
        this.f9480e = j10;
        this.h = j10;
        this.f9487m = -9223372036854775807L;
        this.f9488n = -9223372036854775807L;
        this.f9486l = -9223372036854775807L;
    }
}
