package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class a0 {
    public final int f8189a;
    public Object f8190b;
    public int f8191c;
    public int d;
    public long e;
    public long f8192f;
    public boolean f8193g;
    public long h;
    public final e0 f8194i;

    public a0(e0 e0Var, int i10) {
        this.f8194i = e0Var;
        this.f8189a = i10;
    }

    public final void a() {
        Object l4;
        Object obj;
        e0 e0Var = this.f8194i;
        i0 i0Var = e0Var.f8218f;
        i2.h0 h0Var = e0Var.f8215a;
        if (h0Var.d() == 2 && h0Var.t() && h0Var.w0() == 0) {
            o1 y02 = h0Var.y0();
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
            boolean z10 = this.f8193g;
            int i10 = this.f8189a;
            if (z10 && Objects.equals(l4, this.f8190b) && m0 == this.f8191c && N == this.d) {
                obj = l4;
                if (d02 == this.e && max == this.f8192f) {
                    if (elapsedRealtime - this.h >= i10) {
                        e0Var.f8217c.f12322a.A1(new i2.m(2, new f0(1, i10), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l4;
            }
            this.f8193g = true;
            this.h = elapsedRealtime;
            this.f8190b = obj;
            this.f8191c = m0;
            this.d = N;
            this.e = d02;
            this.f8192f = max;
            i0Var.e(1);
            i0Var.f8238a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.f8193g) {
            i0Var.e(1);
        }
        this.f8193g = false;
    }
}
