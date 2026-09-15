package a3;

import java.util.Arrays;
public final class g {
    public long f109a;
    public long f110b;
    public long f111c;
    public long d;
    public long e;
    public long f112f;
    public final boolean[] f113g = new boolean[15];
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
            this.f109a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f109a;
            this.f110b = j11;
            this.f112f = j11;
            this.e = 1L;
        } else {
            long j12 = j3 - this.f111c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f110b);
            boolean[] zArr = this.f113g;
            if (abs <= 1000000) {
                this.e++;
                this.f112f += j12;
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
        this.f111c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f112f = 0L;
        this.h = 0;
        Arrays.fill(this.f113g, false);
    }
}
