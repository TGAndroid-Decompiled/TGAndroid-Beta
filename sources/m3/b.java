package m3;

import d5.f0;
public final class b {
    public final long f17214a;
    public final long f17215b;
    public final long f17216c;
    public long d = 0;
    public long f17217e;
    public long f17218f;
    public long f17219g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f17214a = j10;
        this.f17215b = j11;
        this.f17217e = j12;
        this.f17218f = j13;
        this.f17219g = j14;
        this.f17216c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return f0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
