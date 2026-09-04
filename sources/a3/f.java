package a3;

import java.util.Arrays;
public final class f {
    public long f94a;
    public long f95b;
    public long f96c;
    public long d;
    public long f97e;
    public long f98f;
    public final boolean[] f99g = new boolean[15];
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
            this.f94a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f94a;
            this.f95b = j11;
            this.f98f = j11;
            this.f97e = 1L;
        } else {
            long j12 = j3 - this.f96c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f95b);
            boolean[] zArr = this.f99g;
            if (abs <= 1000000) {
                this.f97e++;
                this.f98f += j12;
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
        this.f96c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f97e = 0L;
        this.f98f = 0L;
        this.h = 0;
        Arrays.fill(this.f99g, false);
    }
}
