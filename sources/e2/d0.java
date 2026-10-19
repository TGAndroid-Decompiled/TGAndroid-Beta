package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f8211a;
    public int f8212b;
    public boolean f8213c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f8211a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f8217f;
        i2.i0 i0Var2 = e0Var.f8214a;
        int w02 = i0Var2.w0();
        if (i0Var2.t() && i0Var2.d() != 1 && i0Var2.d() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8213c;
            int i10 = this.f8211a;
            if (z10 && this.f8212b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f8216c.f12325a.A1(new i2.n(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f8213c = true;
            this.d = elapsedRealtime;
            this.f8212b = w02;
            i0Var.e(4);
            i0Var.f8237a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f8213c) {
            i0Var.e(4);
        }
        this.f8213c = false;
    }
}
