package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f13726a;
    public Object f13727b;
    public int f13728c;
    public int d;
    public long f13729e;
    public boolean f13730f;
    public long f13731g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f13726a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f13751f;
        l2.f0 f0Var = (l2.f0) e0Var.f13747a;
        if (!f0Var.h()) {
            if (this.f13730f) {
                i0Var.e(2);
            }
            this.f13730f = false;
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
            l11 -= l0.h0(y02.g(l10, (i1) e0Var.f13750e).f10437e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f13730f;
        int i7 = this.f13726a;
        if (z10 && Objects.equals(l10, this.f13727b) && n02 == this.f13728c && O == this.d && l11 == this.f13729e) {
            if (elapsedRealtime - this.f13731g >= i7) {
                ((l2.z) e0Var.f13749c).f19600a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f13730f = true;
        this.f13731g = elapsedRealtime;
        this.f13727b = l10;
        this.f13728c = n02;
        this.d = O;
        this.f13729e = l11;
        i0Var.e(2);
        i0Var.f13771a.sendEmptyMessageDelayed(2, i7);
    }
}
