package e2;

import android.os.SystemClock;
import b2.m1;
import b2.p1;
import j$.util.Objects;
public final class c0 {
    public final int f8329a;
    public Object f8330b;
    public int f8331c;
    public int d;
    public boolean e;
    public long f8332f;
    public final e0 f8333g;

    public c0(e0 e0Var, int i10) {
        this.f8333g = e0Var;
        this.f8329a = i10;
    }

    public final void a() {
        Object l4;
        long j10;
        e0 e0Var = this.f8333g;
        m1 m1Var = e0Var.e;
        i0 i0Var = e0Var.f8340f;
        i2.h0 h0Var = e0Var.f8337a;
        p1 y02 = h0Var.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(h0Var.A());
        }
        int m0 = h0Var.m0();
        int N = h0Var.N();
        long M0 = h0Var.M0();
        if (l4 != null && m0 == -1) {
            y02.g(l4, m1Var);
            M0 -= m0.h0(m1Var.e);
            j10 = m0.h0(m1Var.d);
        } else if (m0 != -1) {
            j10 = h0Var.getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        boolean j02 = h0Var.j0();
        if (j02 && j10 != -9223372036854775807L && M0 >= j10) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.e;
            int i10 = this.f8329a;
            if (z10 && Objects.equals(l4, this.f8330b) && m0 == this.f8331c && N == this.d) {
                if (elapsedRealtime - this.f8332f >= i10) {
                    e0Var.f8339c.f10929a.A1(new i2.m(2, new f0(3, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f8332f = elapsedRealtime;
            this.f8330b = l4;
            this.f8331c = m0;
            this.d = N;
            i0Var.e(3);
            i0Var.f8360a.sendEmptyMessageDelayed(3, i10);
            return;
        }
        i0Var.e(3);
        if (j02 && j10 != -9223372036854775807L) {
            i0Var.f8360a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - M0)) / h0Var.h().f2077a));
        }
        this.e = false;
    }
}
