package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f14062a;
    public Object f14063b;
    public int f14064c;
    public int d;
    public boolean f14065e;
    public long f14066f;
    public final e0 f14067g;

    public c0(e0 e0Var, int i7) {
        this.f14067g = e0Var;
        this.f14062a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f14067g;
        i1 i1Var = (i1) e0Var.f14075e;
        i0 i0Var = (i0) e0Var.f14076f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14072a;
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
            y02.g(l10, i1Var);
            l11 -= m0.h0(i1Var.f10283e);
            j3 = m0.h0(i1Var.d);
        } else if (n02 != -1) {
            j3 = i0Var2.getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        boolean h = i0Var2.h();
        if (h && j3 != -9223372036854775807L && l11 >= j3) {
            ((g0) e0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z9 = this.f14065e;
            int i7 = this.f14062a;
            if (z9 && Objects.equals(l10, this.f14063b) && n02 == this.f14064c && O == this.d) {
                if (elapsedRealtime - this.f14066f >= i7) {
                    ((l2.c0) e0Var.f14074c).f17774a.A1(new l2.l(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f14065e = true;
            this.f14066f = elapsedRealtime;
            this.f14063b = l10;
            this.f14064c = n02;
            this.d = O;
            i0Var.e(3);
            i0Var.f14096a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (h && j3 != -9223372036854775807L) {
            i0Var.f14096a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - l11)) / i0Var2.j().f10638a));
        }
        this.f14065e = false;
    }
}
