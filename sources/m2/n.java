package m2;

import e2.d0;
import java.math.RoundingMode;
import java.util.List;
public abstract class n extends s {
    public final long d;
    public final long f15957e;
    public final List f15958f;
    public final long f15959g;
    public final long h;
    public final long f15960i;

    public n(j jVar, long j3, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j3, j10);
        this.d = j11;
        this.f15957e = j12;
        this.f15958f = list;
        this.f15960i = j13;
        this.f15959g = j14;
        this.h = j15;
    }

    public final long b(long j3, long j10) {
        long d = d(j3);
        if (d != -1) {
            return d;
        }
        return (int) (f((j10 - this.h) + this.f15960i, j3) - c(j3, j10));
    }

    public final long c(long j3, long j10) {
        int i10 = (d(j3) > (-1L) ? 1 : (d(j3) == (-1L) ? 0 : -1));
        long j11 = this.d;
        if (i10 == 0) {
            long j12 = this.f15959g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.h) - j12, j3));
            }
        }
        return j11;
    }

    public abstract long d(long j3);

    public final long e(long j3, long j10) {
        long j11 = this.f15969b;
        long j12 = this.d;
        List list = this.f15958f;
        if (list != null) {
            return (((q) list.get((int) (j3 - j12))).f15966b * 1000000) / j11;
        }
        long d = d(j10);
        if (d != -1 && j3 == (j12 + d) - 1) {
            return j10 - g(j3);
        }
        return (this.f15957e * 1000000) / j11;
    }

    public final long f(long j3, long j10) {
        long d = d(j10);
        int i10 = (d > 0L ? 1 : (d == 0L ? 0 : -1));
        long j11 = this.d;
        if (i10 != 0) {
            if (this.f15958f == null) {
                long j12 = (j3 / ((this.f15957e * 1000000) / this.f15969b)) + j11;
                if (j12 >= j11) {
                    if (d == -1) {
                        return j12;
                    }
                    return Math.min(j12, (j11 + d) - 1);
                }
            } else {
                long j13 = (d + j11) - 1;
                long j14 = j11;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    int i11 = (g(j15) > j3 ? 1 : (g(j15) == j3 ? 0 : -1));
                    if (i11 < 0) {
                        j14 = j15 + 1;
                    } else if (i11 > 0) {
                        j13 = j15 - 1;
                    } else {
                        return j15;
                    }
                }
                if (j14 == j11) {
                    return j14;
                }
                return j13;
            }
        }
        return j11;
    }

    public final long g(long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f15958f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f15965a - this.f15970c;
        } else {
            j10 = (j3 - j11) * this.f15957e;
        }
        long j12 = j10;
        String str = d0.f8532a;
        return d0.X(j12, 1000000L, this.f15969b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j3);

    public boolean i() {
        if (this.f15958f != null) {
            return true;
        }
        return false;
    }
}
