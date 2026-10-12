package c3;

import e2.m0;
public final class f {
    public final long f4239a;
    public final long f4240b;
    public final long f4241c;
    public long d = 0;
    public long e;
    public long f4242f;
    public long f4243g;
    public long h;

    public f(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f4239a = j10;
        this.f4240b = j11;
        this.e = j12;
        this.f4242f = j13;
        this.f4243g = j14;
        this.f4241c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return m0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
