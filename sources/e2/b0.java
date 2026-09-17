package e2;

import java.math.RoundingMode;
public final class b0 {
    public long f8728a;
    public long f8729b;
    public long f8730c;
    public final ThreadLocal d = new ThreadLocal();

    public b0(long j3) {
        g(j3);
    }

    public final synchronized long a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j10 = this.f8728a;
                if (j10 == 9223372036854775806L) {
                    Long l4 = (Long) this.d.get();
                    l4.getClass();
                    j10 = l4.longValue();
                }
                this.f8729b = j10 - j3;
                notifyAll();
            }
            this.f8730c = j3;
            return j3 + this.f8729b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f8730c;
            if (j10 != -9223372036854775807L) {
                String str = d0.f8737a;
                long Y = d0.Y(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + Y) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j3;
                long j13 = (j11 * 8589934592L) + j3;
                if (Math.abs(j12 - Y) < Math.abs(j13 - Y)) {
                    j3 = j12;
                } else {
                    j3 = j13;
                }
            }
            long j14 = j3;
            String str2 = d0.f8737a;
            return a(d0.Y(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f8730c;
        if (j10 != -9223372036854775807L) {
            String str = d0.f8737a;
            long Y = d0.Y(j10, 90000L, 1000000L, RoundingMode.DOWN);
            long j11 = Y / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j3;
            long j13 = ((j11 + 1) * 8589934592L) + j3;
            if (j12 >= Y) {
                j3 = j12;
            } else {
                j3 = j13;
            }
        }
        long j14 = j3;
        String str2 = d0.f8737a;
        return a(d0.Y(j14, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j3;
        j3 = this.f8728a;
        return (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.f8729b;
    }

    public final synchronized boolean f() {
        boolean z10;
        if (this.f8729b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void g(long j3) {
        long j10;
        this.f8728a = j3;
        if (j3 == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f8729b = j10;
        this.f8730c = -9223372036854775807L;
    }

    public final synchronized void h(long j3, boolean z10) {
        boolean z11;
        try {
            if (this.f8728a == 9223372036854775806L) {
                z11 = true;
            } else {
                z11 = false;
            }
            d.g(z11);
            if (f()) {
                return;
            }
            if (z10) {
                this.d.set(Long.valueOf(j3));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
