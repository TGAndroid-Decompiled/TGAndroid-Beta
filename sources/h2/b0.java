package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class b0 {
    public final int f14053a;
    public Object f14054b;
    public int f14055c;
    public int d;
    public long f14056e;
    public boolean f14057f;
    public long f14058g;
    public final e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.f14053a = i7;
    }

    public final void a() {
        Object l10;
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f14078f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14074a;
        if (!i0Var2.h()) {
            if (this.f14057f) {
                i0Var.e(2);
            }
            this.f14057f = false;
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
            l11 -= m0.h0(y02.g(l10, (i1) e0Var.f14077e).f10288e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f14057f;
        int i7 = this.f14053a;
        if (z9 && Objects.equals(l10, this.f14054b) && n02 == this.f14055c && O == this.d && l11 == this.f14056e) {
            if (elapsedRealtime - this.f14058g >= i7) {
                ((l2.c0) e0Var.f14076c).f17775a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f14057f = true;
        this.f14058g = elapsedRealtime;
        this.f14054b = l10;
        this.f14055c = n02;
        this.d = O;
        this.f14056e = l11;
        i0Var.e(2);
        i0Var.f14098a.sendEmptyMessageDelayed(2, i7);
    }
}
