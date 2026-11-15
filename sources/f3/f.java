package f3;

import h2.l0;
public final class f {
    public final long f10831a;
    public final long f10832b;
    public final long f10833c;
    public long d = 0;
    public long f10834e;
    public long f10835f;
    public long f10836g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f10831a = j3;
        this.f10832b = j10;
        this.f10834e = j11;
        this.f10835f = j12;
        this.f10836g = j13;
        this.f10833c = j14;
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
