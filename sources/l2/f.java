package l2;
public final class f {
    public final long f19331a;
    public final long f19332b;
    public long f19333c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f19335f = -9223372036854775807L;
    public long f19336g = -9223372036854775807L;
    public float f19338j = 0.97f;
    public float f19337i = 1.03f;
    public float f19339k = 1.0f;
    public long f19340l = -9223372036854775807L;
    public long f19334e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f19341m = -9223372036854775807L;
    public long f19342n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f19331a = j3;
        this.f19332b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f19333c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f19335f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f19336g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f19334e == j3) {
            return;
        }
        this.f19334e = j3;
        this.h = j3;
        this.f19341m = -9223372036854775807L;
        this.f19342n = -9223372036854775807L;
        this.f19340l = -9223372036854775807L;
    }
}
