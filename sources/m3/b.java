package m3;

import d5.g0;

public final class b {

    public final long f17590a;

    public final long f17591b;

    public final long f17592c;
    public long d = 0;

    public long f17593e;

    public long f17594f;

    public long f17595g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f17590a = j10;
        this.f17591b = j11;
        this.f17593e = j12;
        this.f17594f = j13;
        this.f17595g = j14;
        this.f17592c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return g0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
