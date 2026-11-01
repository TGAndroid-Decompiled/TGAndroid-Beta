package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;
public final class a0 {
    public long f6102a;
    public long f6103b;
    public long f6104c;
    public int d;
    public boolean e;
    public int f6105f;
    public int f6106g;
    public Object h;
    public final Object f6107i;

    public a0(e0 e0Var, int i10) {
        this.f6107i = e0Var;
        this.d = i10;
    }

    public void a() {
        Object l4;
        int i10 = this.d;
        e0 e0Var = (e0) this.f6107i;
        i0 i0Var = e0Var.f6131f;
        i2.i0 i0Var2 = e0Var.f6128a;
        if (i0Var2.h() == 2 && i0Var2.t() && i0Var2.w0() == 0) {
            o1 y02 = i0Var2.y0();
            if (y02.p()) {
                l4 = null;
            } else {
                l4 = y02.l(i0Var2.A());
            }
            int l02 = i0Var2.l0();
            int N = i0Var2.N();
            long c02 = i0Var2.c0();
            long max = Math.max(0L, i0Var2.q() - Math.max(0L, c02 - i0Var2.M0()));
            if (l4 != null && l02 == -1) {
                c02 -= l0.h0(y02.g(l4, e0Var.e).e);
            }
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.e && Objects.equals(l4, this.h) && l02 == this.f6105f && N == this.f6106g && c02 == this.f6102a && max == this.f6103b) {
                if (elapsedRealtime - this.f6104c >= i10) {
                    e0Var.f6130c.f7822a.A1(new i2.l(2, new f0(1, i10), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f6104c = elapsedRealtime;
            this.h = l4;
            this.f6105f = l02;
            this.f6106g = N;
            this.f6102a = c02;
            this.f6103b = max;
            i0Var.e(1);
            i0Var.f6151a.sendEmptyMessageDelayed(1, i10);
            return;
        }
        if (this.e) {
            i0Var.e(1);
        }
        this.e = false;
    }

    public a0(String str, long j10, long j11, long j12, zf.e0 e0Var) {
        this.f6107i = e0Var;
        this.h = str;
        this.f6102a = j10;
        this.f6103b = j11;
        this.f6104c = j12;
    }
}
