package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class a0 {
    public final int f8195a;
    public Object f8196b;
    public int f8197c;
    public int d;
    public long e;
    public long f8198f;
    public boolean f8199g;
    public long h;
    public final e0 f8200i;

    public a0(e0 e0Var, int i10) {
        this.f8200i = e0Var;
        this.f8195a = i10;
    }

    public final void a() {
        Object l4;
        Object obj;
        e0 e0Var = this.f8200i;
        i0 i0Var = e0Var.f8224f;
        i2.h0 h0Var = e0Var.f8221a;
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
            boolean z10 = this.f8199g;
            int i10 = this.f8195a;
            if (z10 && Objects.equals(l4, this.f8196b) && m0 == this.f8197c && N == this.d) {
                obj = l4;
                if (d02 == this.e && max == this.f8198f) {
                    if (elapsedRealtime - this.h >= i10) {
                        e0Var.f8223c.f12353a.A1(new i2.m(2, new f0(1, i10), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l4;
            }
            this.f8199g = true;
            this.h = elapsedRealtime;
            this.f8196b = obj;
            this.f8197c = m0;
            this.d = N;
            this.e = d02;
            this.f8198f = max;
            i0Var.e(1);
            i0Var.f8244a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.f8199g) {
            i0Var.e(1);
        }
        this.f8199g = false;
    }
}
