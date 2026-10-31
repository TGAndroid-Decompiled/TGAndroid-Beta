package org.telegram.messenger;

import java.util.HashMap;
public final class d5 implements Runnable {
    public final int f15181a;
    public final i5 f15182b;
    public final HashMap f15183c;
    public final HashMap d;

    public d5(i5 i5Var, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f15181a = i10;
        this.f15182b = i5Var;
        this.f15183c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f15181a) {
            case 0:
                i5 i5Var = this.f15182b;
                Utilities.e.c(new d5(i5Var, this.f15183c, this.d, 1));
                if (!i5Var.e) {
                    i5Var.e = true;
                    hs messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.f15938a.c(new kr(messagesStorage, false, 0));
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f15182b;
                HashMap hashMap = this.f15183c;
                HashMap hashMap2 = this.d;
                i5Var2.f16072k0 = hashMap;
                i5Var2.f16073l0 = hashMap2;
                return;
        }
    }
}
