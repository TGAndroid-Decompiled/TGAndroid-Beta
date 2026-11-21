package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class a0 {
    public long f13742a;
    public long f13743b;
    public long f13744c;
    public int d;
    public boolean f13745e;
    public int f13746f;
    public int f13747g;
    public Object h;
    public final Object f13748i;

    public a0(e0 e0Var, int i7) {
        this.f13748i = e0Var;
        this.d = i7;
    }

    public void a() {
        Object l10;
        int i7 = this.d;
        e0 e0Var = (e0) this.f13748i;
        i0 i0Var = (i0) e0Var.f13777f;
        l2.f0 f0Var = (l2.f0) e0Var.f13773a;
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
                d02 -= l0.h0(y02.g(l10, (i1) e0Var.f13776e).f10463e);
            }
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13745e && Objects.equals(l10, this.h) && n02 == this.f13746f && O == this.f13747g && d02 == this.f13742a && max == this.f13743b) {
                if (elapsedRealtime - this.f13744c >= i7) {
                    ((l2.z) e0Var.f13775c).f19625a.A1(new l2.l(2, new f0(1, i7), 1003));
                    return;
                }
                return;
            }
            this.f13745e = true;
            this.f13744c = elapsedRealtime;
            this.h = l10;
            this.f13746f = n02;
            this.f13747g = O;
            this.f13742a = d02;
            this.f13743b = max;
            i0Var.e(1);
            i0Var.f13797a.sendEmptyMessageDelayed(1, i7);
            return;
        }
        if (this.f13745e) {
            i0Var.e(1);
        }
        this.f13745e = false;
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.f13748i = o0Var;
        this.h = str;
        this.f13742a = j3;
        this.f13743b = j10;
        this.f13744c = j11;
    }
}
