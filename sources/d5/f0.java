package d5;

public final class f0 {

    public long f4791a;

    public long f4792b;

    public long f4793c;
    public final ThreadLocal d = new ThreadLocal();

    public f0(long j10) {
        e(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f4792b == -9223372036854775807L) {
                long jLongValue = this.f4791a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f4792b = jLongValue - j10;
                notifyAll();
            }
            this.f4793c = j10;
            return j10 + this.f4792b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f4793c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f4791a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long d() {
        return this.f4792b;
    }

    public final synchronized void e(long j10) {
        this.f4791a = j10;
        this.f4792b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f4793c = -9223372036854775807L;
    }
}
