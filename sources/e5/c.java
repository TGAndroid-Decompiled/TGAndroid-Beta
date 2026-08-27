package e5;

import java.util.Arrays;

public final class c {

    public long f5235a;

    public long f5236b;

    public long f5237c;
    public long d;

    public long f5238e;

    public long f5239f;

    public final boolean[] f5240g = new boolean[15];
    public int h;

    public final boolean a() {
        return this.d > 15 && this.h == 0;
    }

    public final void b(long j10) {
        long j11 = this.d;
        if (j11 == 0) {
            this.f5235a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f5235a;
            this.f5236b = j12;
            this.f5239f = j12;
            this.f5238e = 1L;
        } else {
            long j13 = j10 - this.f5237c;
            int i10 = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f5236b);
            boolean[] zArr = this.f5240g;
            if (jAbs <= 1000000) {
                this.f5238e++;
                this.f5239f += j13;
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
        this.f5237c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.f5238e = 0L;
        this.f5239f = 0L;
        this.h = 0;
        Arrays.fill(this.f5240g, false);
    }
}
