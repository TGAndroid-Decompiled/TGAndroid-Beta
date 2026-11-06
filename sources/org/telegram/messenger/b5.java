package org.telegram.messenger;

import java.util.HashMap;
public final class b5 implements Runnable {
    public final int f21587a;
    public final g5 f21588b;
    public final HashMap f21589c;
    public final HashMap d;

    public b5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f21587a = i7;
        this.f21588b = g5Var;
        this.f21589c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21587a) {
            case 0:
                g5 g5Var = this.f21588b;
                Utilities.f21333e.c(new b5(g5Var, this.f21589c, this.d, 1));
                if (!g5Var.f22581e) {
                    g5Var.f22581e = true;
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f26688a.c(new dr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f21588b;
                HashMap hashMap = this.f21589c;
                HashMap hashMap2 = this.d;
                g5Var2.f22589k0 = hashMap;
                g5Var2.f22590l0 = hashMap2;
                return;
        }
    }
}
