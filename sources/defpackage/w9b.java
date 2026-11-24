package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
public final class w9b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final o90 i;

    public w9b(o90 o90Var, int i) {
        this.i = o90Var;
        this.a = i;
    }

    public final void a() {
        Object l;
        Object obj;
        o90 o90Var = this.i;
        cdb cdbVar = (cdb) o90Var.f;
        y54 y54Var = (y54) o90Var.a;
        if (y54Var.h() == 2 && y54Var.s() && y54Var.v0() == 0) {
            aob y0 = y54Var.y0();
            if (y0.p()) {
                l = null;
            } else {
                l = y0.l(y54Var.A());
            }
            int k0 = y54Var.k0();
            int L = y54Var.L();
            long b0 = y54Var.b0();
            long max = Math.max(0L, y54Var.o() - Math.max(0L, b0 - y54Var.m()));
            if (l != null && k0 == -1) {
                b0 -= g8c.i0(y0.g(l, (xnb) o90Var.e).e);
            }
            ((adb) o90Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.g;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
                obj = l;
                if (b0 == this.e && max == this.f) {
                    if (elapsedRealtime - this.h >= i) {
                        ((t54) o90Var.c).a.t1(new j54(2, new aab(1, i), 1003));
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
            cdbVar.g(1);
            cdbVar.a.sendEmptyMessageDelayed(1, i);
            return;
        }
        if (this.g) {
            cdbVar.g(1);
        }
        this.g = false;
    }
}
