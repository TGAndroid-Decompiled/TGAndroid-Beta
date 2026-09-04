package c3;
public final class f {
    public final long f4252a;
    public final long f4253b;
    public final long f4254c;
    public long d = 0;
    public long f4255e;
    public long f4256f;
    public long f4257g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f4252a = j3;
        this.f4253b = j10;
        this.f4255e = j11;
        this.f4256f = j12;
        this.f4257g = j13;
        this.f4254c = j14;
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
