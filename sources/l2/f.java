package l2;
public final class f {
    public final long f17800a;
    public final long f17801b;
    public long f17802c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f17804f = -9223372036854775807L;
    public long f17805g = -9223372036854775807L;
    public float f17807j = 0.97f;
    public float f17806i = 1.03f;
    public float f17808k = 1.0f;
    public long f17809l = -9223372036854775807L;
    public long f17803e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f17810m = -9223372036854775807L;
    public long f17811n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f17800a = j3;
        this.f17801b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f17802c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f17804f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f17805g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f17803e == j3) {
            return;
        }
        this.f17803e = j3;
        this.h = j3;
        this.f17810m = -9223372036854775807L;
        this.f17811n = -9223372036854775807L;
        this.f17809l = -9223372036854775807L;
    }
}
