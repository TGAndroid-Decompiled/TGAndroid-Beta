package e2;

import android.os.SystemClock;
import b2.l1;
import b2.o1;
import j$.util.Objects;
public final class c0 {
    public final int f8208a;
    public Object f8209b;
    public int f8210c;
    public int d;
    public boolean e;
    public long f8211f;
    public final e0 f8212g;

    public c0(e0 e0Var, int i10) {
        this.f8212g = e0Var;
        this.f8208a = i10;
    }

    public final void a() {
        Object l4;
        long j10;
        e0 e0Var = this.f8212g;
        l1 l1Var = e0Var.e;
        i0 i0Var = e0Var.f8219f;
        i2.i0 i0Var2 = e0Var.f8216a;
        o1 y02 = i0Var2.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(i0Var2.A());
        }
        int m0 = i0Var2.m0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 != null && m0 == -1) {
            y02.g(l4, l1Var);
            M0 -= m0.h0(l1Var.e);
            j10 = m0.h0(l1Var.d);
        } else if (m0 != -1) {
            j10 = i0Var2.getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        boolean j02 = i0Var2.j0();
        if (j02 && j10 != -9223372036854775807L && M0 >= j10) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.e;
            int i10 = this.f8208a;
            if (z10 && Objects.equals(l4, this.f8209b) && m0 == this.f8210c && N == this.d) {
                if (elapsedRealtime - this.f8211f >= i10) {
                    e0Var.f8218c.f12327a.A1(new i2.n(2, new f0(3, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f8211f = elapsedRealtime;
            this.f8209b = l4;
            this.f8210c = m0;
            this.d = N;
            i0Var.e(3);
            i0Var.f8239a.sendEmptyMessageDelayed(3, i10);
            return;
        }
        i0Var.e(3);
        if (j02 && j10 != -9223372036854775807L) {
            i0Var.f8239a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - M0)) / i0Var2.h().f4154a));
        }
        this.e = false;
    }
}
