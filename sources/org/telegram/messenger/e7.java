package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f22169a;
    public final i7 f22170b;
    public final j7 f22171c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f22169a = i7;
        this.f22170b = i7Var;
        this.f22171c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f22169a) {
            case 0:
                i7 i7Var = this.f22170b;
                j7 j7Var = this.f22171c;
                if (i7Var.f23109m != null) {
                    a8.d("FileLoadOperation " + i7Var.f23118r + " removing stream listener " + j7Var);
                    i7Var.f23109m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f22170b;
                j7 j7Var2 = this.f22171c;
                if (i7Var2.f23109m == null) {
                    i7Var2.f23109m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f23109m.contains(j7Var2)) {
                    i7Var2.f23109m.add(j7Var2);
                }
                if (!i7Var2.f23109m.isEmpty()) {
                    Utilities.d.a(i7Var2.f23093f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
