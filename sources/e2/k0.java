package e2;

import a8.yb;
import java.math.RoundingMode;
public final class k0 {
    public long f9679a;
    public long f9680b;
    public long f9681c;
    public final ThreadLocal d = new ThreadLocal();

    public k0(long j10) {
        g(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j11 = this.f9679a;
                if (j11 == 9223372036854775806L) {
                    Long l4 = (Long) this.d.get();
                    l4.getClass();
                    j11 = l4.longValue();
                }
                this.f9680b = j11 - j10;
                notifyAll();
            }
            this.f9681c = j10;
            return j10 + this.f9680b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f9681c;
            if (j11 != -9223372036854775807L) {
                String str = n0.f9692a;
                long a02 = n0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + a02) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                if (Math.abs(j13 - a02) < Math.abs(j14 - a02)) {
                    j10 = j13;
                } else {
                    j10 = j14;
                }
            }
            long j15 = j10;
            String str2 = n0.f9692a;
            return a(n0.a0(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f9681c;
        if (j11 != -9223372036854775807L) {
            String str = n0.f9692a;
            long a02 = n0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
            long j12 = a02 / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            long j14 = ((j12 + 1) * 8589934592L) + j10;
            if (j13 >= a02) {
                j10 = j13;
            } else {
                j10 = j14;
            }
        }
        long j15 = j10;
        String str2 = n0.f9692a;
        return a(n0.a0(j15, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f9679a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.f9680b;
    }

    public final synchronized boolean f() {
        boolean z10;
        if (this.f9680b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void g(long j10) {
        long j11;
        this.f9679a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f9680b = j11;
        this.f9681c = -9223372036854775807L;
    }

    public final synchronized void h(long j10, boolean z10) {
        boolean z11;
        try {
            if (this.f9679a == 9223372036854775806L) {
                z11 = true;
            } else {
                z11 = false;
            }
            yb.p(z11);
            if (f()) {
                return;
            }
            if (z10) {
                this.d.set(Long.valueOf(j10));
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
