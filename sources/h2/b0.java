package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f13723a;
    public Object f13724b;
    public int f13725c;
    public int d;
    public long f13726e;
    public boolean f13727f;
    public long f13728g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f13723a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f13748f;
        l2.f0 f0Var = (l2.f0) e0Var.f13744a;
        if (!f0Var.h()) {
            if (this.f13727f) {
                i0Var.e(2);
            }
            this.f13727f = false;
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
            l11 -= l0.h0(y02.g(l10, (i1) e0Var.f13747e).f10434e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f13727f;
        int i7 = this.f13723a;
        if (z10 && Objects.equals(l10, this.f13724b) && n02 == this.f13725c && O == this.d && l11 == this.f13726e) {
            if (elapsedRealtime - this.f13728g >= i7) {
                ((l2.z) e0Var.f13746c).f19597a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f13727f = true;
        this.f13728g = elapsedRealtime;
        this.f13724b = l10;
        this.f13725c = n02;
        this.d = O;
        this.f13726e = l11;
        i0Var.e(2);
        i0Var.f13768a.sendEmptyMessageDelayed(2, i7);
    }
}
