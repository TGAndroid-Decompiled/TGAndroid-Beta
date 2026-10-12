package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;
public final class a0 {
    public final int f8308a;
    public Object f8309b;
    public int f8310c;
    public int d;
    public long e;
    public long f8311f;
    public boolean f8312g;
    public long h;
    public final e0 f8313i;

    public a0(e0 e0Var, int i10) {
        this.f8313i = e0Var;
        this.f8308a = i10;
    }

    public final void a() {
        Object l4;
        Object obj;
        e0 e0Var = this.f8313i;
        i0 i0Var = e0Var.f8337f;
        i2.h0 h0Var = e0Var.f8334a;
        if (h0Var.d() == 2 && h0Var.t() && h0Var.w0() == 0) {
            p1 y02 = h0Var.y0();
            if (y02.p()) {
                l4 = null;
            } else {
                l4 = y02.l(h0Var.A());
            }
            int m0 = h0Var.m0();
            int N = h0Var.N();
            long d02 = h0Var.d0();
            long max = Math.max(0L, h0Var.q() - Math.max(0L, d02 - h0Var.M0()));
            if (l4 != null && m0 == -1) {
                d02 -= m0.h0(y02.g(l4, e0Var.e).e);
            }
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8312g;
            int i10 = this.f8308a;
            if (z10 && Objects.equals(l4, this.f8309b) && m0 == this.f8310c && N == this.d) {
                obj = l4;
                if (d02 == this.e && max == this.f8311f) {
                    if (elapsedRealtime - this.h >= i10) {
                        e0Var.f8336c.f10925a.A1(new i2.m(2, new f0(1, i10), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l4;
            }
            this.f8312g = true;
            this.h = elapsedRealtime;
            this.f8309b = obj;
            this.f8310c = m0;
            this.d = N;
            this.e = d02;
            this.f8311f = max;
            i0Var.e(1);
            i0Var.f8357a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.f8312g) {
            i0Var.e(1);
        }
        this.f8312g = false;
    }
}
