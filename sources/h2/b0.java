package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f13755a;
    public Object f13756b;
    public int f13757c;
    public int d;
    public long f13758e;
    public boolean f13759f;
    public long f13760g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f13755a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f13780f;
        l2.f0 f0Var = (l2.f0) e0Var.f13776a;
        if (!f0Var.h()) {
            if (this.f13759f) {
                i0Var.e(2);
            }
            this.f13759f = false;
            return;
        }
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(f0Var.B());
        }
        int n02 = f0Var.n0();
        int O = f0Var.O();
        long l11 = f0Var.l();
        if (l10 != null && n02 == -1) {
            l11 -= l0.h0(y02.g(l10, (i1) e0Var.f13779e).f10466e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f13759f;
        int i7 = this.f13755a;
        if (z10 && Objects.equals(l10, this.f13756b) && n02 == this.f13757c && O == this.d && l11 == this.f13758e) {
            if (elapsedRealtime - this.f13760g >= i7) {
                ((l2.z) e0Var.f13778c).f19628a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f13759f = true;
        this.f13760g = elapsedRealtime;
        this.f13756b = l10;
        this.f13757c = n02;
        this.d = O;
        this.f13758e = l11;
        i0Var.e(2);
        i0Var.f13800a.sendEmptyMessageDelayed(2, i7);
    }
}
