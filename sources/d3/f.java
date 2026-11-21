package d3;

import java.util.Arrays;
public final class f {
    public long f7704a;
    public long f7705b;
    public long f7706c;
    public long d;
    public long f7707e;
    public long f7708f;
    public final boolean[] f7709g = new boolean[15];
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
            this.f7704a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f7704a;
            this.f7705b = j11;
            this.f7708f = j11;
            this.f7707e = 1L;
        } else {
            long j12 = j3 - this.f7706c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f7705b) > 1000000L ? 1 : (Math.abs(j12 - this.f7705b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f7709g;
            if (i10 <= 0) {
                this.f7707e++;
                this.f7708f += j12;
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
        this.f7706c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f7707e = 0L;
        this.f7708f = 0L;
        this.h = 0;
        Arrays.fill(this.f7709g, false);
    }
}
