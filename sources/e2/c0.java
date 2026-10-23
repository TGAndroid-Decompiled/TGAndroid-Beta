package e2;

import android.os.SystemClock;
import b2.l1;
import b2.o1;
import j$.util.Objects;
public final class c0 {
    public final int f8213a;
    public Object f8214b;
    public int f8215c;
    public int d;
    public boolean e;
    public long f8216f;
    public final e0 f8217g;

    public c0(e0 e0Var, int i10) {
        this.f8217g = e0Var;
        this.f8213a = i10;
    }

    public final void a() {
        Object l4;
        long j10;
        e0 e0Var = this.f8217g;
        l1 l1Var = e0Var.e;
        i0 i0Var = e0Var.f8224f;
        i2.h0 h0Var = e0Var.f8221a;
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
            y02.g(l4, l1Var);
            M0 -= m0.h0(l1Var.e);
            j10 = m0.h0(l1Var.d);
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
            int i10 = this.f8213a;
            if (z10 && Objects.equals(l4, this.f8214b) && m0 == this.f8215c && N == this.d) {
                if (elapsedRealtime - this.f8216f >= i10) {
                    e0Var.f8223c.f12353a.A1(new i2.m(2, new f0(3, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f8216f = elapsedRealtime;
            this.f8214b = l4;
            this.f8215c = m0;
            this.d = N;
            i0Var.e(3);
            i0Var.f8244a.sendEmptyMessageDelayed(3, i10);
            return;
        }
        i0Var.e(3);
        if (j02 && j10 != -9223372036854775807L) {
            i0Var.f8244a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - M0)) / h0Var.h().f4159a));
        }
        this.e = false;
    }
}
