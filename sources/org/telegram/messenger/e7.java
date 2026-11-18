package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23669a;
    public final i7 f23670b;
    public final j7 f23671c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23669a = i7;
        this.f23670b = i7Var;
        this.f23671c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23669a) {
            case 0:
                i7 i7Var = this.f23670b;
                j7 j7Var = this.f23671c;
                if (i7Var.f24621m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24630r + " removing stream listener " + j7Var);
                    i7Var.f24621m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23670b;
                j7 j7Var2 = this.f23671c;
                if (i7Var2.f24621m == null) {
                    i7Var2.f24621m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24621m.contains(j7Var2)) {
                    i7Var2.f24621m.add(j7Var2);
                }
                if (!i7Var2.f24621m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24605f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
