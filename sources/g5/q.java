package g5;

import java.util.Arrays;
public final class q {
    public int f6412c;
    public int d;
    public final boolean f6410a = true;
    public final int f6411b = 65536;
    public int e = 0;
    public a[] f6413f = new a[100];

    public final synchronized void a(int i10) {
        boolean z4;
        if (i10 < this.f6412c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6412c = i10;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, h5.d0.f(this.f6412c, this.f6411b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f6413f, max, i10, (Object) null);
        this.e = max;
    }
}
