package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;
public final class b0 {
    public final int f9632a;
    public Object f9633b;
    public int f9634c;
    public int d;
    public long e;
    public boolean f9635f;
    public long f9636g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f9632a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f9652f;
        i2.j0 j0Var = e0Var.f9649a;
        if (!j0Var.j0()) {
            if (this.f9635f) {
                i0Var.e(2);
            }
            this.f9635f = false;
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
        boolean z10 = this.f9635f;
        int i10 = this.f9632a;
        if (z10 && Objects.equals(l4, this.f9633b) && m0 == this.f9634c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f9636g >= i10) {
                e0Var.f9651c.f13509a.A1(new i2.m(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f9635f = true;
        this.f9636g = elapsedRealtime;
        this.f9633b = l4;
        this.f9634c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f9672a.sendEmptyMessageDelayed(2, i10);
    }
}
