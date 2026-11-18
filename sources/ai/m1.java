package ai;

import android.util.Log;
public final class m1 implements Runnable {
    public final int f1343a;
    public final c2 f1344b;
    public final int f1345c;

    public m1(c2 c2Var, int i7, int i10) {
        this.f1343a = i10;
        this.f1344b = c2Var;
        this.f1345c = i7;
    }

    @Override
    public final void run() {
        switch (this.f1343a) {
            case 0:
                c2 c2Var = this.f1344b;
                if (!c2Var.f1153j) {
                    if ((!c2Var.f1151i || c2Var.l()) && c2Var.f1154k == this.f1345c) {
                        c2Var.t();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c2 c2Var2 = this.f1344b;
                if (!c2Var2.f1153j && !c2Var2.f1151i && c2Var2.f1154k == this.f1345c) {
                    c2Var2.t();
                    return;
                }
                return;
            case 2:
                c2 c2Var3 = this.f1344b;
                int i7 = this.f1345c;
                c2Var3.f1154k = i7;
                c2Var3.f1148g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                return;
            default:
                this.f1344b.i(this.f1345c, 7);
                return;
        }
    }
}
