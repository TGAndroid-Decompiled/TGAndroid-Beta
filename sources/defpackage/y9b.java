package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class y9b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final o90 g;

    public y9b(o90 o90Var, int i) {
        this.g = o90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        long j;
        o90 o90Var = this.g;
        xnb xnbVar = (xnb) o90Var.e;
        cdb cdbVar = (cdb) o90Var.f;
        y54 y54Var = (y54) o90Var.a;
        aob y0 = y54Var.y0();
        if (y0.p()) {
            l = null;
        } else {
            l = y0.l(y54Var.A());
        }
        int k0 = y54Var.k0();
        int L = y54Var.L();
        long m = y54Var.m();
        if (l != null && k0 == -1) {
            y0.g(l, xnbVar);
            m -= g8c.i0(xnbVar.e);
            j = g8c.i0(xnbVar.d);
        } else if (k0 != -1) {
            j = y54Var.getDuration();
        } else {
            j = -9223372036854775807L;
        }
        boolean j2 = y54Var.j();
        if (j2 && j != -9223372036854775807L && m >= j) {
            ((adb) o90Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.e;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
                if (elapsedRealtime - this.f >= i) {
                    ((t54) o90Var.c).a.t1(new j54(2, new aab(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = k0;
            this.d = L;
            cdbVar.g(3);
            cdbVar.a.sendEmptyMessageDelayed(3, i);
            return;
        }
        cdbVar.g(3);
        if (j2 && j != -9223372036854775807L) {
            cdbVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil(((float) (j - m)) / y54Var.g().a));
        }
        this.e = false;
    }
}
