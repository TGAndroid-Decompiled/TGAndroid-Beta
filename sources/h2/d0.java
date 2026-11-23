package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f13735a;
    public int f13736b;
    public boolean f13737c;
    public long d;
    public final e0 f13738e;

    public d0(e0 e0Var, int i7) {
        this.f13738e = e0Var;
        this.f13735a = i7;
    }

    public final void a() {
        e0 e0Var = this.f13738e;
        i0 i0Var = (i0) e0Var.f13743f;
        l2.g0 g0Var = (l2.g0) e0Var.f13739a;
        int x02 = g0Var.x0();
        if (g0Var.v() && g0Var.i() != 1 && g0Var.i() != 4 && x02 != 0 && x02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13737c;
            int i7 = this.f13735a;
            if (z10 && this.f13736b == x02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.a0) e0Var.f13741c).f19342a.A1(new l2.m(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f13737c = true;
            this.d = elapsedRealtime;
            this.f13736b = x02;
            i0Var.e(4);
            i0Var.f13763a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f13737c) {
            i0Var.e(4);
        }
        this.f13737c = false;
    }
}
