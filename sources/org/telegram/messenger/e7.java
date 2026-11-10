package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f22197a;
    public final i7 f22198b;
    public final j7 f22199c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f22197a = i7;
        this.f22198b = i7Var;
        this.f22199c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f22197a) {
            case 0:
                i7 i7Var = this.f22198b;
                j7 j7Var = this.f22199c;
                if (i7Var.f23103m != null) {
                    a8.d("FileLoadOperation " + i7Var.f23112r + " removing stream listener " + j7Var);
                    i7Var.f23103m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f22198b;
                j7 j7Var2 = this.f22199c;
                if (i7Var2.f23103m == null) {
                    i7Var2.f23103m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f23103m.contains(j7Var2)) {
                    i7Var2.f23103m.add(j7Var2);
                }
                if (!i7Var2.f23103m.isEmpty()) {
                    Utilities.d.a(i7Var2.f23087f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
