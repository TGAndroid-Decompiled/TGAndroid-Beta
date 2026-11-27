package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class vdb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final q90 h;

    public vdb(q90 q90Var, int i) {
        this.h = q90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        q90 q90Var = this.h;
        xgb xgbVar = (xgb) q90Var.f;
        s64 s64Var = (s64) q90Var.a;
        if (!s64Var.i()) {
            if (this.f) {
                xgbVar.g(2);
            }
            this.f = false;
            return;
        }
        asb y0 = s64Var.y0();
        if (y0.p()) {
            l = null;
        } else {
            l = y0.l(s64Var.A());
        }
        int k0 = s64Var.k0();
        int L = s64Var.L();
        long k = s64Var.k();
        if (l != null && k0 == -1) {
            k -= gcc.i0(y0.g(l, (xrb) q90Var.e).e);
        }
        ((vgb) q90Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d && k == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((n64) q90Var.c).a.t1(new e64(2, new ydb(2, i), 1003));
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
        xgbVar.g(2);
        xgbVar.a.sendEmptyMessageDelayed(2, i);
    }
}
