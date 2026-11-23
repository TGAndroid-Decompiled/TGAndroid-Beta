package bi;

import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.x60;
public final class d7 implements Runnable {
    public final int f3467a;
    public final m8 f3468b;
    public final g51[] f3469c;
    public final x60 d;

    public d7(m8 m8Var, g51[] g51VarArr, x60 x60Var, int i7) {
        this.f3467a = i7;
        this.f3468b = m8Var;
        this.f3469c = g51VarArr;
        this.d = x60Var;
    }

    @Override
    public final void run() {
        switch (this.f3467a) {
            case 0:
                a8 a8Var = this.f3468b.d;
                if (!a8Var.f3370l.isEmpty()) {
                    a8Var.f3370l.clear();
                    a8Var.m();
                    g51 g51Var = this.f3469c[0];
                    if (g51Var != null) {
                        g51Var.f35323g3.O(true);
                    }
                    this.d.f41889q0 = true;
                    return;
                }
                return;
            case 1:
                a8 a8Var2 = this.f3468b.d;
                if (!a8Var2.f3369k.isEmpty()) {
                    a8Var2.f3369k.clear();
                    a8Var2.m();
                    g51 g51Var2 = this.f3469c[0];
                    if (g51Var2 != null) {
                        g51Var2.f35323g3.O(true);
                    }
                    this.d.f41889q0 = true;
                    return;
                }
                return;
            default:
                a8 a8Var3 = this.f3468b.d;
                if (!a8Var3.f3368j.isEmpty()) {
                    a8Var3.f3368j.clear();
                    a8Var3.m();
                    g51 g51Var3 = this.f3469c[0];
                    if (g51Var3 != null) {
                        g51Var3.f35323g3.O(true);
                    }
                    this.d.f41889q0 = true;
                    return;
                }
                return;
        }
    }
}
