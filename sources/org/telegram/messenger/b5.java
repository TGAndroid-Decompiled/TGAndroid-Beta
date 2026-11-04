package org.telegram.messenger;

import java.util.HashMap;
public final class b5 implements Runnable {
    public final int f21739a;
    public final g5 f21740b;
    public final HashMap f21741c;
    public final HashMap d;

    public b5(g5 g5Var, HashMap hashMap, HashMap hashMap2, int i3) {
        this.f21739a = i3;
        this.f21740b = g5Var;
        this.f21741c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21739a) {
            case 0:
                g5 g5Var = this.f21740b;
                Utilities.f21387e.c(new b5(g5Var, this.f21741c, this.d, 1));
                if (!g5Var.f22650e) {
                    g5Var.f22650e = true;
                    qr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.f24934a.c(new vq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                g5 g5Var2 = this.f21740b;
                HashMap hashMap = this.f21741c;
                HashMap hashMap2 = this.d;
                g5Var2.f22659l0 = hashMap;
                g5Var2.m0 = hashMap2;
                return;
        }
    }
}
