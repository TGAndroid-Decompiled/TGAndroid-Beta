package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;
public final class d0 {
    public final int f11823a;
    public Object f11824b;
    public int f11825c;
    public int d;
    public boolean f11826e;
    public long f11827f;
    public final f0 f11828g;

    public d0(f0 f0Var, int i3) {
        this.f11828g = f0Var;
        this.f11823a = i3;
    }

    public final void a() {
        Object l10;
        long j10;
        f0 f0Var = this.f11828g;
        k1 k1Var = (k1) f0Var.f11836e;
        j0 j0Var = (j0) f0Var.f11837f;
        k2.i0 i0Var = (k2.i0) f0Var.f11833a;
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
            y02.g(l10, k1Var);
            N0 -= n0.h0(k1Var.f8164e);
            j10 = n0.h0(k1Var.d);
        } else if (k02 != -1) {
            j10 = i0Var.getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        boolean i02 = i0Var.i0();
        if (i02 && j10 != -9223372036854775807L && N0 >= j10) {
            ((h0) f0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f11826e;
            int i3 = this.f11823a;
            if (z10 && Objects.equals(l10, this.f11824b) && k02 == this.f11825c && M == this.d) {
                if (elapsedRealtime - this.f11827f >= i3) {
                    ((k2.c0) f0Var.f11835c).f16459a.A1(new k2.l(2, new g0(3, i3), 1003));
                    return;
                }
                return;
            }
            this.f11826e = true;
            this.f11827f = elapsedRealtime;
            this.f11824b = l10;
            this.f11825c = k02;
            this.d = M;
            j0Var.e(3);
            j0Var.f11857a.sendEmptyMessageDelayed(3, i3);
            return;
        }
        j0Var.e(3);
        if (i02 && j10 != -9223372036854775807L) {
            j0Var.f11857a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - N0)) / i0Var.g().f8517a));
        }
        this.f11826e = false;
    }
}
