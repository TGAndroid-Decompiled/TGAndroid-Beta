package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;
public final class b0 {
    public final int f8317a;
    public Object f8318b;
    public int f8319c;
    public int d;
    public long e;
    public boolean f8320f;
    public long f8321g;
    public final e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.f8317a = i10;
    }

    public final void a() {
        Object l4;
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f8337f;
        i2.h0 h0Var = e0Var.f8334a;
        if (!h0Var.j0()) {
            if (this.f8320f) {
                i0Var.e(2);
            }
            this.f8320f = false;
            return;
        }
        p1 y02 = h0Var.y0();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(h0Var.A());
        }
        int m0 = h0Var.m0();
        int N = h0Var.N();
        long M0 = h0Var.M0();
        if (l4 != null && m0 == -1) {
            M0 -= m0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f8320f;
        int i10 = this.f8317a;
        if (z10 && Objects.equals(l4, this.f8318b) && m0 == this.f8319c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.f8321g >= i10) {
                e0Var.f8336c.f10925a.A1(new i2.m(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f8320f = true;
        this.f8321g = elapsedRealtime;
        this.f8318b = l4;
        this.f8319c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.f8357a.sendEmptyMessageDelayed(2, i10);
    }
}
