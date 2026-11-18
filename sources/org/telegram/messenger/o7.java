package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f26040a;
    public final w7 f26041b;
    public final String f26042c;

    public o7(w7 w7Var, String str, int i7) {
        this.f26040a = i7;
        this.f26041b = w7Var;
        this.f26042c = str;
    }

    @Override
    public final void run() {
        switch (this.f26040a) {
            case 0:
                w7 w7Var = this.f26041b;
                i7 i7Var = (i7) w7Var.f27655w.remove(this.f26042c);
                if (i7Var != null && ((ArrayList) i7Var.f24599e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f26041b;
                i7 i7Var2 = (i7) w7Var2.f27655w.remove(this.f26042c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24599e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
