package ai;

import android.util.Log;
public final class o1 implements Runnable {
    public final int f1367a;
    public final e2 f1368b;
    public final int f1369c;

    public o1(e2 e2Var, int i7, int i10) {
        this.f1367a = i10;
        this.f1368b = e2Var;
        this.f1369c = i7;
    }

    @Override
    public final void run() {
        switch (this.f1367a) {
            case 0:
                e2 e2Var = this.f1368b;
                if (!e2Var.f1178j) {
                    if ((!e2Var.f1176i || e2Var.l()) && e2Var.f1179k == this.f1369c) {
                        e2Var.t();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e2 e2Var2 = this.f1368b;
                if (!e2Var2.f1178j && !e2Var2.f1176i && e2Var2.f1179k == this.f1369c) {
                    e2Var2.t();
                    return;
                }
                return;
            case 2:
                e2 e2Var3 = this.f1368b;
                int i7 = this.f1369c;
                e2Var3.f1179k = i7;
                e2Var3.f1173g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                return;
            default:
                this.f1368b.i(this.f1369c, 7);
                return;
        }
    }
}
