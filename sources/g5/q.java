package g5;

import java.util.Arrays;
public final class q {
    public int f6898c;
    public int d;
    public final boolean f6896a = true;
    public final int f6897b = 65536;
    public int f6899e = 0;
    public a[] f6900f = new a[100];

    public final synchronized void a(int i10) {
        boolean z4;
        if (i10 < this.f6898c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6898c = i10;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, h5.d0.f(this.f6898c, this.f6897b) - this.d);
        int i10 = this.f6899e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f6900f, max, i10, (Object) null);
        this.f6899e = max;
    }
}
