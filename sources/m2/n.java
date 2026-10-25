package m2;

import e2.n0;
import java.math.RoundingMode;
import java.util.List;
public abstract class n extends s {
    public final long d;
    public final long e;
    public final List f17976f;
    public final long f17977g;
    public final long h;
    public final long f17978i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.d = j12;
        this.e = j13;
        this.f17976f = list;
        this.f17978i = j14;
        this.f17977g = j15;
        this.h = j16;
    }

    public final long b(long j10, long j11) {
        long d = d(j10);
        if (d != -1) {
            return d;
        }
        return (int) (f((j11 - this.h) + this.f17978i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        int i10 = (d(j10) > (-1L) ? 1 : (d(j10) == (-1L) ? 0 : -1));
        long j12 = this.d;
        if (i10 == 0) {
            long j13 = this.f17977g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f17986b;
        long j13 = this.d;
        List list = this.f17976f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f17984b * 1000000) / j12;
        }
        long d = d(j11);
        if (d != -1 && j10 == (j13 + d) - 1) {
            return j11 - g(j10);
        }
        return (this.e * 1000000) / j12;
    }

    public final long f(long j10, long j11) {
        long d = d(j11);
        int i10 = (d > 0L ? 1 : (d == 0L ? 0 : -1));
        long j12 = this.d;
        if (i10 != 0) {
            if (this.f17976f == null) {
                long j13 = (j10 / ((this.e * 1000000) / this.f17986b)) + j12;
                if (j13 >= j12) {
                    if (d == -1) {
                        return j13;
                    }
                    return Math.min(j13, (j12 + d) - 1);
                }
            } else {
                long j14 = (d + j12) - 1;
                long j15 = j12;
                while (j15 <= j14) {
                    long j16 = ((j14 - j15) / 2) + j15;
                    int i11 = (g(j16) > j10 ? 1 : (g(j16) == j10 ? 0 : -1));
                    if (i11 < 0) {
                        j15 = j16 + 1;
                    } else if (i11 > 0) {
                        j14 = j16 - 1;
                    } else {
                        return j16;
                    }
                }
                if (j15 == j12) {
                    return j15;
                }
                return j14;
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f17976f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f17983a - this.f17987c;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        String str = n0.f9692a;
        return n0.a0(j13, 1000000L, this.f17986b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        if (this.f17976f != null) {
            return true;
        }
        return false;
    }
}
