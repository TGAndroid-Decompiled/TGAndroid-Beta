package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class b0 {
    public final int f8199a;
    public Object f8200b;
    public int f8201c;
    public int d;
    public long e;
    public boolean f8202f;
    public long f8203g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f8199a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f8219f;
        i2.i0 i0Var2 = e0Var.f8216a;
        if (!i0Var2.j0()) {
            if (this.f8202f) {
                i0Var.e(2);
            }
            this.f8202f = false;
            return;
        }
        o1 y02 = i0Var2.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(i0Var2.A());
        }
        int m0 = i0Var2.m0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 != null && m0 == -1) {
            M0 -= m0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f8202f;
        int i10 = this.f8199a;
        if (z10 && Objects.equals(l4, this.f8200b) && m0 == this.f8201c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f8203g >= i10) {
                e0Var.f8218c.f12327a.A1(new i2.n(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f8202f = true;
        this.f8203g = elapsedRealtime;
        this.f8200b = l4;
        this.f8201c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f8239a.sendEmptyMessageDelayed(2, i10);
    }
}
