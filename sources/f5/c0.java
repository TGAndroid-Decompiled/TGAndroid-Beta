package f5;
public final class c0 {
    public long f6576a;
    public long f6577b;
    public long f6578c;
    public final ThreadLocal d = new ThreadLocal();

    public c0(long j10) {
        e(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f6577b == -9223372036854775807L) {
                long j11 = this.f6576a;
                if (j11 == 9223372036854775806L) {
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    j11 = l10.longValue();
                }
                this.f6577b = j11 - j10;
                notifyAll();
            }
            this.f6578c = j10;
            return j10 + this.f6577b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f6578c;
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
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f6576a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long d() {
        return this.f6577b;
    }

    public final synchronized void e(long j10) {
        long j11;
        this.f6576a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f6577b = j11;
        this.f6578c = -9223372036854775807L;
    }
}
