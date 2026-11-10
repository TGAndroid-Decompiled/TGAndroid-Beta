package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f24307a;
    public final w7 f24308b;
    public final String f24309c;

    public o7(w7 w7Var, String str, int i7) {
        this.f24307a = i7;
        this.f24308b = w7Var;
        this.f24309c = str;
    }

    @Override
    public final void run() {
        switch (this.f24307a) {
            case 0:
                w7 w7Var = this.f24308b;
                i7 i7Var = (i7) w7Var.f26275w.remove(this.f24309c);
                if (i7Var != null && ((ArrayList) i7Var.f23084e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f24308b;
                i7 i7Var2 = (i7) w7Var2.f26275w.remove(this.f24309c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f23084e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
