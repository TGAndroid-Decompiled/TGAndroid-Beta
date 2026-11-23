package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23648a;
    public final i7 f23649b;
    public final j7 f23650c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23648a = i7;
        this.f23649b = i7Var;
        this.f23650c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23648a) {
            case 0:
                i7 i7Var = this.f23649b;
                j7 j7Var = this.f23650c;
                if (i7Var.f24620m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24629r + " removing stream listener " + j7Var);
                    i7Var.f24620m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23649b;
                j7 j7Var2 = this.f23650c;
                if (i7Var2.f24620m == null) {
                    i7Var2.f24620m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24620m.contains(j7Var2)) {
                    i7Var2.f24620m.add(j7Var2);
                }
                if (!i7Var2.f24620m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24604f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
