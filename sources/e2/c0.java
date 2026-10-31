package e2;

import android.os.SystemClock;
import b2.l1;
import b2.o1;
import j$.util.Objects;
public final class c0 {
    public final int f6120a;
    public Object f6121b;
    public int f6122c;
    public int d;
    public boolean e;
    public long f6123f;
    public final e0 f6124g;

    public c0(e0 e0Var, int i10) {
        this.f6124g = e0Var;
        this.f6120a = i10;
    }

    public final void a() {
        Object l4;
        long j10;
        e0 e0Var = this.f6124g;
        l1 l1Var = e0Var.e;
        i0 i0Var = e0Var.f6131f;
        i2.i0 i0Var2 = e0Var.f6128a;
        o1 y02 = i0Var2.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(i0Var2.A());
        }
        int l02 = i0Var2.l0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 != null && l02 == -1) {
            y02.g(l4, l1Var);
            M0 -= l0.h0(l1Var.e);
            j10 = l0.h0(l1Var.d);
        } else if (l02 != -1) {
            j10 = i0Var2.getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        boolean i02 = i0Var2.i0();
        if (i02 && j10 != -9223372036854775807L && M0 >= j10) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.e;
            int i10 = this.f6120a;
            if (z10 && Objects.equals(l4, this.f6121b) && l02 == this.f6122c && N == this.d) {
                if (elapsedRealtime - this.f6123f >= i10) {
                    e0Var.f6130c.f7821a.A1(new i2.l(2, new f0(3, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f6123f = elapsedRealtime;
            this.f6121b = l4;
            this.f6122c = l02;
            this.d = N;
            i0Var.e(3);
            i0Var.f6151a.sendEmptyMessageDelayed(3, i10);
            return;
        }
        i0Var.e(3);
        if (i02 && j10 != -9223372036854775807L) {
            i0Var.f6151a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j10 - M0)) / i0Var2.g().f2443a));
        }
        this.e = false;
    }
}
