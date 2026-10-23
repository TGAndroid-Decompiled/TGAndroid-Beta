package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f8218a;
    public int f8219b;
    public boolean f8220c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f8218a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f8224f;
        i2.h0 h0Var = e0Var.f8221a;
        int w02 = h0Var.w0();
        if (h0Var.t() && h0Var.d() != 1 && h0Var.d() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8220c;
            int i10 = this.f8218a;
            if (z10 && this.f8219b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f8223c.f12353a.A1(new i2.m(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f8220c = true;
            this.d = elapsedRealtime;
            this.f8219b = w02;
            i0Var.e(4);
            i0Var.f8244a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f8220c) {
            i0Var.e(4);
        }
        this.f8220c = false;
    }
}
