package g5;

import java.util.Arrays;
public final class d {
    public long f7033a;
    public long f7034b;
    public long f7035c;
    public long d;
    public long f7036e;
    public long f7037f;
    public final boolean[] f7038g = new boolean[15];
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
            this.f7033a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f7033a;
            this.f7034b = j12;
            this.f7037f = j12;
            this.f7036e = 1L;
        } else {
            long j13 = j10 - this.f7035c;
            int i10 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.f7034b);
            boolean[] zArr = this.f7038g;
            if (abs <= 1000000) {
                this.f7036e++;
                this.f7037f += j13;
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
        this.f7035c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.f7036e = 0L;
        this.f7037f = 0L;
        this.h = 0;
        Arrays.fill(this.f7038g, false);
    }
}
