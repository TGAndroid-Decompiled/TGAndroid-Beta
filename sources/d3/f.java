package d3;

import java.util.Arrays;
public final class f {
    public long f7678a;
    public long f7679b;
    public long f7680c;
    public long d;
    public long f7681e;
    public long f7682f;
    public final boolean[] f7683g = new boolean[15];
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
            this.f7678a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f7678a;
            this.f7679b = j11;
            this.f7682f = j11;
            this.f7681e = 1L;
        } else {
            long j12 = j3 - this.f7680c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f7679b) > 1000000L ? 1 : (Math.abs(j12 - this.f7679b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f7683g;
            if (i10 <= 0) {
                this.f7681e++;
                this.f7682f += j12;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.h++;
            }
        }
        this.d++;
        this.f7680c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f7681e = 0L;
        this.f7682f = 0L;
        this.h = 0;
        Arrays.fill(this.f7683g, false);
    }
}
