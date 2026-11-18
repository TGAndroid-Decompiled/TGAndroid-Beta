package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class a0 {
    public long f13716a;
    public long f13717b;
    public long f13718c;
    public int d;
    public boolean f13719e;
    public int f13720f;
    public int f13721g;
    public Object h;
    public final Object f13722i;

    public a0(e0 e0Var, int i7) {
        this.f13722i = e0Var;
        this.d = i7;
    }

    public void a() {
        Object l10;
        int i7 = this.d;
        e0 e0Var = (e0) this.f13722i;
        i0 i0Var = (i0) e0Var.f13751f;
        l2.f0 f0Var = (l2.f0) e0Var.f13747a;
        if (f0Var.i() == 2 && f0Var.u() && f0Var.w0() == 0) {
            l1 y02 = f0Var.y0();
            if (y02.p()) {
                l10 = null;
            } else {
                l10 = y02.l(f0Var.B());
            }
            int n02 = f0Var.n0();
            int O = f0Var.O();
            long d02 = f0Var.d0();
            long max = Math.max(0L, f0Var.r() - Math.max(0L, d02 - f0Var.l()));
            if (l10 != null && n02 == -1) {
                d02 -= l0.h0(y02.g(l10, (i1) e0Var.f13750e).f10437e);
            }
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13719e && Objects.equals(l10, this.h) && n02 == this.f13720f && O == this.f13721g && d02 == this.f13716a && max == this.f13717b) {
                if (elapsedRealtime - this.f13718c >= i7) {
                    ((l2.z) e0Var.f13749c).f19600a.A1(new l2.l(2, new f0(1, i7), 1003));
                    return;
                }
                return;
            }
            this.f13719e = true;
            this.f13718c = elapsedRealtime;
            this.h = l10;
            this.f13720f = n02;
            this.f13721g = O;
            this.f13716a = d02;
            this.f13717b = max;
            i0Var.e(1);
            i0Var.f13771a.sendEmptyMessageDelayed(1, i7);
            return;
        }
        if (this.f13719e) {
            i0Var.e(1);
        }
        this.f13719e = false;
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.f13722i = o0Var;
        this.h = str;
        this.f13716a = j3;
        this.f13717b = j10;
        this.f13718c = j11;
    }
}
