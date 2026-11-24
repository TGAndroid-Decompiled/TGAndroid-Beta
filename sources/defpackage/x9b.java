package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class x9b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final o90 h;

    public x9b(o90 o90Var, int i) {
        this.h = o90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        o90 o90Var = this.h;
        cdb cdbVar = (cdb) o90Var.f;
        y54 y54Var = (y54) o90Var.a;
        if (!y54Var.j()) {
            if (this.f) {
                cdbVar.g(2);
            }
            this.f = false;
            return;
        }
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
            m -= g8c.i0(y0.g(l, (xnb) o90Var.e).e);
        }
        ((adb) o90Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d && m == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((t54) o90Var.c).a.t1(new j54(2, new aab(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = k0;
        this.d = L;
        this.e = m;
        cdbVar.g(2);
        cdbVar.a.sendEmptyMessageDelayed(2, i);
    }
}
