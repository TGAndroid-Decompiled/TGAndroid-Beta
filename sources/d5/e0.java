package d5;
public final class e0 {
    public long f4346a;
    public long f4347b;
    public long f4348c;
    public final ThreadLocal d = new ThreadLocal();

    public e0(long j10) {
        e(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f4347b == -9223372036854775807L) {
                long j11 = this.f4346a;
                if (j11 == 9223372036854775806L) {
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    j11 = l10.longValue();
                }
                this.f4347b = j11 - j10;
                notifyAll();
            }
            this.f4348c = j10;
            return j10 + this.f4347b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f4348c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                if (Math.abs(j14 - j12) < Math.abs(j15 - j12)) {
                    j10 = j14;
                } else {
                    j10 = j15;
                }
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f4346a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long d() {
        return this.f4347b;
    }

    public final synchronized void e(long j10) {
        long j11;
        this.f4346a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f4347b = j11;
        this.f4348c = -9223372036854775807L;
    }
}
