package a3;

import java.util.Arrays;
public final class g {
    public long f111a;
    public long f112b;
    public long f113c;
    public long d;
    public long e;
    public long f114f;
    public final boolean[] f115g = new boolean[15];
    public int h;

    public final boolean a() {
        if (this.d > 15 && this.h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j3) {
        long j10 = this.d;
        if (j10 == 0) {
            this.f111a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f111a;
            this.f112b = j11;
            this.f114f = j11;
            this.e = 1L;
        } else {
            long j12 = j3 - this.f113c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f112b);
            boolean[] zArr = this.f115g;
            if (abs <= 1000000) {
                this.e++;
                this.f114f += j12;
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
        this.f113c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f114f = 0L;
        this.h = 0;
        Arrays.fill(this.f115g, false);
    }
}
