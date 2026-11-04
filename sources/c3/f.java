package c3;

import java.util.Arrays;
public final class f {
    public long f4025a;
    public long f4026b;
    public long f4027c;
    public long d;
    public long f4028e;
    public long f4029f;
    public final boolean[] f4030g = new boolean[15];
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
            this.f4025a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f4025a;
            this.f4026b = j12;
            this.f4029f = j12;
            this.f4028e = 1L;
        } else {
            long j13 = j10 - this.f4027c;
            int i3 = (int) (j11 % 15);
            int i10 = (Math.abs(j13 - this.f4026b) > 1000000L ? 1 : (Math.abs(j13 - this.f4026b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f4030g;
            if (i10 <= 0) {
                this.f4028e++;
                this.f4029f += j13;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    this.h--;
                }
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                this.h++;
            }
        }
        this.d++;
        this.f4027c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.f4028e = 0L;
        this.f4029f = 0L;
        this.h = 0;
        Arrays.fill(this.f4030g, false);
    }
}
