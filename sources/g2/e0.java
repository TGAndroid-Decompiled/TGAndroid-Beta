package g2;

import android.os.SystemClock;
public final class e0 {
    public final int f11829a;
    public int f11830b;
    public boolean f11831c;
    public long d;
    public final f0 f11832e;

    public e0(f0 f0Var, int i3) {
        this.f11832e = f0Var;
        this.f11829a = i3;
    }

    public final void a() {
        f0 f0Var = this.f11832e;
        j0 j0Var = (j0) f0Var.f11837f;
        k2.i0 i0Var = (k2.i0) f0Var.f11833a;
        int t02 = i0Var.t0();
        if (i0Var.u() && i0Var.h() != 1 && i0Var.h() != 4 && t02 != 0 && t02 != 1) {
            ((h0) f0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f11831c;
            int i3 = this.f11829a;
            if (z10 && this.f11830b == t02) {
                if (elapsedRealtime - this.d >= i3) {
                    ((k2.c0) f0Var.f11835c).f16459a.A1(new k2.l(2, new g0(4, i3), 1003));
                    return;
                }
                return;
            }
            this.f11831c = true;
            this.d = elapsedRealtime;
            this.f11830b = t02;
            j0Var.e(4);
            j0Var.f11857a.sendEmptyMessageDelayed(4, i3);
            return;
        }
        if (this.f11831c) {
            j0Var.e(4);
        }
        this.f11831c = false;
    }
}
