package h2;

import android.os.SystemClock;
public final class d0 {
    public final int f14070a;
    public int f14071b;
    public boolean f14072c;
    public long d;
    public final e0 f14073e;

    public d0(e0 e0Var, int i7) {
        this.f14073e = e0Var;
        this.f14070a = i7;
    }

    public final void a() {
        e0 e0Var = this.f14073e;
        i0 i0Var = (i0) e0Var.f14078f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14074a;
        int w02 = i0Var2.w0();
        if (i0Var2.u() && i0Var2.i() != 1 && i0Var2.i() != 4 && w02 != 0 && w02 != 1) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z9 = this.f14072c;
            int i7 = this.f14070a;
            if (z9 && this.f14071b == w02) {
                if (elapsedRealtime - this.d >= i7) {
                    ((l2.c0) e0Var.f14076c).f17775a.A1(new l2.l(2, new f0(4, i7), 1003));
                    return;
                }
                return;
            }
            this.f14072c = true;
            this.d = elapsedRealtime;
            this.f14071b = w02;
            i0Var.e(4);
            i0Var.f14098a.sendEmptyMessageDelayed(4, i7);
            return;
        }
        if (this.f14072c) {
            i0Var.e(4);
        }
        this.f14072c = false;
    }
}
