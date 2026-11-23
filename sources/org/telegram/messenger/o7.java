package org.telegram.messenger;

import java.util.ArrayList;
public final class o7 implements Runnable {
    public final int f26058a;
    public final w7 f26059b;
    public final String f26060c;

    public o7(w7 w7Var, String str, int i7) {
        this.f26058a = i7;
        this.f26059b = w7Var;
        this.f26060c = str;
    }

    @Override
    public final void run() {
        switch (this.f26058a) {
            case 0:
                w7 w7Var = this.f26059b;
                i7 i7Var = (i7) w7Var.f27665w.remove(this.f26060c);
                if (i7Var != null && ((ArrayList) i7Var.f24601e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f26059b;
                i7 i7Var2 = (i7) w7Var2.f27665w.remove(this.f26060c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f24601e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
