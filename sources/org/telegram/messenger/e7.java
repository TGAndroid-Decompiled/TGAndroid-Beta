package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23684a;
    public final i7 f23685b;
    public final j7 f23686c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23684a = i7;
        this.f23685b = i7Var;
        this.f23686c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23684a) {
            case 0:
                i7 i7Var = this.f23685b;
                j7 j7Var = this.f23686c;
                if (i7Var.f24656m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24665r + " removing stream listener " + j7Var);
                    i7Var.f24656m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23685b;
                j7 j7Var2 = this.f23686c;
                if (i7Var2.f24656m == null) {
                    i7Var2.f24656m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24656m.contains(j7Var2)) {
                    i7Var2.f24656m.add(j7Var2);
                }
                if (!i7Var2.f24656m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24640f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
