package a3;

import java.util.Arrays;
public final class g {
    public long f118a;
    public long f119b;
    public long f120c;
    public long d;
    public long f121e;
    public long f122f;
    public final boolean[] f123g = new boolean[15];
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
            this.f118a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f118a;
            this.f119b = j11;
            this.f122f = j11;
            this.f121e = 1L;
        } else {
            long j12 = j3 - this.f120c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f119b);
            boolean[] zArr = this.f123g;
            if (abs <= 1000000) {
                this.f121e++;
                this.f122f += j12;
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
        this.f120c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f121e = 0L;
        this.f122f = 0L;
        this.h = 0;
        Arrays.fill(this.f123g, false);
    }
}
