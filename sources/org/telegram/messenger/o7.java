package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f26136a;
    public final w7 f26137b;
    public final String f26138c;

    public o7(w7 w7Var, String str, int i7) {
        this.f26136a = i7;
        this.f26137b = w7Var;
        this.f26138c = str;
    }

    @Override
    public final void run() {
        switch (this.f26136a) {
            case 0:
                w7 w7Var = this.f26137b;
                i7 i7Var = (i7) w7Var.f27750w.remove(this.f26138c);
                if (i7Var != null && ((ArrayList) i7Var.f24725e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f26137b;
                i7 i7Var2 = (i7) w7Var2.f27750w.remove(this.f26138c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24725e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
