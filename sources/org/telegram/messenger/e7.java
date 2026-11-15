package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23269a;
    public final i7 f23270b;
    public final j7 f23271c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23269a = i7;
        this.f23270b = i7Var;
        this.f23271c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23269a) {
            case 0:
                i7 i7Var = this.f23270b;
                j7 j7Var = this.f23271c;
                if (i7Var.f24326m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24335r + " removing stream listener " + j7Var);
                    i7Var.f24326m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23270b;
                j7 j7Var2 = this.f23271c;
                if (i7Var2.f24326m == null) {
                    i7Var2.f24326m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24326m.contains(j7Var2)) {
                    i7Var2.f24326m.add(j7Var2);
                }
                if (!i7Var2.f24326m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24310f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
