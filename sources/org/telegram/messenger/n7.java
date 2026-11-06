package org.telegram.messenger;

import java.util.ArrayList;
public final class n7 implements Runnable {
    public final int f24144a;
    public final w7 f24145b;
    public final String f24146c;

    public n7(w7 w7Var, String str, int i7) {
        this.f24144a = i7;
        this.f24145b = w7Var;
        this.f24146c = str;
    }

    @Override
    public final void run() {
        switch (this.f24144a) {
            case 0:
                w7 w7Var = this.f24145b;
                i7 i7Var = (i7) w7Var.f26268w.remove(this.f24146c);
                if (i7Var != null && ((ArrayList) i7Var.f23090e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f24145b;
                i7 i7Var2 = (i7) w7Var2.f26268w.remove(this.f24146c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f23090e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
