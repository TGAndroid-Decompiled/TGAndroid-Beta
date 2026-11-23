package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class a0 {
    public long f13708a;
    public long f13709b;
    public long f13710c;
    public int d;
    public boolean f13711e;
    public int f13712f;
    public int f13713g;
    public Object h;
    public final Object f13714i;

    public a0(e0 e0Var, int i7) {
        this.f13714i = e0Var;
        this.d = i7;
    }

    public void a() {
        Object l10;
        int i7 = this.d;
        e0 e0Var = (e0) this.f13714i;
        i0 i0Var = (i0) e0Var.f13743f;
        l2.g0 g0Var = (l2.g0) e0Var.f13739a;
        if (g0Var.i() == 2 && g0Var.v() && g0Var.x0() == 0) {
            l1 z02 = g0Var.z0();
            if (z02.p()) {
                l10 = null;
            } else {
                l10 = z02.l(g0Var.C());
            }
            int o02 = g0Var.o0();
            int P = g0Var.P();
            long e02 = g0Var.e0();
            long max = Math.max(0L, g0Var.s() - Math.max(0L, e02 - g0Var.n()));
            if (l10 != null && o02 == -1) {
                e02 -= l0.h0(z02.g(l10, (i1) e0Var.f13742e).f10427e);
            }
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13711e && Objects.equals(l10, this.h) && o02 == this.f13712f && P == this.f13713g && e02 == this.f13708a && max == this.f13709b) {
                if (elapsedRealtime - this.f13710c >= i7) {
                    ((l2.a0) e0Var.f13741c).f19342a.A1(new l2.m(2, new f0(1, i7), 1003));
                    return;
                }
                return;
            }
            this.f13711e = true;
            this.f13710c = elapsedRealtime;
            this.h = l10;
            this.f13712f = o02;
            this.f13713g = P;
            this.f13708a = e02;
            this.f13709b = max;
            i0Var.e(1);
            i0Var.f13763a.sendEmptyMessageDelayed(1, i7);
            return;
        }
        if (this.f13711e) {
            i0Var.e(1);
        }
        this.f13711e = false;
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.f13714i = o0Var;
        this.h = str;
        this.f13708a = j3;
        this.f13709b = j10;
        this.f13710c = j11;
    }
}
