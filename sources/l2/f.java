package l2;
public final class f {
    public final long f17803a;
    public final long f17804b;
    public long f17805c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f17807f = -9223372036854775807L;
    public long f17808g = -9223372036854775807L;
    public float f17810j = 0.97f;
    public float f17809i = 1.03f;
    public float f17811k = 1.0f;
    public long f17812l = -9223372036854775807L;
    public long f17806e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f17813m = -9223372036854775807L;
    public long f17814n = -9223372036854775807L;

    public f(long j3, long j10) {
        this.f17803a = j3;
        this.f17804b = j10;
    }

    public final void a() {
        long j3;
        long j10 = this.f17805c;
        if (j10 != -9223372036854775807L) {
            j3 = this.d;
            if (j3 == -9223372036854775807L) {
                long j11 = this.f17807f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.f17808g;
                if (j3 == -9223372036854775807L || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f17806e == j3) {
            return;
        }
        this.f17806e = j3;
        this.h = j3;
        this.f17813m = -9223372036854775807L;
        this.f17814n = -9223372036854775807L;
        this.f17812l = -9223372036854775807L;
    }
}
