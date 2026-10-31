package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class b0 {
    public final int f6111a;
    public Object f6112b;
    public int f6113c;
    public int d;
    public long e;
    public boolean f6114f;
    public long f6115g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f6111a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f6131f;
        i2.i0 i0Var2 = e0Var.f6128a;
        if (!i0Var2.i0()) {
            if (this.f6114f) {
                i0Var.e(2);
            }
            this.f6114f = false;
            return;
        }
        o1 y02 = i0Var2.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(i0Var2.A());
        }
        int l02 = i0Var2.l0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 != null && l02 == -1) {
            M0 -= l0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f6114f;
        int i10 = this.f6111a;
        if (z10 && Objects.equals(l4, this.f6112b) && l02 == this.f6113c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f6115g >= i10) {
                e0Var.f6130c.f7821a.A1(new i2.l(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f6114f = true;
        this.f6115g = elapsedRealtime;
        this.f6112b = l4;
        this.f6113c = l02;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f6151a.sendEmptyMessageDelayed(2, i10);
    }
}
