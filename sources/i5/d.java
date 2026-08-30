package i5;

import java.util.Arrays;
public final class d {
    public long f7265a;
    public long f7266b;
    public long f7267c;
    public long d;
    public long e;
    public long f7268f;
    public final boolean[] f7269g = new boolean[15];
    public int h;

    public final boolean a() {
        if (this.d > 15 && this.h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j10) {
        long j11 = this.d;
        if (j11 == 0) {
            this.f7265a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f7265a;
            this.f7266b = j12;
            this.f7268f = j12;
            this.e = 1L;
        } else {
            long j13 = j10 - this.f7267c;
            int i10 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.f7266b);
            boolean[] zArr = this.f7269g;
            if (abs <= 1000000) {
                this.e++;
                this.f7268f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.h++;
            }
        }
        this.d++;
        this.f7267c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f7268f = 0L;
        this.h = 0;
        Arrays.fill(this.f7269g, false);
    }
}
