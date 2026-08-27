package h3;

public final class i {

    public final long f7907a;

    public final long f7908b;

    public long f7909c = -9223372036854775807L;
    public long d = -9223372036854775807L;

    public long f7911f = -9223372036854775807L;

    public long f7912g = -9223372036854775807L;

    public float f7914j = 0.97f;

    public float f7913i = 1.03f;

    public float f7915k = 1.0f;

    public long f7916l = -9223372036854775807L;

    public long f7910e = -9223372036854775807L;
    public long h = -9223372036854775807L;

    public long f7917m = -9223372036854775807L;

    public long f7918n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f7907a = j10;
        this.f7908b = j11;
    }

    public final void a() {
        long j10 = this.f7909c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f7911f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f7912g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f7910e == j10) {
            return;
        }
        this.f7910e = j10;
        this.h = j10;
        this.f7917m = -9223372036854775807L;
        this.f7918n = -9223372036854775807L;
        this.f7916l = -9223372036854775807L;
    }
}
