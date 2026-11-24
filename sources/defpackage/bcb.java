package defpackage;

import android.os.SystemClock;
public final class bcb {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final oa0 e;

    public bcb(oa0 oa0Var, int i) {
        this.e = oa0Var;
        this.a = i;
    }

    public final void a() {
        oa0 oa0Var = this.e;
        dfb dfbVar = (dfb) oa0Var.f;
        h74 h74Var = (h74) oa0Var.a;
        int v0 = h74Var.v0();
        if (h74Var.s() && h74Var.h() != 1 && h74Var.h() != 4 && v0 != 0 && v0 != 1) {
            ((bfb) oa0Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == v0) {
                if (elapsedRealtime - this.d >= i) {
                    ((c74) oa0Var.c).a.t1(new u64(2, new ccb(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = elapsedRealtime;
            this.b = v0;
            dfbVar.g(4);
            dfbVar.a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (this.c) {
            dfbVar.g(4);
        }
        this.c = false;
    }
}
