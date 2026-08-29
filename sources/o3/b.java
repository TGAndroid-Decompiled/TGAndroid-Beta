package o3;

import f5.d0;
public final class b {
    public final long f19073a;
    public final long f19074b;
    public final long f19075c;
    public long d = 0;
    public long f19076e;
    public long f19077f;
    public long f19078g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f19073a = j10;
        this.f19074b = j11;
        this.f19076e = j12;
        this.f19077f = j13;
        this.f19078g = j14;
        this.f19075c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return d0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
