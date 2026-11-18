package l2;
public final class f {
    public final long f19300a;
    public final long f19301b;
    public long f19302c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f19304f = -9223372036854775807L;
    public long f19305g = -9223372036854775807L;
    public float f19307j = 0.97f;
    public float f19306i = 1.03f;
    public float f19308k = 1.0f;
    public long f19309l = -9223372036854775807L;
    public long f19303e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f19310m = -9223372036854775807L;
    public long f19311n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f19300a = j3;
        this.f19301b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f19302c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f19304f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f19305g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f19303e == j3) {
            return;
        }
        this.f19303e = j3;
        this.h = j3;
        this.f19310m = -9223372036854775807L;
        this.f19311n = -9223372036854775807L;
        this.f19309l = -9223372036854775807L;
    }
}
