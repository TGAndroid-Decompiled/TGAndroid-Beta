package c3;
public final class f {
    public final long f4107a;
    public final long f4108b;
    public final long f4109c;
    public long d = 0;
    public long f4110e;
    public long f4111f;
    public long f4112g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.f4107a = j3;
        this.f4108b = j10;
        this.f4110e = j11;
        this.f4111f = j12;
        this.f4112g = j13;
        this.f4109c = j14;
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
