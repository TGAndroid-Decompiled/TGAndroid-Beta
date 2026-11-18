package org.telegram.messenger;

import java.util.HashMap;
public final class c5 implements Runnable {
    public final int f23263a;
    public final i5 f23264b;
    public final HashMap f23265c;
    public final HashMap d;

    public c5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i7) {
        this.f23263a = i7;
        this.f23264b = i5Var;
        this.f23265c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f23263a) {
            case 0:
                i5 i5Var = this.f23264b;
                Utilities.f22782e.c(new c5(i5Var, this.f23265c, this.d, 1));
                if (!i5Var.f24567e) {
                    i5Var.f24567e = true;
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f27054a.c(new yq(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f23264b;
                HashMap hashMap = this.f23265c;
                HashMap hashMap2 = this.d;
                i5Var2.f24576l0 = hashMap;
                i5Var2.m0 = hashMap2;
                return;
        }
    }
}
