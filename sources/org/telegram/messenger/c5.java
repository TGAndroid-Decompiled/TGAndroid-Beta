package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23378a;
    public final i5 f23379b;
    public final HashMap f23380c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23378a = i7;
        this.f23379b = i5Var;
        this.f23380c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23378a) {
            case 0:
                i5 i5Var = this.f23379b;
                Utilities.f22877e.c(new c5(i5Var, this.f23380c, this.d, 1));
                if (!i5Var.f24690e) {
                    i5Var.f24690e = true;
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27149a.c(new yq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23379b;
                HashMap hashMap = this.f23380c;
                HashMap hashMap2 = this.d;
                i5Var2.f24699l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
