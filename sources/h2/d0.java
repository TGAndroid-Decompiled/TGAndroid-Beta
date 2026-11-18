package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f13743a;
    public int f13744b;
    public boolean f13745c;
    public long d;
    public final e0 f13746e;

    public d0(e0 e0Var, int i7) {
        this.f13746e = e0Var;
        this.f13743a = i7;
    }

    public final void a() {
        e0 e0Var = this.f13746e;
        i0 i0Var = (i0) e0Var.f13751f;
        l2.f0 f0Var = (l2.f0) e0Var.f13747a;
        int w02 = f0Var.w0();
        if (f0Var.u() && f0Var.i() != 1 && f0Var.i() != 4 && w02 != 0 && w02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13745c;
            int i7 = this.f13743a;
            if (z10 && this.f13744b == w02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.z) e0Var.f13749c).f19600a.A1(new l2.l(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f13745c = true;
            this.d = elapsedRealtime;
            this.f13744b = w02;
            i0Var.e(4);
            i0Var.f13771a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f13745c) {
            i0Var.e(4);
        }
        this.f13745c = false;
    }
}
