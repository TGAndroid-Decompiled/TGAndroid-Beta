package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f9645a;
    public int f9646b;
    public boolean f9647c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f9645a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f9651f;
        i2.j0 j0Var = e0Var.f9648a;
        int w02 = j0Var.w0();
        if (j0Var.t() && j0Var.d() != 1 && j0Var.d() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f9647c;
            int i10 = this.f9645a;
            if (z10 && this.f9646b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f9650c.f13508a.A1(new i2.m(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f9647c = true;
            this.d = elapsedRealtime;
            this.f9646b = w02;
            i0Var.e(4);
            i0Var.f9671a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f9647c) {
            i0Var.e(4);
        }
        this.f9647c = false;
    }
}
