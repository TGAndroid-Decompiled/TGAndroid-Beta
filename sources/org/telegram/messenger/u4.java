package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class u4 implements Runnable {
    public final int f26777a;
    public final g5 f26778b;
    public final HashMap f26779c;
    public final ArrayList d;
    public final HashMap f26780e;

    public u4(g5 g5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f26777a = 4;
        this.f26778b = g5Var;
        this.d = arrayList;
        this.f26779c = hashMap;
        this.f26780e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f26777a) {
            case 0:
                HashMap hashMap = this.f26780e;
                g5 g5Var = this.f26778b;
                g5Var.E(this.f26779c, this.d, hashMap, true);
                g5Var.N();
                g5Var.getNotificationCenter().k(25, new Object[0]);
                g5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f26780e;
                g5 g5Var2 = this.f26778b;
                g5Var2.E(this.f26779c, this.d, hashMap2, true);
                g5Var2.N();
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                g5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f26778b.E(this.f26779c, this.d, this.f26780e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f26780e;
                g5 g5Var3 = this.f26778b;
                g5Var3.E(this.f26779c, this.d, hashMap3, true);
                g5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                g5 g5Var4 = this.f26778b;
                g5Var4.f23675d0 = this.d;
                g5Var4.f23677e0 = this.f26779c;
                g5Var4.f23674c0 = this.f26780e;
                return;
        }
    }

    public u4(g5 g5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f26777a = i7;
        this.f26778b = g5Var;
        this.f26779c = hashMap;
        this.d = arrayList;
        this.f26780e = hashMap2;
    }
}
