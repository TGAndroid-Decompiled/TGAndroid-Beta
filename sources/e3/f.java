package e3;

import g2.n0;
public final class f {
    public final long f9460a;
    public final long f9461b;
    public final long f9462c;
    public long d = 0;
    public long f9463e;
    public long f9464f;
    public long f9465g;
    public long h;

    public f(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f9460a = j10;
        this.f9461b = j11;
        this.f9463e = j12;
        this.f9464f = j13;
        this.f9465g = j14;
        this.f9462c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return n0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
