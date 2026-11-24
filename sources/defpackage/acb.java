package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class acb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final oa0 g;

    public acb(oa0 oa0Var, int i) {
        this.g = oa0Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        long j;
        oa0 oa0Var = this.g;
        ypb ypbVar = (ypb) oa0Var.e;
        dfb dfbVar = (dfb) oa0Var.f;
        h74 h74Var = (h74) oa0Var.a;
        bqb y0 = h74Var.y0();
        if (y0.p()) {
            l = null;
        } else {
            l = y0.l(h74Var.A());
        }
        int k0 = h74Var.k0();
        int L = h74Var.L();
        long k = h74Var.k();
        if (l != null && k0 == -1) {
            y0.g(l, ypbVar);
            k -= hac.i0(ypbVar.e);
            j = hac.i0(ypbVar.d);
        } else if (k0 != -1) {
            j = h74Var.getDuration();
        } else {
            j = -9223372036854775807L;
        }
        boolean i = h74Var.i();
        if (i && j != -9223372036854775807L && k >= j) {
            ((bfb) oa0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.e;
            int i2 = this.a;
            if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
                if (elapsedRealtime - this.f >= i2) {
                    ((c74) oa0Var.c).a.t1(new u64(2, new ccb(3, i2), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = k0;
            this.d = L;
            dfbVar.g(3);
            dfbVar.a.sendEmptyMessageDelayed(3, i2);
            return;
        }
        dfbVar.g(3);
        if (i && j != -9223372036854775807L) {
            dfbVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j - k)) / h74Var.g().a));
        }
        this.e = false;
    }
}
