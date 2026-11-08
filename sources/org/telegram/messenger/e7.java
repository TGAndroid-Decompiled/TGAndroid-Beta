package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f22193a;
    public final i7 f22194b;
    public final j7 f22195c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f22193a = i7;
        this.f22194b = i7Var;
        this.f22195c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f22193a) {
            case 0:
                i7 i7Var = this.f22194b;
                j7 j7Var = this.f22195c;
                if (i7Var.f23099m != null) {
                    a8.d("FileLoadOperation " + i7Var.f23108r + " removing stream listener " + j7Var);
                    i7Var.f23099m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f22194b;
                j7 j7Var2 = this.f22195c;
                if (i7Var2.f23099m == null) {
                    i7Var2.f23099m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f23099m.contains(j7Var2)) {
                    i7Var2.f23099m.add(j7Var2);
                }
                if (!i7Var2.f23099m.isEmpty()) {
                    Utilities.d.a(i7Var2.f23083f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
