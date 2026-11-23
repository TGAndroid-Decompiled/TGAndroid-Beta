package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.h51;
public final class d7 implements Runnable {
    public final int f3467a;
    public final m8 f3468b;
    public final h51[] f3469c;
    public final a70 d;

    public d7(m8 m8Var, h51[] h51VarArr, a70 a70Var, int i7) {
        this.f3467a = i7;
        this.f3468b = m8Var;
        this.f3469c = h51VarArr;
        this.d = a70Var;
    }

    @Override
    public final void run() {
        switch (this.f3467a) {
            case 0:
                a8 a8Var = this.f3468b.d;
                if (!a8Var.f3370l.isEmpty()) {
                    a8Var.f3370l.clear();
                    a8Var.m();
                    h51 h51Var = this.f3469c[0];
                    if (h51Var != null) {
                        h51Var.f35742g3.O(true);
                    }
                    this.d.f33360q0 = true;
                    return;
                }
                return;
            case 1:
                a8 a8Var2 = this.f3468b.d;
                if (!a8Var2.f3369k.isEmpty()) {
                    a8Var2.f3369k.clear();
                    a8Var2.m();
                    h51 h51Var2 = this.f3469c[0];
                    if (h51Var2 != null) {
                        h51Var2.f35742g3.O(true);
                    }
                    this.d.f33360q0 = true;
                    return;
                }
                return;
            default:
                a8 a8Var3 = this.f3468b.d;
                if (!a8Var3.f3368j.isEmpty()) {
                    a8Var3.f3368j.clear();
                    a8Var3.m();
                    h51 h51Var3 = this.f3469c[0];
                    if (h51Var3 != null) {
                        h51Var3.f35742g3.O(true);
                    }
                    this.d.f33360q0 = true;
                    return;
                }
                return;
        }
    }
}
