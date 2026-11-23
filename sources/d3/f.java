package d3;

import java.util.Arrays;
public final class f {
    public long f7670a;
    public long f7671b;
    public long f7672c;
    public long d;
    public long f7673e;
    public long f7674f;
    public final boolean[] f7675g = new boolean[15];
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
            this.f7670a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f7670a;
            this.f7671b = j11;
            this.f7674f = j11;
            this.f7673e = 1L;
        } else {
            long j12 = j3 - this.f7672c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f7671b) > 1000000L ? 1 : (Math.abs(j12 - this.f7671b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f7675g;
            if (i10 <= 0) {
                this.f7673e++;
                this.f7674f += j12;
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
        this.f7672c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f7673e = 0L;
        this.f7674f = 0L;
        this.h = 0;
        Arrays.fill(this.f7675g, false);
    }
}
