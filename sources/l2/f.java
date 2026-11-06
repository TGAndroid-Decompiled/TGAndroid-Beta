package l2;
public final class f {
    public final long f17799a;
    public final long f17800b;
    public long f17801c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f17803f = -9223372036854775807L;
    public long f17804g = -9223372036854775807L;
    public float f17806j = 0.97f;
    public float f17805i = 1.03f;
    public float f17807k = 1.0f;
    public long f17808l = -9223372036854775807L;
    public long f17802e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f17809m = -9223372036854775807L;
    public long f17810n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f17799a = j3;
        this.f17800b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f17801c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f17803f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f17804g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f17802e == j3) {
            return;
        }
        this.f17802e = j3;
        this.h = j3;
        this.f17809m = -9223372036854775807L;
        this.f17810n = -9223372036854775807L;
        this.f17808l = -9223372036854775807L;
    }
}
