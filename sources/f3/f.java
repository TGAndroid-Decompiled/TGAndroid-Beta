package f3;

import h2.l0;
public final class f {
    public final long f11150a;
    public final long f11151b;
    public final long f11152c;
    public long d = 0;
    public long f11153e;
    public long f11154f;
    public long f11155g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f11150a = j3;
        this.f11151b = j10;
        this.f11153e = j11;
        this.f11154f = j12;
        this.f11155g = j13;
        this.f11152c = j14;
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
