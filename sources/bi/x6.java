package bi;

import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.y60;
public final class x6 implements Runnable {
    public final int f4185a;
    public final g8 f4186b;
    public final e51[] f4187c;
    public final y60 d;

    public x6(g8 g8Var, e51[] e51VarArr, y60 y60Var, int i7) {
        this.f4185a = i7;
        this.f4186b = g8Var;
        this.f4187c = e51VarArr;
        this.d = y60Var;
    }

    @Override
    public final void run() {
        switch (this.f4185a) {
            case 0:
                u7 u7Var = this.f4186b.d;
                if (!u7Var.f4096l.isEmpty()) {
                    u7Var.f4096l.clear();
                    u7Var.m();
                    e51 e51Var = this.f4187c[0];
                    if (e51Var != null) {
                        e51Var.f34607g3.O(true);
                    }
                    this.d.f42372q0 = true;
                    return;
                }
                return;
            case 1:
                u7 u7Var2 = this.f4186b.d;
                if (!u7Var2.f4095k.isEmpty()) {
                    u7Var2.f4095k.clear();
                    u7Var2.m();
                    e51 e51Var2 = this.f4187c[0];
                    if (e51Var2 != null) {
                        e51Var2.f34607g3.O(true);
                    }
                    this.d.f42372q0 = true;
                    return;
                }
                return;
            default:
                u7 u7Var3 = this.f4186b.d;
                if (!u7Var3.f4094j.isEmpty()) {
                    u7Var3.f4094j.clear();
                    u7Var3.m();
                    e51 e51Var3 = this.f4187c[0];
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
