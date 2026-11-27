package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class udb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final q90 i;

    public udb(q90 q90Var, int i) {
        this.i = q90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        Object obj;
        q90 q90Var = this.i;
        xgb xgbVar = (xgb) q90Var.f;
        s64 s64Var = (s64) q90Var.a;
        if (s64Var.h() == 2 && s64Var.s() && s64Var.v0() == 0) {
            asb y0 = s64Var.y0();
            if (y0.p()) {
                l = null;
            } else {
                l = y0.l(s64Var.A());
            }
            int k0 = s64Var.k0();
            int L = s64Var.L();
            long b0 = s64Var.b0();
            long max = Math.max(0L, s64Var.o() - Math.max(0L, b0 - s64Var.k()));
            if (l != null && k0 == -1) {
                b0 -= gcc.i0(y0.g(l, (xrb) q90Var.e).e);
            }
            ((vgb) q90Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.g;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
                obj = l;
                if (b0 == this.e && max == this.f) {
                    if (elapsedRealtime - this.h >= i) {
                        ((n64) q90Var.c).a.t1(new e64(2, new ydb(1, i), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l;
            }
            this.g = true;
            this.h = elapsedRealtime;
            this.b = obj;
            this.c = k0;
            this.d = L;
            this.e = b0;
            this.f = max;
            xgbVar.g(1);
            xgbVar.a.sendEmptyMessageDelayed(1, i);
            return;
        }
        if (this.g) {
            xgbVar.g(1);
        }
        this.g = false;
    }
}
