package a3;

import java.util.Arrays;
public final class g {
    public long f102a;
    public long f103b;
    public long f104c;
    public long d;
    public long e;
    public long f105f;
    public final boolean[] f106g = new boolean[15];
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
            this.f102a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f102a;
            this.f103b = j12;
            this.f105f = j12;
            this.e = 1L;
        } else {
            long j13 = j10 - this.f104c;
            int i10 = (int) (j11 % 15);
            int i11 = (Math.abs(j13 - this.f103b) > 1000000L ? 1 : (Math.abs(j13 - this.f103b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f106g;
            if (i11 <= 0) {
                this.e++;
                this.f105f += j13;
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
        this.f104c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f105f = 0L;
        this.h = 0;
        Arrays.fill(this.f106g, false);
    }
}
