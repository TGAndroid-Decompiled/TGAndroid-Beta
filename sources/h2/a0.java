package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class a0 {
    public long f14041a;
    public long f14042b;
    public long f14043c;
    public int d;
    public boolean f14044e;
    public int f14045f;
    public int f14046g;
    public Object h;
    public final Object f14047i;

    public a0(e0 e0Var, int i7) {
        this.f14047i = e0Var;
        this.d = i7;
    }

    public void a() {
        Object l10;
        int i7 = this.d;
        e0 e0Var = (e0) this.f14047i;
        i0 i0Var = (i0) e0Var.f14076f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14072a;
        if (i0Var2.i() == 2 && i0Var2.u() && i0Var2.w0() == 0) {
            l1 y02 = i0Var2.y0();
            if (y02.p()) {
                l10 = null;
            } else {
                l10 = y02.l(i0Var2.B());
            }
            int n02 = i0Var2.n0();
            int O = i0Var2.O();
            long d02 = i0Var2.d0();
            long max = Math.max(0L, i0Var2.r() - Math.max(0L, d02 - i0Var2.l()));
            if (l10 != null && n02 == -1) {
                d02 -= m0.h0(y02.g(l10, (i1) e0Var.f14075e).f10283e);
            }
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f14044e && Objects.equals(l10, this.h) && n02 == this.f14045f && O == this.f14046g && d02 == this.f14041a && max == this.f14042b) {
                if (elapsedRealtime - this.f14043c >= i7) {
                    ((l2.c0) e0Var.f14074c).f17774a.A1(new l2.l(2, new f0(1, i7), 1003));
                    return;
                }
                return;
            }
            this.f14044e = true;
            this.f14043c = elapsedRealtime;
            this.h = l10;
            this.f14045f = n02;
            this.f14046g = O;
            this.f14041a = d02;
            this.f14042b = max;
            i0Var.e(1);
            i0Var.f14096a.sendEmptyMessageDelayed(1, i7);
            return;
        }
        if (this.f14044e) {
            i0Var.e(1);
        }
        this.f14044e = false;
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.f14047i = o0Var;
        this.h = str;
        this.f14041a = j3;
        this.f14042b = j10;
        this.f14043c = j11;
    }
}
