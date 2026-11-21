package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.h51;
public final class b7 implements Runnable {
    public final int f3439a;
    public final k8 f3440b;
    public final h51[] f3441c;
    public final a70 d;

    public b7(k8 k8Var, h51[] h51VarArr, a70 a70Var, int i7) {
        this.f3439a = i7;
        this.f3440b = k8Var;
        this.f3441c = h51VarArr;
        this.d = a70Var;
    }

    @Override
    public final void run() {
        switch (this.f3439a) {
            case 0:
                y7 y7Var = this.f3440b.d;
                if (!y7Var.f4302l.isEmpty()) {
                    y7Var.f4302l.clear();
                    y7Var.m();
                    h51 h51Var = this.f3441c[0];
                    if (h51Var != null) {
                        h51Var.f35796g3.O(true);
                    }
                    this.d.f33381q0 = true;
                    return;
                }
                return;
            case 1:
                y7 y7Var2 = this.f3440b.d;
                if (!y7Var2.f4301k.isEmpty()) {
                    y7Var2.f4301k.clear();
                    y7Var2.m();
                    h51 h51Var2 = this.f3441c[0];
                    if (h51Var2 != null) {
                        h51Var2.f35796g3.O(true);
                    }
                    this.d.f33381q0 = true;
                    return;
                }
                return;
            default:
                y7 y7Var3 = this.f3440b.d;
                if (!y7Var3.f4300j.isEmpty()) {
                    y7Var3.f4300j.clear();
                    y7Var3.m();
                    h51 h51Var3 = this.f3441c[0];
                    if (h51Var3 != null) {
                        h51Var3.f35796g3.O(true);
                    }
                    this.d.f33381q0 = true;
                    return;
                }
                return;
        }
    }
}
