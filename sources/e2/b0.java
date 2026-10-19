package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class b0 {
    public final int f8197a;
    public Object f8198b;
    public int f8199c;
    public int d;
    public long e;
    public boolean f8200f;
    public long f8201g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f8197a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f8217f;
        i2.i0 i0Var2 = e0Var.f8214a;
        if (!i0Var2.j0()) {
            if (this.f8200f) {
                i0Var.e(2);
            }
            this.f8200f = false;
            return;
        }
        o1 y02 = i0Var2.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(i0Var2.A());
        }
        int m0 = i0Var2.m0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 != null && m0 == -1) {
            M0 -= m0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f8200f;
        int i10 = this.f8197a;
        if (z10 && Objects.equals(l4, this.f8198b) && m0 == this.f8199c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f8201g >= i10) {
                e0Var.f8216c.f12325a.A1(new i2.n(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f8200f = true;
        this.f8201g = elapsedRealtime;
        this.f8198b = l4;
        this.f8199c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f8237a.sendEmptyMessageDelayed(2, i10);
    }
}
