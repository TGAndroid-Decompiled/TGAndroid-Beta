package j3;
public final class i {
    public final long f9184a;
    public final long f9185b;
    public long f9186c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f9188f = -9223372036854775807L;
    public long f9189g = -9223372036854775807L;
    public float f9191j = 0.97f;
    public float f9190i = 1.03f;
    public float f9192k = 1.0f;
    public long f9193l = -9223372036854775807L;
    public long f9187e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f9194m = -9223372036854775807L;
    public long f9195n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.f9184a = j10;
        this.f9185b = j11;
    }

    public final void a() {
        long j10 = this.f9186c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f9188f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f9189g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f9187e == j10) {
            return;
        }
        this.f9187e = j10;
        this.h = j10;
        this.f9194m = -9223372036854775807L;
        this.f9195n = -9223372036854775807L;
        this.f9193l = -9223372036854775807L;
    }
}
