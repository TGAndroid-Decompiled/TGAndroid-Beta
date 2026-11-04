package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;
public final class c0 {
    public final int f11812a;
    public Object f11813b;
    public int f11814c;
    public int d;
    public long f11815e;
    public boolean f11816f;
    public long f11817g;
    public final f0 h;

    public c0(f0 f0Var, int i3) {
        this.h = f0Var;
        this.f11812a = i3;
    }

    public final void a() {
        Object l10;
        f0 f0Var = this.h;
        j0 j0Var = (j0) f0Var.f11837f;
        k2.i0 i0Var = (k2.i0) f0Var.f11833a;
        if (!i0Var.i0()) {
            if (this.f11816f) {
                j0Var.e(2);
            }
            this.f11816f = false;
            return;
        }
        n1 y02 = i0Var.y0();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(i0Var.B());
        }
        int k02 = i0Var.k0();
        int M = i0Var.M();
        long N0 = i0Var.N0();
        if (l10 != null && k02 == -1) {
            N0 -= n0.h0(y02.g(l10, (k1) f0Var.f11836e).f8164e);
        }
        ((h0) f0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f11816f;
        int i3 = this.f11812a;
        if (z10 && Objects.equals(l10, this.f11813b) && k02 == this.f11814c && M == this.d && N0 == this.f11815e) {
            if (elapsedRealtime - this.f11817g >= i3) {
                ((k2.c0) f0Var.f11835c).f16459a.A1(new k2.l(2, new g0(2, i3), 1003));
                return;
            }
            return;
        }
        this.f11816f = true;
        this.f11817g = elapsedRealtime;
        this.f11813b = l10;
        this.f11814c = k02;
        this.d = M;
        this.f11815e = N0;
        j0Var.e(2);
        j0Var.f11857a.sendEmptyMessageDelayed(2, i3);
    }
}
