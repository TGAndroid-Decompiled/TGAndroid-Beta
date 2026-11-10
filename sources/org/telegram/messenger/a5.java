package org.telegram.messenger;

import java.util.HashMap;
public final class a5 implements Runnable {
    public final int f21389a;
    public final g5 f21390b;
    public final HashMap f21391c;
    public final HashMap d;

    public a5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f21389a = i7;
        this.f21390b = g5Var;
        this.f21391c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21389a) {
            case 0:
                g5 g5Var = this.f21390b;
                Utilities.f21341e.c(new a5(g5Var, this.f21391c, this.d, 1));
                if (!g5Var.f22611e) {
                    g5Var.f22611e = true;
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f26723a.c(new dr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f21390b;
                HashMap hashMap = this.f21391c;
                HashMap hashMap2 = this.d;
                g5Var2.f22619k0 = hashMap;
                g5Var2.f22620l0 = hashMap2;
                return;
        }
    }
}
