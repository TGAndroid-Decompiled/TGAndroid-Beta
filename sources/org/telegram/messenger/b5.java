package org.telegram.messenger;

import java.util.HashMap;
public final class b5 implements Runnable {
    public final int f21588a;
    public final g5 f21589b;
    public final HashMap f21590c;
    public final HashMap d;

    public b5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f21588a = i7;
        this.f21589b = g5Var;
        this.f21590c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21588a) {
            case 0:
                g5 g5Var = this.f21589b;
                Utilities.f21333e.c(new b5(g5Var, this.f21590c, this.d, 1));
                if (!g5Var.f22588e) {
                    g5Var.f22588e = true;
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f26696a.c(new dr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f21589b;
                HashMap hashMap = this.f21590c;
                HashMap hashMap2 = this.d;
                g5Var2.f22596k0 = hashMap;
                g5Var2.f22597l0 = hashMap2;
                return;
        }
    }
}
