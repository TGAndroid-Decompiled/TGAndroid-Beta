package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f13734a;
    public Object f13735b;
    public int f13736c;
    public int d;
    public boolean f13737e;
    public long f13738f;
    public final e0 f13739g;

    public c0(e0 e0Var, int i7) {
        this.f13739g = e0Var;
        this.f13734a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f13739g;
        i1 i1Var = (i1) e0Var.f13747e;
        i0 i0Var = (i0) e0Var.f13748f;
        l2.f0 f0Var = (l2.f0) e0Var.f13744a;
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
            l11 -= l0.h0(i1Var.f10434e);
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
            boolean z10 = this.f13737e;
            int i7 = this.f13734a;
            if (z10 && Objects.equals(l10, this.f13735b) && n02 == this.f13736c && O == this.d) {
                if (elapsedRealtime - this.f13738f >= i7) {
                    ((l2.z) e0Var.f13746c).f19597a.A1(new l2.l(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f13737e = true;
            this.f13738f = elapsedRealtime;
            this.f13735b = l10;
            this.f13736c = n02;
            this.d = O;
            i0Var.e(3);
            i0Var.f13768a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (h && j3 != -9223372036854775807L) {
            i0Var.f13768a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - l11)) / f0Var.j().f10789a));
        }
        this.f13737e = false;
    }
}
