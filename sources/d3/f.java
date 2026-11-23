package d3;

import java.util.Arrays;
public final class f {
    public long f7669a;
    public long f7670b;
    public long f7671c;
    public long d;
    public long f7672e;
    public long f7673f;
    public final boolean[] f7674g = new boolean[15];
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
            this.f7669a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f7669a;
            this.f7670b = j11;
            this.f7673f = j11;
            this.f7672e = 1L;
        } else {
            long j12 = j3 - this.f7671c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f7670b) > 1000000L ? 1 : (Math.abs(j12 - this.f7670b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f7674g;
            if (i10 <= 0) {
                this.f7672e++;
                this.f7673f += j12;
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
        this.f7671c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f7672e = 0L;
        this.f7673f = 0L;
        this.h = 0;
        Arrays.fill(this.f7674g, false);
    }
}
