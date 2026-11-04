package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f22321a;
    public final i7 f22322b;
    public final j7 f22323c;

    public e7(i7 i7Var, j7 j7Var, int i3) {
        this.f22321a = i3;
        this.f22322b = i7Var;
        this.f22323c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f22321a) {
            case 0:
                i7 i7Var = this.f22322b;
                j7 j7Var = this.f22323c;
                if (i7Var.f23492m != null) {
                    a8.d("FileLoadOperation " + i7Var.f23501r + " removing stream listener " + j7Var);
                    i7Var.f23492m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f22322b;
                j7 j7Var2 = this.f22323c;
                if (i7Var2.f23492m == null) {
                    i7Var2.f23492m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f23492m.contains(j7Var2)) {
                    i7Var2.f23492m.add(j7Var2);
                }
                if (!i7Var2.f23492m.isEmpty()) {
                    Utilities.d.a(i7Var2.f23476f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
