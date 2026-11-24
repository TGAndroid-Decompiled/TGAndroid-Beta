package defpackage;

import android.os.SystemClock;
public final class z9b {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final o90 e;

    public z9b(o90 o90Var, int i) {
        this.e = o90Var;
        this.a = i;
    }

    public final void a() {
        o90 o90Var = this.e;
        cdb cdbVar = (cdb) o90Var.f;
        y54 y54Var = (y54) o90Var.a;
        int v0 = y54Var.v0();
        if (y54Var.s() && y54Var.h() != 1 && y54Var.h() != 4 && v0 != 0 && v0 != 1) {
            ((adb) o90Var.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == v0) {
                if (elapsedRealtime - this.d >= i) {
                    ((t54) o90Var.c).a.t1(new j54(2, new aab(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = elapsedRealtime;
            this.b = v0;
            cdbVar.g(4);
            cdbVar.a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (this.c) {
            cdbVar.g(4);
        }
        this.c = false;
    }
}
