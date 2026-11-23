package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f13718a;
    public Object f13719b;
    public int f13720c;
    public int d;
    public long f13721e;
    public boolean f13722f;
    public long f13723g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f13718a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f13743f;
        l2.g0 g0Var = (l2.g0) e0Var.f13739a;
        if (!g0Var.j()) {
            if (this.f13722f) {
                i0Var.e(2);
            }
            this.f13722f = false;
            return;
        }
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
            n10 -= l0.h0(z02.g(l10, (i1) e0Var.f13742e).f10427e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f13722f;
        int i7 = this.f13718a;
        if (z10 && Objects.equals(l10, this.f13719b) && o02 == this.f13720c && P == this.d && n10 == this.f13721e) {
            if (elapsedRealtime - this.f13723g >= i7) {
                ((l2.a0) e0Var.f13741c).f19342a.A1(new l2.m(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f13722f = true;
        this.f13723g = elapsedRealtime;
        this.f13719b = l10;
        this.f13720c = o02;
        this.d = P;
        this.f13721e = n10;
        i0Var.e(2);
        i0Var.f13763a.sendEmptyMessageDelayed(2, i7);
    }
}
