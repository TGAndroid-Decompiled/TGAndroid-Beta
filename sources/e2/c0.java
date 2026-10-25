package e2;

import android.os.SystemClock;
import b2.m1;
import b2.p1;
import j$.util.Objects;
public final class c0 {
    public final int f9641a;
    public Object f9642b;
    public int f9643c;
    public int d;
    public boolean e;
    public long f9644f;
    public final e0 f9645g;

    public c0(e0 e0Var, int i10) {
        this.f9645g = e0Var;
        this.f9641a = i10;
    }

    public final void a() {
        Object l4;
        long j10;
        e0 e0Var = this.f9645g;
        m1 m1Var = e0Var.e;
        i0 i0Var = e0Var.f9652f;
        i2.j0 j0Var = e0Var.f9649a;
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
            y02.g(l4, m1Var);
            M0 -= n0.h0(m1Var.e);
            j10 = n0.h0(m1Var.d);
        } else if (m0 != -1) {
            j10 = j0Var.getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        boolean j02 = j0Var.j0();
        if (j02 && j10 != -9223372036854775807L && M0 >= j10) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.e;
            int i10 = this.f9641a;
            if (z10 && Objects.equals(l4, this.f9642b) && m0 == this.f9643c && N == this.d) {
                if (elapsedRealtime - this.f9644f >= i10) {
                    e0Var.f9651c.f13509a.A1(new i2.m(2, new f0(3, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f9644f = elapsedRealtime;
            this.f9642b = l4;
            this.f9643c = m0;
            this.d = N;
            i0Var.e(3);
            i0Var.f9672a.sendEmptyMessageDelayed(3, i10);
            return;
        }
        i0Var.e(3);
        if (j02 && j10 != -9223372036854775807L) {
            i0Var.f9672a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - M0)) / j0Var.h().f3140a));
        }
        this.e = false;
    }
}
