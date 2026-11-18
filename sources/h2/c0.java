package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f13737a;
    public Object f13738b;
    public int f13739c;
    public int d;
    public boolean f13740e;
    public long f13741f;
    public final e0 f13742g;

    public c0(e0 e0Var, int i7) {
        this.f13742g = e0Var;
        this.f13737a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f13742g;
        i1 i1Var = (i1) e0Var.f13750e;
        i0 i0Var = (i0) e0Var.f13751f;
        l2.f0 f0Var = (l2.f0) e0Var.f13747a;
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
            l11 -= l0.h0(i1Var.f10437e);
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
            boolean z10 = this.f13740e;
            int i7 = this.f13737a;
            if (z10 && Objects.equals(l10, this.f13738b) && n02 == this.f13739c && O == this.d) {
                if (elapsedRealtime - this.f13741f >= i7) {
                    ((l2.z) e0Var.f13749c).f19600a.A1(new l2.l(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f13740e = true;
            this.f13741f = elapsedRealtime;
            this.f13738b = l10;
            this.f13739c = n02;
            this.d = O;
            i0Var.e(3);
            i0Var.f13771a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (h && j3 != -9223372036854775807L) {
            i0Var.f13771a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - l11)) / f0Var.j().f10792a));
        }
        this.f13740e = false;
    }
}
