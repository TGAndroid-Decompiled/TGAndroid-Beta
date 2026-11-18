package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23260a;
    public final i5 f23261b;
    public final HashMap f23262c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23260a = i7;
        this.f23261b = i5Var;
        this.f23262c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23260a) {
            case 0:
                i5 i5Var = this.f23261b;
                Utilities.f22779e.c(new c5(i5Var, this.f23262c, this.d, 1));
                if (!i5Var.f24564e) {
                    i5Var.f24564e = true;
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27052a.c(new yq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23261b;
                HashMap hashMap = this.f23262c;
                HashMap hashMap2 = this.d;
                i5Var2.f24573l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
