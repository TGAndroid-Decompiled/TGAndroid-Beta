package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f8213a;
    public int f8214b;
    public boolean f8215c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f8213a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f8219f;
        i2.g0 g0Var = e0Var.f8216a;
        int w02 = g0Var.w0();
        if (g0Var.t() && g0Var.d() != 1 && g0Var.d() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8215c;
            int i10 = this.f8213a;
            if (z10 && this.f8214b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f8218c.f12309a.A1(new i2.l(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f8215c = true;
            this.d = elapsedRealtime;
            this.f8214b = w02;
            i0Var.e(4);
            i0Var.f8239a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f8215c) {
            i0Var.e(4);
        }
        this.f8215c = false;
    }
}
