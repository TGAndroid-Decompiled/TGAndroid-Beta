package e5;

import java.util.Arrays;
public final class d {
    public long f4878a;
    public long f4879b;
    public long f4880c;
    public long d;
    public long f4881e;
    public long f4882f;
    public final boolean[] f4883g = new boolean[15];
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
            this.f4878a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f4878a;
            this.f4879b = j12;
            this.f4882f = j12;
            this.f4881e = 1L;
        } else {
            long j13 = j10 - this.f4880c;
            int i9 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.f4879b);
            boolean[] zArr = this.f4883g;
            if (abs <= 1000000) {
                this.f4881e++;
                this.f4882f += j13;
                if (zArr[i9]) {
                    zArr[i9] = false;
                    this.h--;
                }
            } else if (!zArr[i9]) {
                zArr[i9] = true;
                this.h++;
            }
        }
        this.d++;
        this.f4880c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.f4881e = 0L;
        this.f4882f = 0L;
        this.h = 0;
        Arrays.fill(this.f4883g, false);
    }
}
