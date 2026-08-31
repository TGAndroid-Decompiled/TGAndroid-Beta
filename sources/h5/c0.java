package h5;
public final class c0 {
    public long f7234a;
    public long f7235b;
    public long f7236c;
    public final ThreadLocal d = new ThreadLocal();

    public c0(long j10) {
        f(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j11 = this.f7234a;
                if (j11 == 9223372036854775806L) {
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    j11 = l10.longValue();
                }
                this.f7235b = j11 - j10;
                notifyAll();
            }
            this.f7236c = j10;
            return j10 + this.f7235b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f7236c;
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
        j10 = this.f7234a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long d() {
        return this.f7235b;
    }

    public final synchronized boolean e() {
        boolean z4;
        if (this.f7235b != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        return z4;
    }

    public final synchronized void f(long j10) {
        long j11;
        this.f7234a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f7235b = j11;
        this.f7236c = -9223372036854775807L;
    }

    public final synchronized void g(long j10, boolean z4) {
        boolean z10;
        try {
            if (this.f7234a == 9223372036854775806L) {
                z10 = true;
            } else {
                z10 = false;
            }
            a.i(z10);
            if (e()) {
                return;
            }
            if (z4) {
                this.d.set(Long.valueOf(j10));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
