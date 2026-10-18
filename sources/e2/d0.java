package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f8214a;
    public int f8215b;
    public boolean f8216c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f8214a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f8220f;
        i2.h0 h0Var = e0Var.f8217a;
        int w02 = h0Var.w0();
        if (h0Var.t() && h0Var.d() != 1 && h0Var.d() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8216c;
            int i10 = this.f8214a;
            if (z10 && this.f8215b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f8219c.f12324a.A1(new i2.m(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f8216c = true;
            this.d = elapsedRealtime;
            this.f8215b = w02;
            i0Var.e(4);
            i0Var.f8240a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f8216c) {
            i0Var.e(4);
        }
        this.f8216c = false;
    }
}
