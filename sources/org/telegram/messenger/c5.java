package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23288a;
    public final i5 f23289b;
    public final HashMap f23290c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23288a = i7;
        this.f23289b = i5Var;
        this.f23290c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23288a) {
            case 0:
                i5 i5Var = this.f23289b;
                Utilities.f22807e.c(new c5(i5Var, this.f23290c, this.d, 1));
                if (!i5Var.f24592e) {
                    i5Var.f24592e = true;
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27080a.c(new yq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23289b;
                HashMap hashMap = this.f23290c;
                HashMap hashMap2 = this.d;
                i5Var2.f24601l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
