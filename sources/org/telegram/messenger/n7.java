package org.telegram.messenger;

import java.util.ArrayList;
public final class n7 implements Runnable {
    public final int f24137a;
    public final w7 f24138b;
    public final String f24139c;

    public n7(w7 w7Var, String str, int i7) {
        this.f24137a = i7;
        this.f24138b = w7Var;
        this.f24139c = str;
    }

    @Override
    public final void run() {
        switch (this.f24137a) {
            case 0:
                w7 w7Var = this.f24138b;
                i7 i7Var = (i7) w7Var.f26260w.remove(this.f24139c);
                if (i7Var != null && ((ArrayList) i7Var.f23083e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    return;
                }
                return;
            default:
                w7 w7Var2 = this.f24138b;
                i7 i7Var2 = (i7) w7Var2.f26260w.remove(this.f24139c);
                if (i7Var2 != null && ((ArrayList) i7Var2.f23083e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    return;
                }
                return;
        }
    }
}
