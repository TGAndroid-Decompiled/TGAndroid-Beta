package org.telegram.messenger;

import java.util.HashMap;
public final class d5 implements Runnable {
    public final int f15296a;
    public final i5 f15297b;
    public final HashMap f15298c;
    public final HashMap d;

    public d5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f15296a = i10;
        this.f15297b = i5Var;
        this.f15298c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f15296a) {
            case 0:
                i5 i5Var = this.f15297b;
                Utilities.e.c(new d5(i5Var, this.f15298c, this.d, 1));
                if (!i5Var.e) {
                    i5Var.e = true;
                    is messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f16331a.c(new lr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f15297b;
                HashMap hashMap = this.f15298c;
                HashMap hashMap2 = this.d;
                i5Var2.f16225k0 = hashMap;
                i5Var2.f16226l0 = hashMap2;
                return;
        }
    }
}
