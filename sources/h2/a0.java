package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class a0 {
    public long f14043a;
    public long f14044b;
    public long f14045c;
    public int d;
    public boolean f14046e;
    public int f14047f;
    public int f14048g;
    public Object h;
    public final Object f14049i;

    public a0(e0 e0Var, int i7) {
        this.f14049i = e0Var;
        this.d = i7;
    }

    public void a() {
        Object l10;
        int i7 = this.d;
        e0 e0Var = (e0) this.f14049i;
        i0 i0Var = (i0) e0Var.f14078f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14074a;
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
                d02 -= m0.h0(y02.g(l10, (i1) e0Var.f14077e).f10288e);
            }
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f14046e && Objects.equals(l10, this.h) && n02 == this.f14047f && O == this.f14048g && d02 == this.f14043a && max == this.f14044b) {
                if (elapsedRealtime - this.f14045c >= i7) {
                    ((l2.c0) e0Var.f14076c).f17775a.A1(new l2.l(2, new f0(1, i7), 1003));
                    return;
                }
                return;
            }
            this.f14046e = true;
            this.f14045c = elapsedRealtime;
            this.h = l10;
            this.f14047f = n02;
            this.f14048g = O;
            this.f14043a = d02;
            this.f14044b = max;
            i0Var.e(1);
            i0Var.f14098a.sendEmptyMessageDelayed(1, i7);
            return;
        }
        if (this.f14046e) {
            i0Var.e(1);
        }
        this.f14046e = false;
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.f14049i = o0Var;
        this.h = str;
        this.f14043a = j3;
        this.f14044b = j10;
        this.f14045c = j11;
    }
}
