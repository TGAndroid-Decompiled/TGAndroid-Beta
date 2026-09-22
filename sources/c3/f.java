package c3;
public final class f {
    public final long f3757a;
    public final long f3758b;
    public final long f3759c;
    public long d = 0;
    public long e;
    public long f3760f;
    public long f3761g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f3757a = j3;
        this.f3758b = j10;
        this.e = j11;
        this.f3760f = j12;
        this.f3761g = j13;
        this.f3759c = j14;
        this.h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j3 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return e2.d0.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
