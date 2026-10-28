package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;
public final class b0 {
    public final int f9631a;
    public Object f9632b;
    public int f9633c;
    public int d;
    public long e;
    public boolean f9634f;
    public long f9635g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f9631a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f9651f;
        i2.j0 j0Var = e0Var.f9648a;
        if (!j0Var.j0()) {
            if (this.f9634f) {
                i0Var.e(2);
            }
            this.f9634f = false;
            return;
        }
        p1 y02 = j0Var.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(j0Var.A());
        }
        int m0 = j0Var.m0();
        int N = j0Var.N();
        long M0 = j0Var.M0();
        if (l4 != null && m0 == -1) {
            M0 -= n0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f9634f;
        int i10 = this.f9631a;
        if (z10 && Objects.equals(l4, this.f9632b) && m0 == this.f9633c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f9635g >= i10) {
                e0Var.f9650c.f13508a.A1(new i2.m(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f9634f = true;
        this.f9635g = elapsedRealtime;
        this.f9632b = l4;
        this.f9633c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f9671a.sendEmptyMessageDelayed(2, i10);
    }
}
