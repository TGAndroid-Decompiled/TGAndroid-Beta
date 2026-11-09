package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f14068a;
    public int f14069b;
    public boolean f14070c;
    public long d;
    public final e0 f14071e;

    public d0(e0 e0Var, int i7) {
        this.f14071e = e0Var;
        this.f14068a = i7;
    }

    public final void a() {
        e0 e0Var = this.f14071e;
        i0 i0Var = (i0) e0Var.f14076f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14072a;
        int w02 = i0Var2.w0();
        if (i0Var2.u() && i0Var2.i() != 1 && i0Var2.i() != 4 && w02 != 0 && w02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z9 = this.f14070c;
            int i7 = this.f14068a;
            if (z9 && this.f14069b == w02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.c0) e0Var.f14074c).f17772a.A1(new l2.l(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f14070c = true;
            this.d = elapsedRealtime;
            this.f14069b = w02;
            i0Var.e(4);
            i0Var.f14096a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f14070c) {
            i0Var.e(4);
        }
        this.f14070c = false;
    }
}
