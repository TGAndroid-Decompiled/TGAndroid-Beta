package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f26094a;
    public final w7 f26095b;
    public final String f26096c;

    public o7(w7 w7Var, String str, int i7) {
        this.f26094a = i7;
        this.f26095b = w7Var;
        this.f26096c = str;
    }

    @Override
    public final void run() {
        switch (this.f26094a) {
            case 0:
                w7 w7Var = this.f26095b;
                i7 i7Var = (i7) w7Var.f27701w.remove(this.f26096c);
                if (i7Var != null && ((ArrayList) i7Var.f24637e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f26095b;
                i7 i7Var2 = (i7) w7Var2.f27701w.remove(this.f26096c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24637e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
