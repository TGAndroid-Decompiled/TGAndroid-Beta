package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23194a;
    public final i5 f23195b;
    public final HashMap f23196c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23194a = i7;
        this.f23195b = i5Var;
        this.f23196c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23194a) {
            case 0:
                i5 i5Var = this.f23195b;
                Utilities.f22774e.c(new c5(i5Var, this.f23196c, this.d, 1));
                if (!i5Var.f24566e) {
                    i5Var.f24566e = true;
                    ur messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27214a.c(new zq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23195b;
                HashMap hashMap = this.f23196c;
                HashMap hashMap2 = this.d;
                i5Var2.f24575l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
