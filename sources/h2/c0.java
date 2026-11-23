package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f13729a;
    public Object f13730b;
    public int f13731c;
    public int d;
    public boolean f13732e;
    public long f13733f;
    public final e0 f13734g;

    public c0(e0 e0Var, int i7) {
        this.f13734g = e0Var;
        this.f13729a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f13734g;
        i1 i1Var = (i1) e0Var.f13742e;
        i0 i0Var = (i0) e0Var.f13743f;
        l2.g0 g0Var = (l2.g0) e0Var.f13739a;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            l10 = null;
        } else {
            l10 = z02.l(g0Var.C());
        }
        int o02 = g0Var.o0();
        int P = g0Var.P();
        long n10 = g0Var.n();
        if (l10 != null && o02 == -1) {
            z02.g(l10, i1Var);
            n10 -= l0.h0(i1Var.f10427e);
            j3 = l0.h0(i1Var.d);
        } else if (o02 != -1) {
            j3 = g0Var.getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        boolean j10 = g0Var.j();
        if (j10 && j3 != -9223372036854775807L && n10 >= j3) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13732e;
            int i7 = this.f13729a;
            if (z10 && Objects.equals(l10, this.f13730b) && o02 == this.f13731c && P == this.d) {
                if (elapsedRealtime - this.f13733f >= i7) {
                    ((l2.a0) e0Var.f13741c).f19342a.A1(new l2.m(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f13732e = true;
            this.f13733f = elapsedRealtime;
            this.f13730b = l10;
            this.f13731c = o02;
            this.d = P;
            i0Var.e(3);
            i0Var.f13763a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (j10 && j3 != -9223372036854775807L) {
            i0Var.f13763a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - n10)) / g0Var.l().f10782a));
        }
        this.f13732e = false;
    }
}
