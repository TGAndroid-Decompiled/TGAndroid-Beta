package i2;
public final class g {
    public final long f13536a;
    public final long f13537b;
    public long f13538c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f13539f = -9223372036854775807L;
    public long f13540g = -9223372036854775807L;
    public float f13542j = 0.97f;
    public float f13541i = 1.03f;
    public float f13543k = 1.0f;
    public long f13544l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f13545m = -9223372036854775807L;
    public long f13546n = -9223372036854775807L;

    public g(long j10, long j11) {
        this.f13536a = j10;
        this.f13537b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f13538c;
        if (j11 != -9223372036854775807L) {
            j10 = this.d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f13539f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f13540g;
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
        this.f13545m = -9223372036854775807L;
        this.f13546n = -9223372036854775807L;
        this.f13544l = -9223372036854775807L;
    }
}
