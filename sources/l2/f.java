package l2;
public final class f {
    public final long f18936a;
    public final long f18937b;
    public long f18938c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f18940f = -9223372036854775807L;
    public long f18941g = -9223372036854775807L;
    public float f18943j = 0.97f;
    public float f18942i = 1.03f;
    public float f18944k = 1.0f;
    public long f18945l = -9223372036854775807L;
    public long f18939e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f18946m = -9223372036854775807L;
    public long f18947n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f18936a = j3;
        this.f18937b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f18938c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f18940f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f18941g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f18939e == j3) {
            return;
        }
        this.f18939e = j3;
        this.h = j3;
        this.f18946m = -9223372036854775807L;
        this.f18947n = -9223372036854775807L;
        this.f18945l = -9223372036854775807L;
    }
}
