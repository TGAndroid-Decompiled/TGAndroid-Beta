package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;
public final class c0 {
    public final int f14064a;
    public Object f14065b;
    public int f14066c;
    public int d;
    public boolean f14067e;
    public long f14068f;
    public final e0 f14069g;

    public c0(e0 e0Var, int i7) {
        this.f14069g = e0Var;
        this.f14064a = i7;
    }

    public final void a() {
        Object l10;
        long j3;
        e0 e0Var = this.f14069g;
        i1 i1Var = (i1) e0Var.f14077e;
        i0 i0Var = (i0) e0Var.f14078f;
        l2.i0 i0Var2 = (l2.i0) e0Var.f14074a;
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
            l11 -= m0.h0(i1Var.f10288e);
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
            boolean z9 = this.f14067e;
            int i7 = this.f14064a;
            if (z9 && Objects.equals(l10, this.f14065b) && n02 == this.f14066c && O == this.d) {
                if (elapsedRealtime - this.f14068f >= i7) {
                    ((l2.c0) e0Var.f14076c).f17775a.A1(new l2.l(2, new f0(3, i7), 1003));
                    return;
                }
                return;
            }
            this.f14067e = true;
            this.f14068f = elapsedRealtime;
            this.f14065b = l10;
            this.f14066c = n02;
            this.d = O;
            i0Var.e(3);
            i0Var.f14098a.sendEmptyMessageDelayed(3, i7);
            return;
        }
        i0Var.e(3);
        if (h && j3 != -9223372036854775807L) {
            i0Var.f14098a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j3 - l11)) / i0Var2.j().f10643a));
        }
        this.f14067e = false;
    }
}
