package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f13729a;
    public Object f13730b;
    public int f13731c;
    public int d;
    public boolean f13732e;
    public long f13733f;
    public final e0 f13734g;

    public c0(e0 e0Var, int i7) {
        this.f13734g = e0Var;
        this.f13729a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f13734g;
        i1 i1Var = (i1) e0Var.f13742e;
        i0 i0Var = (i0) e0Var.f13743f;
        l2.f0 f0Var = (l2.f0) e0Var.f13739a;
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
            y02.g(l10, i1Var);
            l11 -= l0.h0(i1Var.f10429e);
            j3 = l0.h0(i1Var.d);
        } else if (n02 != -1) {
            j3 = f0Var.getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        boolean h = f0Var.h();
        if (h && j3 != -9223372036854775807L && l11 >= j3) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f13732e;
            int i7 = this.f13729a;
            if (z10 && Objects.equals(l10, this.f13730b) && n02 == this.f13731c && O == this.d) {
                if (elapsedRealtime - this.f13733f >= i7) {
                    ((l2.z) e0Var.f13741c).f19594a.A1(new l2.l(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f13732e = true;
            this.f13733f = elapsedRealtime;
            this.f13730b = l10;
            this.f13731c = n02;
            this.d = O;
            i0Var.e(3);
            i0Var.f13763a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (h && j3 != -9223372036854775807L) {
            i0Var.f13763a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - l11)) / f0Var.j().f10784a));
        }
        this.f13732e = false;
    }
}
