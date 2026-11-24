package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class zbb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final oa0 h;

    public zbb(oa0 oa0Var, int i) {
        this.h = oa0Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        oa0 oa0Var = this.h;
        dfb dfbVar = (dfb) oa0Var.f;
        h74 h74Var = (h74) oa0Var.a;
        if (!h74Var.i()) {
            if (this.f) {
                dfbVar.g(2);
            }
            this.f = false;
            return;
        }
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
            k -= hac.i0(y0.g(l, (ypb) oa0Var.e).e);
        }
        ((bfb) oa0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d && k == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((c74) oa0Var.c).a.t1(new u64(2, new ccb(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = k0;
        this.d = L;
        this.e = k;
        dfbVar.g(2);
        dfbVar.a.sendEmptyMessageDelayed(2, i);
    }
}
