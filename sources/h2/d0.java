package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f13428a;
    public int f13429b;
    public boolean f13430c;
    public long d;
    public final e0 f13431e;

    public d0(e0 e0Var, int i7) {
        this.f13431e = e0Var;
        this.f13428a = i7;
    }

    public final void a() {
        e0 e0Var = this.f13431e;
        i0 i0Var = (i0) e0Var.f13436f;
        l2.f0 f0Var = (l2.f0) e0Var.f13432a;
        int w02 = f0Var.w0();
        if (f0Var.u() && f0Var.i() != 1 && f0Var.i() != 4 && w02 != 0 && w02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13430c;
            int i7 = this.f13428a;
            if (z10 && this.f13429b == w02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.z) e0Var.f13434c).f19233a.A1(new l2.l(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f13430c = true;
            this.d = elapsedRealtime;
            this.f13429b = w02;
            i0Var.e(4);
            i0Var.f13456a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f13430c) {
            i0Var.e(4);
        }
        this.f13430c = false;
    }
}
