package ai;

import android.util.Log;
public final class l1 implements Runnable {
    public final int f1345a;
    public final b2 f1346b;
    public final int f1347c;

    public l1(b2 b2Var, int i7, int i10) {
        this.f1345a = i10;
        this.f1346b = b2Var;
        this.f1347c = i7;
    }

    @Override
    public final void run() {
        switch (this.f1345a) {
            case 0:
                b2 b2Var = this.f1346b;
                if (!b2Var.f1146j) {
                    if ((!b2Var.f1144i || b2Var.l()) && b2Var.f1148k == this.f1347c) {
                        b2Var.t();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b2 b2Var2 = this.f1346b;
                if (!b2Var2.f1146j && !b2Var2.f1144i && b2Var2.f1148k == this.f1347c) {
                    b2Var2.t();
                    return;
                }
                return;
            case 2:
                b2 b2Var3 = this.f1346b;
                int i7 = this.f1347c;
                b2Var3.f1148k = i7;
                b2Var3.f1141g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                return;
            default:
                this.f1346b.i(this.f1347c, 7);
                return;
        }
    }
}
