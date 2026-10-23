package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class b0 {
    public final int f8204a;
    public Object f8205b;
    public int f8206c;
    public int d;
    public long e;
    public boolean f8207f;
    public long f8208g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f8204a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f8224f;
        i2.h0 h0Var = e0Var.f8221a;
        if (!h0Var.j0()) {
            if (this.f8207f) {
                i0Var.e(2);
            }
            this.f8207f = false;
            return;
        }
        o1 y02 = h0Var.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(h0Var.A());
        }
        int m0 = h0Var.m0();
        int N = h0Var.N();
        long M0 = h0Var.M0();
        if (l4 != null && m0 == -1) {
            M0 -= m0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f8207f;
        int i10 = this.f8204a;
        if (z10 && Objects.equals(l4, this.f8205b) && m0 == this.f8206c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f8208g >= i10) {
                e0Var.f8223c.f12353a.A1(new i2.m(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f8207f = true;
        this.f8208g = elapsedRealtime;
        this.f8205b = l4;
        this.f8206c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f8244a.sendEmptyMessageDelayed(2, i10);
    }
}
