package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;
public final class a0 {
    public final int f9622a;
    public Object f9623b;
    public int f9624c;
    public int d;
    public long e;
    public long f9625f;
    public boolean f9626g;
    public long h;
    public final e0 f9627i;

    public a0(e0 e0Var, int i10) {
        this.f9627i = e0Var;
        this.f9622a = i10;
    }

    public final void a() {
        Object l4;
        Object obj;
        e0 e0Var = this.f9627i;
        i0 i0Var = e0Var.f9651f;
        i2.j0 j0Var = e0Var.f9648a;
        if (j0Var.d() == 2 && j0Var.t() && j0Var.w0() == 0) {
            p1 y02 = j0Var.y0();
            if (y02.p()) {
                l4 = null;
            } else {
                l4 = y02.l(j0Var.A());
            }
            int m0 = j0Var.m0();
            int N = j0Var.N();
            long d02 = j0Var.d0();
            long max = Math.max(0L, j0Var.q() - Math.max(0L, d02 - j0Var.M0()));
            if (l4 != null && m0 == -1) {
                d02 -= n0.h0(y02.g(l4, e0Var.e).e);
            }
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f9626g;
            int i10 = this.f9622a;
            if (z10 && Objects.equals(l4, this.f9623b) && m0 == this.f9624c && N == this.d) {
                obj = l4;
                if (d02 == this.e && max == this.f9625f) {
                    if (elapsedRealtime - this.h >= i10) {
                        e0Var.f9650c.f13508a.A1(new i2.m(2, new f0(1, i10), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l4;
            }
            this.f9626g = true;
            this.h = elapsedRealtime;
            this.f9623b = obj;
            this.f9624c = m0;
            this.d = N;
            this.e = d02;
            this.f9625f = max;
            i0Var.e(1);
            i0Var.f9671a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.f9626g) {
            i0Var.e(1);
        }
        this.f9626g = false;
    }
}
