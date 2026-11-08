package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f14051a;
    public Object f14052b;
    public int f14053c;
    public int d;
    public long f14054e;
    public boolean f14055f;
    public long f14056g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f14051a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f14076f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14072a;
        if (!i0Var2.h()) {
            if (this.f14055f) {
                i0Var.e(2);
            }
            this.f14055f = false;
            return;
        }
        l1 y02 = i0Var2.y0();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(i0Var2.B());
        }
        int n02 = i0Var2.n0();
        int O = i0Var2.O();
        long l11 = i0Var2.l();
        if (l10 != null && n02 == -1) {
            l11 -= m0.h0(y02.g(l10, (i1) e0Var.f14075e).f10283e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f14055f;
        int i7 = this.f14051a;
        if (z9 && Objects.equals(l10, this.f14052b) && n02 == this.f14053c && O == this.d && l11 == this.f14054e) {
            if (elapsedRealtime - this.f14056g >= i7) {
                ((l2.c0) e0Var.f14074c).f17774a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f14055f = true;
        this.f14056g = elapsedRealtime;
        this.f14052b = l10;
        this.f14053c = n02;
        this.d = O;
        this.f14054e = l11;
        i0Var.e(2);
        i0Var.f14096a.sendEmptyMessageDelayed(2, i7);
    }
}
