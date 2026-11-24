package defpackage;
public final class ki0 {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public ki0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.c = j6;
        this.h = a(j2, 0L, j3, j4, j5, j6);
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 < j5 && j2 + 1 < j3) {
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return g8c.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
        return j4;
    }
}
