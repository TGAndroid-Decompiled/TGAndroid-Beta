package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23694a;
    public final i7 f23695b;
    public final j7 f23696c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23694a = i7;
        this.f23695b = i7Var;
        this.f23696c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23694a) {
            case 0:
                i7 i7Var = this.f23695b;
                j7 j7Var = this.f23696c;
                if (i7Var.f24646m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24655r + " removing stream listener " + j7Var);
                    i7Var.f24646m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23695b;
                j7 j7Var2 = this.f23696c;
                if (i7Var2.f24646m == null) {
                    i7Var2.f24646m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24646m.contains(j7Var2)) {
                    i7Var2.f24646m.add(j7Var2);
                }
                if (!i7Var2.f24646m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24630f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
