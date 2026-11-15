package ai;

import android.util.Log;
public final class m1 implements Runnable {
    public final int f1354a;
    public final c2 f1355b;
    public final int f1356c;

    public m1(c2 c2Var, int i7, int i10) {
        this.f1354a = i10;
        this.f1355b = c2Var;
        this.f1356c = i7;
    }

    @Override
    public final void run() {
        switch (this.f1354a) {
            case 0:
                c2 c2Var = this.f1355b;
                if (!c2Var.f1153j) {
                    if ((!c2Var.f1151i || c2Var.l()) && c2Var.f1155k == this.f1356c) {
                        c2Var.t();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = this.f1355b;
                if (!c2Var2.f1153j && !c2Var2.f1151i && c2Var2.f1155k == this.f1356c) {
                    c2Var2.t();
                    return;
                }
                return;
            case 2:
                c2 c2Var3 = this.f1355b;
                int i7 = this.f1356c;
                c2Var3.f1155k = i7;
                c2Var3.f1148g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                return;
            default:
                this.f1355b.i(this.f1356c, 7);
                return;
        }
    }
}
