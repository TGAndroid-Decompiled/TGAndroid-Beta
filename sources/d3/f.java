package d3;

import java.util.Arrays;
public final class f {
    public long f8006a;
    public long f8007b;
    public long f8008c;
    public long d;
    public long f8009e;
    public long f8010f;
    public final boolean[] f8011g = new boolean[15];
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
            this.f8006a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f8006a;
            this.f8007b = j11;
            this.f8010f = j11;
            this.f8009e = 1L;
        } else {
            long j12 = j3 - this.f8008c;
            int i7 = (int) (j10 % 15);
            int i10 = (Math.abs(j12 - this.f8007b) > 1000000L ? 1 : (Math.abs(j12 - this.f8007b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f8011g;
            if (i10 <= 0) {
                this.f8009e++;
                this.f8010f += j12;
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
        this.f8008c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.f8009e = 0L;
        this.f8010f = 0L;
        this.h = 0;
        Arrays.fill(this.f8011g, false);
    }
}
