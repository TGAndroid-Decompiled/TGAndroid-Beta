package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f26068a;
    public final w7 f26069b;
    public final String f26070c;

    public o7(w7 w7Var, String str, int i7) {
        this.f26068a = i7;
        this.f26069b = w7Var;
        this.f26070c = str;
    }

    @Override
    public final void run() {
        switch (this.f26068a) {
            case 0:
                w7 w7Var = this.f26069b;
                i7 i7Var = (i7) w7Var.f27683w.remove(this.f26070c);
                if (i7Var != null && ((ArrayList) i7Var.f24627e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f26069b;
                i7 i7Var2 = (i7) w7Var2.f27683w.remove(this.f26070c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24627e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
