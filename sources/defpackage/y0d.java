package defpackage;
public final class y0d implements nx9 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public y0d(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = jre.a(j3 - i, j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override
    public final long a() {
        return this.f;
    }

    @Override
    public final long b() {
        return this.a + this.b;
    }

    @Override
    public final boolean c() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final long e(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (c() && j3 > this.b) {
            long[] jArr = this.g;
            jArr.getClass();
            double d2 = (j3 * 256.0d) / this.e;
            int f = hac.f(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (f * j4) / 100;
            long j6 = jArr[f];
            int i = f + 1;
            long j7 = (j4 * i) / 100;
            if (f == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override
    public final hx9 f(long j) {
        double d;
        double d2;
        boolean c = c();
        int i = this.b;
        long j2 = this.a;
        if (!c) {
            kx9 kx9Var = new kx9(0L, j2 + i);
            return new hx9(kx9Var, kx9Var);
        }
        long j3 = hac.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        kx9 kx9Var2 = new kx9(j3, j2 + hac.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new hx9(kx9Var2, kx9Var2);
    }

    @Override
    public final int g() {
        return this.d;
    }

    @Override
    public final long h() {
        return this.c;
    }
}
