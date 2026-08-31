package i5;

import java.util.Arrays;
public final class d {
    public long f7813a;
    public long f7814b;
    public long f7815c;
    public long d;
    public long f7816e;
    public long f7817f;
    public final boolean[] f7818g = new boolean[15];
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
            this.f7813a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f7813a;
            this.f7814b = j12;
            this.f7817f = j12;
            this.f7816e = 1L;
        } else {
            long j13 = j10 - this.f7815c;
            int i10 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.f7814b);
            boolean[] zArr = this.f7818g;
            if (abs <= 1000000) {
                this.f7816e++;
                this.f7817f += j13;
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
        this.f7815c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.f7816e = 0L;
        this.f7817f = 0L;
        this.h = 0;
        Arrays.fill(this.f7818g, false);
    }
}
