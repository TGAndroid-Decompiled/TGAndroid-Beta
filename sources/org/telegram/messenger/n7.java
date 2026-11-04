package org.telegram.messenger;

import java.util.ArrayList;
public final class n7 implements Runnable {
    public final int f24328a;
    public final w7 f24329b;
    public final String f24330c;

    public n7(w7 w7Var, String str, int i3) {
        this.f24328a = i3;
        this.f24329b = w7Var;
        this.f24330c = str;
    }

    @Override
    public final void run() {
        switch (this.f24328a) {
            case 0:
                w7 w7Var = this.f24329b;
                i7 i7Var = (i7) w7Var.f26174w.remove(this.f24330c);
                if (i7Var != null && ((ArrayList) i7Var.f23473e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f24329b;
                i7 i7Var2 = (i7) w7Var2.f26174w.remove(this.f24330c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f23473e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
