package l2;
public final class f {
    public final long f19328a;
    public final long f19329b;
    public long f19330c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f19332f = -9223372036854775807L;
    public long f19333g = -9223372036854775807L;
    public float f19335j = 0.97f;
    public float f19334i = 1.03f;
    public float f19336k = 1.0f;
    public long f19337l = -9223372036854775807L;
    public long f19331e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f19338m = -9223372036854775807L;
    public long f19339n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f19328a = j3;
        this.f19329b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f19330c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f19332f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f19333g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f19331e == j3) {
            return;
        }
        this.f19331e = j3;
        this.h = j3;
        this.f19338m = -9223372036854775807L;
        this.f19339n = -9223372036854775807L;
        this.f19337l = -9223372036854775807L;
    }
}
