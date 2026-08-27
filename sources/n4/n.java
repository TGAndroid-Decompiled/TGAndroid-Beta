package n4;

import d5.g0;
import java.util.List;

public abstract class n extends s {
    public final long d;

    public final long f18262e;

    public final List f18263f;

    public final long f18264g;
    public final long h;

    public final long f18265i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.d = j12;
        this.f18262e = j13;
        this.f18263f = list;
        this.f18265i = j14;
        this.f18264g = j15;
        this.h = j16;
    }

    public final long b(long j10, long j11) {
        long jD = d(j10);
        return jD != -1 ? jD : (int) (f((j11 - this.h) + this.f18265i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long jD = d(j10);
        long j12 = this.d;
        if (jD == -1) {
            long j13 = this.f18264g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f18274b;
        long j13 = this.d;
        List list = this.f18263f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f18271b * 1000000) / j12;
        }
        long jD = d(j11);
        return (jD == -1 || j10 != (j13 + jD) - 1) ? (this.f18262e * 1000000) / j12 : j11 - g(j10);
    }

    public final long f(long j10, long j11) {
        long jD = d(j11);
        long j12 = this.d;
        if (jD != 0) {
            if (this.f18263f != null) {
                long j13 = (jD + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jG = g(j15);
                    if (jG < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jG <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f18262e * 1000000) / this.f18274b)) + j12;
            if (j16 >= j12) {
                return jD == -1 ? j16 : Math.min(j16, (j12 + jD) - 1);
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11 = this.d;
        List list = this.f18263f;
        return g0.O(list != null ? ((q) list.get((int) (j10 - j11))).f18270a - this.f18275c : (j10 - j11) * this.f18262e, 1000000L, this.f18274b);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        return this.f18263f != null;
    }
}
