package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f13752a;
    public Object f13753b;
    public int f13754c;
    public int d;
    public long f13755e;
    public boolean f13756f;
    public long f13757g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f13752a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f13777f;
        l2.f0 f0Var = (l2.f0) e0Var.f13773a;
        if (!f0Var.h()) {
            if (this.f13756f) {
                i0Var.e(2);
            }
            this.f13756f = false;
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
            l11 -= l0.h0(y02.g(l10, (i1) e0Var.f13776e).f10463e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f13756f;
        int i7 = this.f13752a;
        if (z10 && Objects.equals(l10, this.f13753b) && n02 == this.f13754c && O == this.d && l11 == this.f13755e) {
            if (elapsedRealtime - this.f13757g >= i7) {
                ((l2.z) e0Var.f13775c).f19625a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f13756f = true;
        this.f13757g = elapsedRealtime;
        this.f13753b = l10;
        this.f13754c = n02;
        this.d = O;
        this.f13755e = l11;
        i0Var.e(2);
        i0Var.f13797a.sendEmptyMessageDelayed(2, i7);
    }
}
