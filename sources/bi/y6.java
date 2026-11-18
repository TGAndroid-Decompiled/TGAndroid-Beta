package bi;

import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.y60;
public final class y6 implements Runnable {
    public final int f4283a;
    public final h8 f4284b;
    public final e51[] f4285c;
    public final y60 d;

    public y6(h8 h8Var, e51[] e51VarArr, y60 y60Var, int i7) {
        this.f4283a = i7;
        this.f4284b = h8Var;
        this.f4285c = e51VarArr;
        this.d = y60Var;
    }

    @Override
    public final void run() {
        switch (this.f4283a) {
            case 0:
                v7 v7Var = this.f4284b.d;
                if (!v7Var.f4154l.isEmpty()) {
                    v7Var.f4154l.clear();
                    v7Var.m();
                    e51 e51Var = this.f4285c[0];
                    if (e51Var != null) {
                        e51Var.f34607g3.O(true);
                    }
                    this.d.f42372q0 = true;
                    return;
                }
                return;
            case 1:
                v7 v7Var2 = this.f4284b.d;
                if (!v7Var2.f4153k.isEmpty()) {
                    v7Var2.f4153k.clear();
                    v7Var2.m();
                    e51 e51Var2 = this.f4285c[0];
                    if (e51Var2 != null) {
                        e51Var2.f34607g3.O(true);
                    }
                    this.d.f42372q0 = true;
                    return;
                }
                return;
            default:
                v7 v7Var3 = this.f4284b.d;
                if (!v7Var3.f4152j.isEmpty()) {
                    v7Var3.f4152j.clear();
                    v7Var3.m();
                    e51 e51Var3 = this.f4285c[0];
                    if (e51Var3 != null) {
                        e51Var3.f34607g3.O(true);
                    }
                    this.d.f42372q0 = true;
                    return;
                }
                return;
        }
    }
}
