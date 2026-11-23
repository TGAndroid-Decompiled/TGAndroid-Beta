package l2;
public final class g {
    public final long f19401a;
    public final long f19402b;
    public long f19403c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f19405f = -9223372036854775807L;
    public long f19406g = -9223372036854775807L;
    public float f19408j = 0.97f;
    public float f19407i = 1.03f;
    public float f19409k = 1.0f;
    public long f19410l = -9223372036854775807L;
    public long f19404e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f19411m = -9223372036854775807L;
    public long f19412n = -9223372036854775807L;

    public g(long j3, long j10) {
        this.f19401a = j3;
        this.f19402b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f19403c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f19405f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f19406g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f19404e == j3) {
            return;
        }
        this.f19404e = j3;
        this.h = j3;
        this.f19411m = -9223372036854775807L;
        this.f19412n = -9223372036854775807L;
        this.f19410l = -9223372036854775807L;
    }
}
