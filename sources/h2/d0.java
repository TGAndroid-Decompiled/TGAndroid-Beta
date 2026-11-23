package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f13772a;
    public int f13773b;
    public boolean f13774c;
    public long d;
    public final e0 f13775e;

    public d0(e0 e0Var, int i7) {
        this.f13775e = e0Var;
        this.f13772a = i7;
    }

    public final void a() {
        e0 e0Var = this.f13775e;
        i0 i0Var = (i0) e0Var.f13780f;
        l2.f0 f0Var = (l2.f0) e0Var.f13776a;
        int w02 = f0Var.w0();
        if (f0Var.u() && f0Var.i() != 1 && f0Var.i() != 4 && w02 != 0 && w02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13774c;
            int i7 = this.f13772a;
            if (z10 && this.f13773b == w02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.z) e0Var.f13778c).f19628a.A1(new l2.l(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f13774c = true;
            this.d = elapsedRealtime;
            this.f13773b = w02;
            i0Var.e(4);
            i0Var.f13800a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f13774c) {
            i0Var.e(4);
        }
        this.f13774c = false;
    }
}
