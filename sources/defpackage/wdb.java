package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class wdb {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final q90 g;

    public wdb(q90 q90Var, int i) {
        this.g = q90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        long j;
        q90 q90Var = this.g;
        xrb xrbVar = (xrb) q90Var.e;
        xgb xgbVar = (xgb) q90Var.f;
        s64 s64Var = (s64) q90Var.a;
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
            y0.g(l, xrbVar);
            k -= gcc.i0(xrbVar.e);
            j = gcc.i0(xrbVar.d);
        } else if (k0 != -1) {
            j = s64Var.getDuration();
        } else {
            j = -9223372036854775807L;
        }
        boolean i = s64Var.i();
        if (i && j != -9223372036854775807L && k >= j) {
            ((vgb) q90Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.e;
            int i2 = this.a;
            if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
                if (elapsedRealtime - this.f >= i2) {
                    ((n64) q90Var.c).a.t1(new e64(2, new ydb(3, i2), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = k0;
            this.d = L;
            xgbVar.g(3);
            xgbVar.a.sendEmptyMessageDelayed(3, i2);
            return;
        }
        xgbVar.g(3);
        if (i && j != -9223372036854775807L) {
            xgbVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j - k)) / s64Var.f().a));
        }
        this.e = false;
    }
}
