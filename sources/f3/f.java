package f3;

import h2.l0;
public final class f {
    public final long f11153a;
    public final long f11154b;
    public final long f11155c;
    public long d = 0;
    public long f11156e;
    public long f11157f;
    public long f11158g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f11153a = j3;
        this.f11154b = j10;
        this.f11156e = j11;
        this.f11157f = j12;
        this.f11158g = j13;
        this.f11155c = j14;
        this.h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j3 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return l0.j(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
