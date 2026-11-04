package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;
public final class b0 {
    public long f11802a;
    public long f11803b;
    public long f11804c;
    public int d;
    public boolean f11805e;
    public int f11806f;
    public int f11807g;
    public Object h;
    public final Object f11808i;

    public b0(f0 f0Var, int i3) {
        this.f11808i = f0Var;
        this.d = i3;
    }

    public void a() {
        Object l10;
        int i3 = this.d;
        f0 f0Var = (f0) this.f11808i;
        j0 j0Var = (j0) f0Var.f11837f;
        k2.i0 i0Var = (k2.i0) f0Var.f11833a;
        if (i0Var.h() == 2 && i0Var.u() && i0Var.t0() == 0) {
            n1 y02 = i0Var.y0();
            if (y02.p()) {
                l10 = null;
            } else {
                l10 = y02.l(i0Var.B());
            }
            int k02 = i0Var.k0();
            int M = i0Var.M();
            long b02 = i0Var.b0();
            long max = Math.max(0L, i0Var.q() - Math.max(0L, b02 - i0Var.N0()));
            if (l10 != null && k02 == -1) {
                b02 -= n0.h0(y02.g(l10, (k1) f0Var.f11836e).f8164e);
            }
            ((h0) f0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f11805e && Objects.equals(l10, this.h) && k02 == this.f11806f && M == this.f11807g && b02 == this.f11802a && max == this.f11803b) {
                if (elapsedRealtime - this.f11804c >= i3) {
                    ((k2.c0) f0Var.f11835c).f16459a.A1(new k2.l(2, new g0(1, i3), 1003));
                    return;
                }
                return;
            }
            this.f11805e = true;
            this.f11804c = elapsedRealtime;
            this.h = l10;
            this.f11806f = k02;
            this.f11807g = M;
            this.f11802a = b02;
            this.f11803b = max;
            j0Var.e(1);
            j0Var.f11857a.sendEmptyMessageDelayed(1, i3);
            return;
        }
        if (this.f11805e) {
            j0Var.e(1);
        }
        this.f11805e = false;
    }

    public b0(String str, long j10, long j11, long j12, kg.l0 l0Var) {
        this.f11808i = l0Var;
        this.h = str;
        this.f11802a = j10;
        this.f11803b = j11;
        this.f11804c = j12;
    }
}
