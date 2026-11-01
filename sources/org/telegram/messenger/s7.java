package org.telegram.messenger;

import java.util.ArrayList;
public final class s7 implements Runnable {
    public final int f18067a;
    public final b8 f18068b;
    public final String f18069c;

    public s7(b8 b8Var, String str, int i10) {
        this.f18067a = i10;
        this.f18068b = b8Var;
        this.f18069c = str;
    }

    @Override
    public final void run() {
        switch (this.f18067a) {
            case 0:
                b8 b8Var = this.f18068b;
                m7 m7Var = (m7) b8Var.f14946w.remove(this.f18069c);
                if (m7Var != null && ((ArrayList) m7Var.f17054e1.d).remove(m7Var)) {
                    Utilities.d.c(new b7(m7Var, 7));
                    return;
                }
                return;
            default:
                b8 b8Var2 = this.f18068b;
                m7 m7Var2 = (m7) b8Var2.f14946w.remove(this.f18069c);
                if (m7Var2 != null && ((ArrayList) m7Var2.f17054e1.d).remove(m7Var2)) {
                    Utilities.d.c(new b7(m7Var2, 7));
                    return;
                }
                return;
        }
    }
}
