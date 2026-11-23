package ai;

import android.util.Log;
public final class p1 implements Runnable {
    public final int f1419a;
    public final f2 f1420b;
    public final int f1421c;

    public p1(f2 f2Var, int i7, int i10) {
        this.f1419a = i10;
        this.f1420b = f2Var;
        this.f1421c = i7;
    }

    @Override
    public final void run() {
        switch (this.f1419a) {
            case 0:
                f2 f2Var = this.f1420b;
                if (!f2Var.f1193j) {
                    if ((!f2Var.f1191i || f2Var.m()) && f2Var.f1194k == this.f1421c) {
                        f2Var.u();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f2 f2Var2 = this.f1420b;
                if (!f2Var2.f1193j && !f2Var2.f1191i && f2Var2.f1194k == this.f1421c) {
                    f2Var2.u();
                    return;
                }
                return;
            case 2:
                f2 f2Var3 = this.f1420b;
                int i7 = this.f1421c;
                f2Var3.f1194k = i7;
                f2Var3.f1188g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                return;
            default:
                this.f1420b.j(this.f1421c, 7);
                return;
        }
    }
}
