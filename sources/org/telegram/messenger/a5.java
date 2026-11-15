package org.telegram.messenger;

import java.util.HashMap;
public final class a5 implements Runnable {
    public final int f22461a;
    public final g5 f22462b;
    public final HashMap f22463c;
    public final HashMap d;

    public a5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f22461a = i7;
        this.f22462b = g5Var;
        this.f22463c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f22461a) {
            case 0:
                g5 g5Var = this.f22462b;
                Utilities.f22416e.c(new a5(g5Var, this.f22463c, this.d, 1));
                if (!g5Var.f23676e) {
                    g5Var.f23676e = true;
                    vr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f27220a.c(new ar(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f22462b;
                HashMap hashMap = this.f22463c;
                HashMap hashMap2 = this.d;
                g5Var2.f23685l0 = hashMap;
                g5Var2.m0 = hashMap2;
                return;
        }
    }
}
