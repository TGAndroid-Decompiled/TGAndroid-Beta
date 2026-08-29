package j3;
public final class i {
    public final long f10514a;
    public final long f10515b;
    public long f10516c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f10518f = -9223372036854775807L;
    public long f10519g = -9223372036854775807L;
    public float f10521j = 0.97f;
    public float f10520i = 1.03f;
    public float f10522k = 1.0f;
    public long f10523l = -9223372036854775807L;
    public long f10517e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f10524m = -9223372036854775807L;
    public long f10525n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f10514a = j10;
        this.f10515b = j11;
    }

    public final void a() {
        long j10 = this.f10516c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f10518f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f10519g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f10517e == j10) {
            return;
        }
        this.f10517e = j10;
        this.h = j10;
        this.f10524m = -9223372036854775807L;
        this.f10525n = -9223372036854775807L;
        this.f10523l = -9223372036854775807L;
    }
}
