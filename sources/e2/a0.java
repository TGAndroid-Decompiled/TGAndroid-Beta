package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class a0 {
    public final int f8188a;
    public Object f8189b;
    public int f8190c;
    public int d;
    public long e;
    public long f8191f;
    public boolean f8192g;
    public long h;
    public final e0 f8193i;

    public a0(e0 e0Var, int i10) {
        this.f8193i = e0Var;
        this.f8188a = i10;
    }

    public final void a() {
        Object l4;
        Object obj;
        e0 e0Var = this.f8193i;
        i0 i0Var = e0Var.f8217f;
        i2.i0 i0Var2 = e0Var.f8214a;
        if (i0Var2.d() == 2 && i0Var2.t() && i0Var2.w0() == 0) {
            o1 y02 = i0Var2.y0();
            if (y02.p()) {
                l4 = null;
            } else {
                l4 = y02.l(i0Var2.A());
            }
            int m0 = i0Var2.m0();
            int N = i0Var2.N();
            long d02 = i0Var2.d0();
            long max = Math.max(0L, i0Var2.q() - Math.max(0L, d02 - i0Var2.M0()));
            if (l4 != null && m0 == -1) {
                d02 -= m0.h0(y02.g(l4, e0Var.e).e);
            }
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f8192g;
            int i10 = this.f8188a;
            if (z10 && Objects.equals(l4, this.f8189b) && m0 == this.f8190c && N == this.d) {
                obj = l4;
                if (d02 == this.e && max == this.f8191f) {
                    if (elapsedRealtime - this.h >= i10) {
                        e0Var.f8216c.f12325a.A1(new i2.n(2, new f0(1, i10), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l4;
            }
            this.f8192g = true;
            this.h = elapsedRealtime;
            this.f8189b = obj;
            this.f8190c = m0;
            this.d = N;
            this.e = d02;
            this.f8191f = max;
            i0Var.e(1);
            i0Var.f8237a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.f8192g) {
            i0Var.e(1);
        }
        this.f8192g = false;
    }
}
