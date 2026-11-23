package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23230a;
    public final i5 f23231b;
    public final HashMap f23232c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23230a = i7;
        this.f23231b = i5Var;
        this.f23232c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23230a) {
            case 0:
                i5 i5Var = this.f23231b;
                Utilities.f22810e.c(new c5(i5Var, this.f23232c, this.d, 1));
                if (!i5Var.f24602e) {
                    i5Var.f24602e = true;
                    ur messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27250a.c(new zq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23231b;
                HashMap hashMap = this.f23232c;
                HashMap hashMap2 = this.d;
                i5Var2.f24611l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
