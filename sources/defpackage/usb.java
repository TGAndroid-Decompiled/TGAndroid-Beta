package defpackage;

import java.math.RoundingMode;
public final class usb {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public usb(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!f()) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            String str = gcc.a;
            long b0 = gcc.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = (4294967296L + b0) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            long j5 = (j3 * 8589934592L) + j;
            if (Math.abs(j4 - b0) < Math.abs(j5 - b0)) {
                j = j4;
            } else {
                j = j5;
            }
        }
        long j6 = j;
        String str2 = gcc.a;
        return a(gcc.b0(j6, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            String str = gcc.a;
            long b0 = gcc.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = b0 / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            long j5 = ((j3 + 1) * 8589934592L) + j;
            if (j4 >= b0) {
                j = j4;
            } else {
                j = j5;
            }
        }
        long j6 = j;
        String str2 = gcc.a;
        return a(gcc.b0(j6, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        boolean z;
        if (this.b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void g(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = -9223372036854775807L;
    }

    public final synchronized void h(long j, boolean z) {
        boolean z2;
        if (this.a == 9223372036854775806L) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.p(z2);
        if (f()) {
            return;
        }
        if (z) {
            this.d.set(Long.valueOf(j));
        } else {
            while (!f()) {
                wait();
            }
        }
    }
}
