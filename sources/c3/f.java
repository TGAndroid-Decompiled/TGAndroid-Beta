package c3;
public final class f {
    public final long f3644a;
    public final long f3645b;
    public final long f3646c;
    public long d = 0;
    public long e;
    public long f3647f;
    public long f3648g;
    public long h;

    public f(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f3644a = j10;
        this.f3645b = j11;
        this.e = j12;
        this.f3647f = j13;
        this.f3648g = j14;
        this.f3646c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return e2.l0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
