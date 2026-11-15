package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f25728a;
    public final w7 f25729b;
    public final String f25730c;

    public o7(w7 w7Var, String str, int i7) {
        this.f25728a = i7;
        this.f25729b = w7Var;
        this.f25730c = str;
    }

    @Override
    public final void run() {
        switch (this.f25728a) {
            case 0:
                w7 w7Var = this.f25729b;
                i7 i7Var = (i7) w7Var.f27315w.remove(this.f25730c);
                if (i7Var != null && ((ArrayList) i7Var.f24307e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f25729b;
                i7 i7Var2 = (i7) w7Var2.f27315w.remove(this.f25730c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24307e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
