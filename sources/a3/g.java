package a3;

import java.util.Arrays;
public final class g {
    public long f120a;
    public long f121b;
    public long f122c;
    public long d;
    public long f123e;
    public long f124f;
    public final boolean[] f125g = new boolean[15];
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
            this.f120a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f120a;
            this.f121b = j11;
            this.f124f = j11;
            this.f123e = 1L;
        } else {
            long j12 = j3 - this.f122c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f121b);
            boolean[] zArr = this.f125g;
            if (abs <= 1000000) {
                this.f123e++;
                this.f124f += j12;
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
        this.f122c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f123e = 0L;
        this.f124f = 0L;
        this.h = 0;
        Arrays.fill(this.f125g, false);
    }
}
