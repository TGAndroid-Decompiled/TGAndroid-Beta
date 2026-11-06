package d3;

import java.util.Arrays;
public final class f {
    public long f8003a;
    public long f8004b;
    public long f8005c;
    public long d;
    public long f8006e;
    public long f8007f;
    public final boolean[] f8008g = new boolean[15];
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
            this.f8003a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f8003a;
            this.f8004b = j11;
            this.f8007f = j11;
            this.f8006e = 1L;
        } else {
            long j12 = j3 - this.f8005c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f8004b) > 1000000L ? 1 : (Math.abs(j12 - this.f8004b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f8008g;
            if (i10 <= 0) {
                this.f8006e++;
                this.f8007f += j12;
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
        this.f8005c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f8006e = 0L;
        this.f8007f = 0L;
        this.h = 0;
        Arrays.fill(this.f8008g, false);
    }
}
