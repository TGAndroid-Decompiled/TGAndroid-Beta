package l2;
public final class f {
    public final long f17802a;
    public final long f17803b;
    public long f17804c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f17806f = -9223372036854775807L;
    public long f17807g = -9223372036854775807L;
    public float f17809j = 0.97f;
    public float f17808i = 1.03f;
    public float f17810k = 1.0f;
    public long f17811l = -9223372036854775807L;
    public long f17805e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f17812m = -9223372036854775807L;
    public long f17813n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f17802a = j3;
        this.f17803b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f17804c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f17806f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f17807g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f17805e == j3) {
            return;
        }
        this.f17805e = j3;
        this.h = j3;
        this.f17812m = -9223372036854775807L;
        this.f17813n = -9223372036854775807L;
        this.f17811l = -9223372036854775807L;
    }
}
