package org.telegram.messenger;

import java.util.ArrayList;
public final class e7 implements Runnable {
    public final int f23768a;
    public final i7 f23769b;
    public final j7 f23770c;

    public e7(i7 i7Var, j7 j7Var, int i7) {
        this.f23768a = i7;
        this.f23769b = i7Var;
        this.f23770c = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f23768a) {
            case 0:
                i7 i7Var = this.f23769b;
                j7 j7Var = this.f23770c;
                if (i7Var.f24744m != null) {
                    a8.d("FileLoadOperation " + i7Var.f24753r + " removing stream listener " + j7Var);
                    i7Var.f24744m.remove(j7Var);
                    return;
                }
                return;
            default:
                i7 i7Var2 = this.f23769b;
                j7 j7Var2 = this.f23770c;
                if (i7Var2.f24744m == null) {
                    i7Var2.f24744m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.f24744m.contains(j7Var2)) {
                    i7Var2.f24744m.add(j7Var2);
                }
                if (!i7Var2.f24744m.isEmpty()) {
                    Utilities.d.a(i7Var2.f24728f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    return;
                }
                return;
        }
    }
}
