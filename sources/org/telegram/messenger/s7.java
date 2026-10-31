package org.telegram.messenger;

import java.util.ArrayList;
public final class s7 implements Runnable {
    public final int f17877a;
    public final b8 f17878b;
    public final String f17879c;

    public s7(b8 b8Var, String str, int i10) {
        this.f17877a = i10;
        this.f17878b = b8Var;
        this.f17879c = str;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                b8 b8Var = this.f17878b;
                m7 m7Var = (m7) b8Var.f14746w.remove(this.f17879c);
                if (m7Var != null && ((ArrayList) m7Var.f16884e1.d).remove(m7Var)) {
                    Utilities.d.c(new b7(m7Var, 7));
                    return;
                }
                return;
            default:
                b8 b8Var2 = this.f17878b;
                m7 m7Var2 = (m7) b8Var2.f14746w.remove(this.f17879c);
                if (m7Var2 != null && ((ArrayList) m7Var2.f16884e1.d).remove(m7Var2)) {
                    Utilities.d.c(new b7(m7Var2, 7));
                    return;
                }
                return;
        }
    }
}
