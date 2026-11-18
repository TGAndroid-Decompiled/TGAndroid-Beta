package l2;
public final class f {
    public final long f19303a;
    public final long f19304b;
    public long f19305c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f19307f = -9223372036854775807L;
    public long f19308g = -9223372036854775807L;
    public float f19310j = 0.97f;
    public float f19309i = 1.03f;
    public float f19311k = 1.0f;
    public long f19312l = -9223372036854775807L;
    public long f19306e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f19313m = -9223372036854775807L;
    public long f19314n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f19303a = j3;
        this.f19304b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f19305c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f19307f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f19308g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f19306e == j3) {
            return;
        }
        this.f19306e = j3;
        this.h = j3;
        this.f19313m = -9223372036854775807L;
        this.f19314n = -9223372036854775807L;
        this.f19312l = -9223372036854775807L;
    }
}
