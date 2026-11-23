package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.h51;
public final class a7 implements Runnable {
    public final int f3412a;
    public final j8 f3413b;
    public final h51[] f3414c;
    public final a70 d;

    public a7(j8 j8Var, h51[] h51VarArr, a70 a70Var, int i7) {
        this.f3412a = i7;
        this.f3413b = j8Var;
        this.f3414c = h51VarArr;
        this.d = a70Var;
    }

    @Override
    public final void run() {
        switch (this.f3412a) {
            case 0:
                x7 x7Var = this.f3413b.d;
                if (!x7Var.f4263l.isEmpty()) {
                    x7Var.f4263l.clear();
                    x7Var.m();
                    h51 h51Var = this.f3414c[0];
                    if (h51Var != null) {
                        h51Var.f35789g3.O(true);
                    }
                    this.d.f33394q0 = true;
                    return;
                }
                return;
            case 1:
                x7 x7Var2 = this.f3413b.d;
                if (!x7Var2.f4262k.isEmpty()) {
                    x7Var2.f4262k.clear();
                    x7Var2.m();
                    h51 h51Var2 = this.f3414c[0];
                    if (h51Var2 != null) {
                        h51Var2.f35789g3.O(true);
                    }
                    this.d.f33394q0 = true;
                    return;
                }
                return;
            default:
                x7 x7Var3 = this.f3413b.d;
                if (!x7Var3.f4261j.isEmpty()) {
                    x7Var3.f4261j.clear();
                    x7Var3.m();
                    h51 h51Var3 = this.f3414c[0];
                    if (h51Var3 != null) {
                        h51Var3.f35789g3.O(true);
                    }
                    this.d.f33394q0 = true;
                    return;
                }
                return;
        }
    }
}
