package org.telegram.messenger;

import java.util.HashMap;
public final class a5 implements Runnable {
    public final int f21384a;
    public final g5 f21385b;
    public final HashMap f21386c;
    public final HashMap d;

    public a5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f21384a = i7;
        this.f21385b = g5Var;
        this.f21386c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21384a) {
            case 0:
                g5 g5Var = this.f21385b;
                Utilities.f21336e.c(new a5(g5Var, this.f21386c, this.d, 1));
                if (!g5Var.f22607e) {
                    g5Var.f22607e = true;
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f26719a.c(new dr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f21385b;
                HashMap hashMap = this.f21386c;
                HashMap hashMap2 = this.d;
                g5Var2.f22615k0 = hashMap;
                g5Var2.f22616l0 = hashMap2;
                return;
        }
    }
}
