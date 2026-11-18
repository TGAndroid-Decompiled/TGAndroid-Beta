package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23666a;
    public final i7 f23667b;
    public final j7 f23668c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23666a = i7;
        this.f23667b = i7Var;
        this.f23668c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23666a) {
            case 0:
                i7 i7Var = this.f23667b;
                j7 j7Var = this.f23668c;
                if (i7Var.f24618m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24627r + " removing stream listener " + j7Var);
                    i7Var.f24618m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23667b;
                j7 j7Var2 = this.f23668c;
                if (i7Var2.f24618m == null) {
                    i7Var2.f24618m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24618m.contains(j7Var2)) {
                    i7Var2.f24618m.add(j7Var2);
                }
                if (!i7Var2.f24618m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24602f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
